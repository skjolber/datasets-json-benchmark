package com.github.skjolber.ecosystem.hint.url;

import org.owasp.dependencycheck.analyzer.NodeAuditAnalyzer;
import org.owasp.dependencycheck.analyzer.PythonPackageAnalyzer;
import org.owasp.dependencycheck.analyzer.RubyGemspecAnalyzer;

import com.github.skjolber.ecosystem.hint.EcosystemHint;
import com.github.skjolber.ecosystem.hint.EcosystemHintNature;

public enum UrlHostHint implements EcosystemHint {

	// note: all must be lowercase
	RUBY("ruby-lang.org", RubyGemspecAnalyzer.DEPENDENCY_ECOSYSTEM),
	PYTHON("python.org", PythonPackageAnalyzer.DEPENDENCY_ECOSYSTEM),
	DRUPAL("drupal.org", PythonPackageAnalyzer.DEPENDENCY_ECOSYSTEM),
	NODEJS("nodejs.org", NodeAuditAnalyzer.DEPENDENCY_ECOSYSTEM),
	NODE_SECURITY("nodesecurity.io", NodeAuditAnalyzer.DEPENDENCY_ECOSYSTEM);
	
    private final String keyword;
    
    private final String ecosystem;
    
    private UrlHostHint(String keyword, String ecosystem) {
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
		return EcosystemHintNature.URL_HOST;
	}
	
	@Override
	public String getValue() {
		return getKeyword();
	}
    
}
