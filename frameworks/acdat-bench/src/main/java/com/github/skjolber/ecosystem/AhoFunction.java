package com.github.skjolber.ecosystem;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import org.apache.commons.lang3.StringUtils;
import org.owasp.dependencycheck.analyzer.AbstractNpmAnalyzer;
import org.owasp.dependencycheck.analyzer.CMakeAnalyzer;
import org.owasp.dependencycheck.analyzer.ComposerLockAnalyzer;
import org.owasp.dependencycheck.analyzer.JarAnalyzer;
import org.owasp.dependencycheck.analyzer.PythonPackageAnalyzer;
import org.owasp.dependencycheck.analyzer.RubyBundleAuditAnalyzer;

import com.github.skjolber.bench.utils.EcoSystemGenerator;
import com.hankcs.algorithm.AhoCorasickDoubleArrayTrie;

public class AhoFunction implements Function<String, String> {

	private AhoCorasickDoubleArrayTrie<Integer> exact;
	private int[] score;
	private List<String> systems;
	
	public AhoFunction() {
		List<String> systems = new ArrayList<>();
		systems.add(ComposerLockAnalyzer.DEPENDENCY_ECOSYSTEM);
		systems.add(AbstractNpmAnalyzer.NPM_DEPENDENCY_ECOSYSTEM);
		systems.add("perl");
		systems.add(JarAnalyzer.DEPENDENCY_ECOSYSTEM);
		systems.add(RubyBundleAuditAnalyzer.DEPENDENCY_ECOSYSTEM);
		systems.add(PythonPackageAnalyzer.DEPENDENCY_ECOSYSTEM);
		systems.add(CMakeAnalyzer.DEPENDENCY_ECOSYSTEM);
		
		this.systems = systems;
		this.score = new int[systems.size()];
		this.exact = EcoSystemGenerator.getDescriptionSearchByIndex(systems);
	}
	
	@Override
	public String apply(String multicase) {
		String c = multicase.toLowerCase();

		exact.parseText(c, (begin, end, value) -> {
			if(c.charAt(begin) == '.') {
				if(!isExtension(multicase, begin, end)) {
					return;
				}
				// real extension, if not part of url
				if(systems.get(value) == ComposerLockAnalyzer.DEPENDENCY_ECOSYSTEM && c.regionMatches(begin, ".php", 0, 4)) {
					if(isURL(c, begin)) {
						return;
					}
				} else if(systems.get(value) == JarAnalyzer.DEPENDENCY_ECOSYSTEM && c.regionMatches(begin, ".jsp", 0, 4)) {
					if(isURL(c, begin)) {
						return;
					}
				}
			} else {
				if(CMakeAnalyzer.DEPENDENCY_ECOSYSTEM == systems.get(value)) {
					if(StringUtils.contains(c, "android")) {
						return;
					}
				}
			}
			score[value]++;
		});

		int best = -1;
		int bestScore = -1;
		for(int i = 0; i < score.length; i++) {
			if(score[i] > 0) {
				System.out.println("Sum " + + score[i] + " " + systems.get(i));
				if(score[i] > bestScore) {
					best = i;
					bestScore = score[i];
				}
				score[i] = 0;
			}
		}

		if(best != -1) {
			return systems.get(best);
		}

		return null;
	}
	
	private boolean isExtension(String str, int begin, int end) {
		if(str.length() != end && Character.isLetterOrDigit(str.charAt(end))) {
			return false;
		}
		
		return isLowercaseAscii(str, begin + 1, end);
	}
	
	private boolean isLowercaseAscii(String multicase, int start, int end) {
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
