package com.github.skjolber.ecosystem.typed;

import org.owasp.dependencycheck.analyzer.AbstractNpmAnalyzer;
import org.owasp.dependencycheck.analyzer.NodeAuditAnalyzer;
import org.owasp.dependencycheck.analyzer.PythonPackageAnalyzer;
import org.owasp.dependencycheck.analyzer.RubyGemspecAnalyzer;

public enum UrlHint implements EcosystemHint {

	// note: all must be lowercase
    ELIXIR("elixir-security-advisories", "elixir"),
	RUBY("ruby-lang.org", RubyGemspecAnalyzer.DEPENDENCY_ECOSYSTEM),
	PYTHON("python.org", PythonPackageAnalyzer.DEPENDENCY_ECOSYSTEM),
	DRUPAL("drupal.org", PythonPackageAnalyzer.DEPENDENCY_ECOSYSTEM),
	NPM("npm", AbstractNpmAnalyzer.NPM_DEPENDENCY_ECOSYSTEM),
	NODEJS("nodejs.org", NodeAuditAnalyzer.DEPENDENCY_ECOSYSTEM),
	NODE_SECURITY("nodesecurity.io", NodeAuditAnalyzer.DEPENDENCY_ECOSYSTEM);
	
    private final String keyword;
    
    private final String ecosystem;
    
    private UrlHint(String keyword, String ecosystem) {
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
		return EcosystemHintNature.KEYWORD;
	}
	
	@Override
	public String getValue() {
		return getKeyword();
	}
    
}
