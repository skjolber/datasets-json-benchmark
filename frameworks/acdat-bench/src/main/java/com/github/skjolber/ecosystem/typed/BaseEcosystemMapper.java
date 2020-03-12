package com.github.skjolber.ecosystem.typed;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;

import org.apache.commons.lang3.StringUtils;
import org.owasp.dependencycheck.analyzer.CMakeAnalyzer;
import org.owasp.dependencycheck.analyzer.ComposerLockAnalyzer;
import org.owasp.dependencycheck.analyzer.JarAnalyzer;

import com.hankcs.algorithm.AhoCorasickDoubleArrayTrie;

public class BaseEcosystemMapper implements Function<String, String> {

	// static fields for thread-safe + hardcoded functionality
	protected static final String[] ecosystems;
	protected static final int[] hintToEcosystemMapper;
	protected static final int filesExtensionHintsCount;
	protected static final EcosystemHint[] hints;

	static {
		
		FileExtensionHint[] fileExtensionHints = FileExtensionHint.values();
		KeywordHint[] keywordHints = KeywordHint.values();

		filesExtensionHintsCount = fileExtensionHints.length;

		hints = new EcosystemHint[fileExtensionHints.length + keywordHints.length];
		System.arraycopy(fileExtensionHints, 0, hints, 0, fileExtensionHints.length);		
		System.arraycopy(keywordHints, 0, hints, fileExtensionHints.length, keywordHints.length);
		
		Map<String, Integer> ecosystemScoreIndexes = new HashMap<>();
		List<String> ecosystemList = new ArrayList<>();
		for (EcosystemHint ecosystemHint : hints) {
			if(!ecosystemScoreIndexes.containsKey(ecosystemHint.getEcosystem())) {
				ecosystemScoreIndexes.put(ecosystemHint.getEcosystem(), ecosystemScoreIndexes.size());
				
				ecosystemList.add(ecosystemHint.getEcosystem());
			}
		}
		
		ecosystems = ecosystemList.toArray(new String[ecosystemList.size()]);

		hintToEcosystemMapper = new int[hints.length];
		for(int i = 0; i < hints.length; i++) {
			hintToEcosystemMapper[i] = ecosystemScoreIndexes.get(hints[i].getEcosystem());
		}
	}

	protected final int[] values;
	protected final AhoCorasickDoubleArrayTrie<Integer> ahoCorasickDoubleArrayTrie;

	public BaseEcosystemMapper() {
		values = new int[ecosystems.length];
		ahoCorasickDoubleArrayTrie = toAhoCorasickDoubleArrayTrie();
	}
	
	public EcosystemHint getHint(int i) {
		return hints[i];
	}
	
	public void increment(int i) {
		values[hintToEcosystemMapper[i]]++;
	}
	
	public void reset() {
		for(int i = 0; i < values.length; i++) {
			values[i] = 0;
		}
	}
	
	public int getFilesExtensionCount() {
		return filesExtensionHintsCount;
	}
	
	protected static AhoCorasickDoubleArrayTrie<Integer> toAhoCorasickDoubleArrayTrie() {
		TreeMap<String, Integer> exactMap = new TreeMap<String, Integer>();
        for(int i = 0; i < hints.length; i++) {
            exactMap.put(hints[i].getValue(), i);
        }
        // Build an AhoCorasickDoubleArrayTrie
        AhoCorasickDoubleArrayTrie<Integer> exact = new AhoCorasickDoubleArrayTrie<>();
        exact.build(exactMap);
		return exact;
	}
	
	public String apply(String multicase) {
		String c = multicase.toLowerCase();

		ahoCorasickDoubleArrayTrie.parseText(c, (begin, end, value) -> {
			if(value < filesExtensionHintsCount) {
				if(!isExtension(multicase, begin, end)) {
					return;
				}
				
				String ecosystem = getEcosystem(value);
				// real extension, if not part of url
				if(ecosystem == ComposerLockAnalyzer.DEPENDENCY_ECOSYSTEM && c.regionMatches(begin, ".php", 0, 4)) {
					if(isURL(c, begin)) {
						return;
					}
				} else if(ecosystem == JarAnalyzer.DEPENDENCY_ECOSYSTEM && c.regionMatches(begin, ".jsp", 0, 4)) {
					if(isURL(c, begin)) {
						return;
					}
				}
				
			} else {
				String ecosystem = getEcosystem(value);
				if(ecosystem == CMakeAnalyzer.DEPENDENCY_ECOSYSTEM) { // TODO could be checked afterwards
					if(StringUtils.contains(c, "android")) {
						return;
					}
				}
			}
			increment(value);
		});

		int best = getBestScoreAndReset();

		if(best != -1) {
			return ecosystems[best];
		}

		return null;
	}

	private int getBestScoreAndReset() {
		int best = -1;
		int bestScore = -1;
		for(int i = 0; i < values.length; i++) {
			if(values[i] > 0) {
				if(values[i] > bestScore) {
					best = i;
					bestScore = values[i];
				}
				values[i] = 0;
			}
		}
		return best;
	}

	private String getEcosystem(Integer value) {
		return ecosystems[hintToEcosystemMapper[value]];
	}
	

	protected static boolean isExtension(String str, int begin, int end) {
		if(str.length() != end && Character.isLetterOrDigit(str.charAt(end))) {
			return false;
		}
		
		return isLowercaseAscii(str, begin + 1, end);
	}
	
	protected static boolean isLowercaseAscii(String multicase, int start, int end) {
		for(int i = start; i < end; i++) {
			char c = multicase.charAt(i);
			
			if(c < 'a' || c > 'z') {
				return false;
			}
		}
		return true;
	}

	public static boolean isURL(String c, int begin) {
		begin -= 2;

		while(begin > 2) {
			begin--;

			if(c.charAt(begin) == ' ') {
				return false;
			}
			if(c.charAt(begin) == ':') {
				return c.charAt(begin + 1) == '/' && c.charAt(begin + 2) == '/';
			}
		}

		return false;
	}	

}
