package com.github.skjolber.ecosystem.hint.url;

import java.util.TreeMap;
import java.util.function.Function;

import org.nvd.json.jackson.DefCveItem;
import org.nvd.json.jackson.Reference;

import com.github.skjolber.ecosystem.hint.EcosystemHint;
import com.hankcs.algorithm.AhoCorasickDoubleArrayTrie;
import com.hankcs.algorithm.AhoCorasickDoubleArrayTrie.Hit;

public class UrlEcosystemMapper implements Function<DefCveItem, String> {

	protected static final EcosystemHint[] hints;

	static {
		UrlHostHint[] hostHints = UrlHostHint.values();
		UrlPathHint[] pathHints = UrlPathHint.values();

		hints = new EcosystemHint[hostHints.length + pathHints.length];
		System.arraycopy(hostHints, 0, hints, 0, hostHints.length);		
		System.arraycopy(pathHints, 0, hints, hostHints.length, pathHints.length);
	}
	
	protected AhoCorasickDoubleArrayTrie<String> search;
	
	public UrlEcosystemMapper() {
		TreeMap<String, String> map = new TreeMap<String, String>();

        for(int i = 0; i < hints.length; i++) {
            map.put(hints[i].getValue(), hints[i].getEcosystem());
        }
		
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
