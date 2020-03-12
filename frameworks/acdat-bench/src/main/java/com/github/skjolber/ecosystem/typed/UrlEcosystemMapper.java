package com.github.skjolber.ecosystem.typed;

import java.util.TreeMap;
import java.util.function.Function;

import org.nvd.json.jackson.DefCveItem;
import org.nvd.json.jackson.Reference;

import com.github.skjolber.bench.utils.ReturnResultAhoCorasickDoubleArrayTrie;

public class UrlEcosystemMapper implements Function<DefCveItem, String> {

	protected static final EcosystemHint[] hints;

	static {
		hints = UrlHint.values();
	}
	
	protected ReturnResultAhoCorasickDoubleArrayTrie<String> search;
	
	public UrlEcosystemMapper() {
		TreeMap<String, String> map = new TreeMap<String, String>();

        for(int i = 0; i < hints.length; i++) {
            map.put(hints[i].getValue(), hints[i].getEcosystem());
        }
		
        search = new ReturnResultAhoCorasickDoubleArrayTrie<String>();
        search.build(map);
	}

	@Override
	public String apply(DefCveItem cve) {
		for (Reference r : cve.getCve().getReferences().getReferenceData()) {
			String ecosystem = search.parseTextForResult(r.getUrl(), (begin, end, value) -> {
				return true;
			});
			if(ecosystem != null) {
				return ecosystem;
			}
		}	
		return null;
	}
}
