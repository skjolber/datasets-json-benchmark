package com.github.skjolber.ecosystem.hint.url;

import java.util.TreeMap;
import java.util.function.Function;

import org.nvd.json.jackson.DefCveItem;
import org.nvd.json.jackson.Reference;

import com.hankcs.algorithm.AhoCorasickDoubleArrayTrie;
import com.hankcs.algorithm.AhoCorasickDoubleArrayTrie.Hit;

public class UrlEcosystemMapper implements Function<DefCveItem, String> {

	protected static final TreeMap<String, String> map;

	static {
		map = new TreeMap<String, String>();
		for(UrlHostHint urlHostHint : UrlHostHint.values()) {
			map.put(urlHostHint.getValue(), urlHostHint.getEcosystem());
		}
		for(UrlPathHint urlPathHint : UrlPathHint.values()) {
			map.put(urlPathHint.getValue(), urlPathHint.getEcosystem());
		}
	}
	
	protected AhoCorasickDoubleArrayTrie<String> search;
	
	public UrlEcosystemMapper() {
        search = new AhoCorasickDoubleArrayTrie<String>();
        search.build(map);
	}

	@Override
	public String apply(DefCveItem cve) {
		for (Reference r : cve.getCve().getReferences().getReferenceData()) {
			
			Hit<String> ecosystem = search.findFirst(r.getUrl());
			if(ecosystem != null) {
				return ecosystem.value;
			}
		}	
		return null;
	}
}
