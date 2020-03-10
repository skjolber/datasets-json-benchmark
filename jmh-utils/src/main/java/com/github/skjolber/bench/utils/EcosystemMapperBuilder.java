package com.github.skjolber.bench.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import com.hankcs.algorithm.AhoCorasickDoubleArrayTrie;

public class EcosystemMapperBuilder {

	// make most of this static
	
	private List<String> ecosystems;

	private int[] values;
	
	private int[] hintToEcosystemMapper;
	
	private int filesExtensionHintsCount;
	private List<EcosystemHint> hints;
	
	public EcosystemMapperBuilder() {
		
		Map<String, Integer> scores = new HashMap<>();

		ecosystems = new ArrayList<>();
		
		hints = new ArrayList<>();
		for (EcosystemHint ecosystemHint : FileExtensionHint.values()) {
			if(!scores.containsKey(ecosystemHint.getEcosystem())) {
				scores.put(ecosystemHint.getEcosystem(), scores.size());
				
				ecosystems.add(ecosystemHint.getEcosystem());
			}
			hints.add(ecosystemHint);
		}
		
		filesExtensionHintsCount = hints.size();
		
		for (EcosystemHint ecosystemHint : KeywordHint.values()) {
			if(!scores.containsKey(ecosystemHint.getEcosystem())) {
				scores.put(ecosystemHint.getEcosystem(), scores.size());
				
				ecosystems.add(ecosystemHint.getEcosystem());
			}
			hints.add(ecosystemHint);
		}

		hintToEcosystemMapper = new int[hints.size()];
		for(int i = 0; i < hints.size(); i++) {
			hintToEcosystemMapper[i] = scores.get(hints.get(i).getEcosystem());
		}
	}
	
	public EcosystemHint getHint(int i) {
		return hints.get(i);
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
	
	public AhoCorasickDoubleArrayTrie<Integer> toAhoCorasickDoubleArrayTrie() {
		TreeMap<String, Integer> exactMap = new TreeMap<String, Integer>();
        for(int i = 0; i < hints.size(); i++) {
            exactMap.put(hints.get(i).getValue(), i);
        }
        // Build an AhoCorasickDoubleArrayTrie
        AhoCorasickDoubleArrayTrie<Integer> exact = new AhoCorasickDoubleArrayTrie<>();
        exact.build(exactMap);
		return exact;
	}
	
	public String getEcosystem() {
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

		if(best != -1) {
			return ecosystems.get(best);
		}

		return null;		
	}
}
