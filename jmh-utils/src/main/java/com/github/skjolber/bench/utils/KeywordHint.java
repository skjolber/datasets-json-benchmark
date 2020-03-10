package com.github.skjolber.bench.utils;

import org.owasp.dependencycheck.analyzer.AbstractNpmAnalyzer;
import org.owasp.dependencycheck.analyzer.CMakeAnalyzer;
import org.owasp.dependencycheck.analyzer.ComposerLockAnalyzer;
import org.owasp.dependencycheck.analyzer.JarAnalyzer;
import org.owasp.dependencycheck.analyzer.PythonPackageAnalyzer;
import org.owasp.dependencycheck.analyzer.RubyBundleAuditAnalyzer;

public enum KeywordHint implements EcosystemHint{

    NPM(" npm ", AbstractNpmAnalyzer.NPM_DEPENDENCY_ECOSYSTEM),
	NODEJS(" node.js", AbstractNpmAnalyzer.NPM_DEPENDENCY_ECOSYSTEM),
    GRAILS(" grails ", JarAnalyzer.DEPENDENCY_ECOSYSTEM),
    RUBY_GEM("ruby gem", RubyBundleAuditAnalyzer.DEPENDENCY_ECOSYSTEM),
    DJANGO("django", PythonPackageAnalyzer.DEPENDENCY_ECOSYSTEM),
    BUFFER_OVERFLOW("buffer overflow", CMakeAnalyzer.DEPENDENCY_ECOSYSTEM),
    WORDPRESS("wordpress", ComposerLockAnalyzer.DEPENDENCY_ECOSYSTEM),
    DRUPAL("drupal", ComposerLockAnalyzer.DEPENDENCY_ECOSYSTEM),
    JOOMLA("joomla", ComposerLockAnalyzer.DEPENDENCY_ECOSYSTEM),
    MOODLE("moodle", ComposerLockAnalyzer.DEPENDENCY_ECOSYSTEM),
    TYPO3("typo3", ComposerLockAnalyzer.DEPENDENCY_ECOSYSTEM);
            
    private final String keyword;
    
    private final String ecosystem;
    
    private KeywordHint(String keyword, String ecosystem) {
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
