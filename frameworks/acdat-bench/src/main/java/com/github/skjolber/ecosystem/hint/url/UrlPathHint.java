package com.github.skjolber.ecosystem.hint.url;

import org.owasp.dependencycheck.analyzer.AbstractNpmAnalyzer;

import com.github.skjolber.ecosystem.hint.EcosystemHint;
import com.github.skjolber.ecosystem.hint.EcosystemHintNature;

public enum UrlPathHint implements EcosystemHint {

	// note: all must be lowercase
    ELIXIR("elixir-security-advisories", "elixir"),
	NPM("npm", AbstractNpmAnalyzer.NPM_DEPENDENCY_ECOSYSTEM);
	
    private final String keyword;
    
    private final String ecosystem;
    
    private UrlPathHint(String keyword, String ecosystem) {
		this.keyword = keyword;
		this.ecosystem = ecosystem;
	}

    public String getEcosystem() {
		return ecosystem;
	}
    
    public String getKeyword() {
		return keyword;
	}

	@Override
	public EcosystemHintNature getNature() {
		return EcosystemHintNature.URL_PATH;
	}
	
	@Override
	public String getValue() {
		return getKeyword();
	}
    
}
