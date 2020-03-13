package com.github.skjolber.ecosystem.hint.description;

import org.owasp.dependencycheck.analyzer.AbstractNpmAnalyzer;
import org.owasp.dependencycheck.analyzer.CMakeAnalyzer;
import org.owasp.dependencycheck.analyzer.ComposerLockAnalyzer;
import org.owasp.dependencycheck.analyzer.JarAnalyzer;
import org.owasp.dependencycheck.analyzer.PythonPackageAnalyzer;
import org.owasp.dependencycheck.analyzer.RubyBundleAuditAnalyzer;

import com.github.skjolber.ecosystem.hint.EcosystemHint;
import com.github.skjolber.ecosystem.hint.EcosystemHintNature;

public enum DescriptionKeywordHint implements EcosystemHint {

	// note: all must be lowercase
    NPM("npm", AbstractNpmAnalyzer.NPM_DEPENDENCY_ECOSYSTEM),
	NODEJS("node.js", AbstractNpmAnalyzer.NPM_DEPENDENCY_ECOSYSTEM),
    GRAILS("grails", JarAnalyzer.DEPENDENCY_ECOSYSTEM),
    RUBY_GEM("ruby gem", RubyBundleAuditAnalyzer.DEPENDENCY_ECOSYSTEM),
    DJANGO("django", PythonPackageAnalyzer.DEPENDENCY_ECOSYSTEM),
    BUFFER_OVERFLOW("buffer overflow", CMakeAnalyzer.DEPENDENCY_ECOSYSTEM),
    BUFFER_OVERFLOWS("buffer overflows", CMakeAnalyzer.DEPENDENCY_ECOSYSTEM),
    WORDPRESS("wordpress", ComposerLockAnalyzer.DEPENDENCY_ECOSYSTEM),
    DRUPAL("drupal", ComposerLockAnalyzer.DEPENDENCY_ECOSYSTEM),
    JOOMLA("joomla", ComposerLockAnalyzer.DEPENDENCY_ECOSYSTEM),
    MOODLE("moodle", ComposerLockAnalyzer.DEPENDENCY_ECOSYSTEM),
    TYPO3("typo3", ComposerLockAnalyzer.DEPENDENCY_ECOSYSTEM),
    JAVA_SE("java se", JarAnalyzer.DEPENDENCY_ECOSYSTEM);
            
    private final String keyword;
    
    private final String ecosystem;
    
    private DescriptionKeywordHint(String keyword, String ecosystem) {
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
