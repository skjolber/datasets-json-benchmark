package com.github.skjolber.bench.utils;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.apache.commons.lang3.StringUtils;
import org.owasp.dependencycheck.analyzer.AbstractNpmAnalyzer;
import org.owasp.dependencycheck.analyzer.CMakeAnalyzer;
import org.owasp.dependencycheck.analyzer.ComposerLockAnalyzer;
import org.owasp.dependencycheck.analyzer.JarAnalyzer;
import org.owasp.dependencycheck.analyzer.NodeAuditAnalyzer;
import org.owasp.dependencycheck.analyzer.PythonPackageAnalyzer;
import org.owasp.dependencycheck.analyzer.RubyBundleAuditAnalyzer;
import org.owasp.dependencycheck.analyzer.RubyGemspecAnalyzer;

import com.hankcs.algorithm.AhoCorasickDoubleArrayTrie;

public class EcoSystemGenerator {

    public static String determineBaseEcosystem(String description) {
        if (description == null) {
            return null;
        }
        int idx = StringUtils.indexOfIgnoreCase(description, ".php");
        if ((idx > 0 && (idx + 4 == description.length() || !Character.isLetterOrDigit(description.charAt(idx + 4))))
                || StringUtils.containsIgnoreCase(description, "wordpress")
                || StringUtils.containsIgnoreCase(description, "drupal")
                || StringUtils.containsIgnoreCase(description, "joomla")
                || StringUtils.containsIgnoreCase(description, "moodle")
                || StringUtils.containsIgnoreCase(description, "typo3")) {
            return ComposerLockAnalyzer.DEPENDENCY_ECOSYSTEM;
        }
        if (StringUtils.containsIgnoreCase(description, " npm ")
                || StringUtils.containsIgnoreCase(description, " node.js")) {
            return AbstractNpmAnalyzer.NPM_DEPENDENCY_ECOSYSTEM;
        }
        idx = StringUtils.indexOfIgnoreCase(description, ".pm");
        if (idx > 0 && (idx + 3 == description.length() || !Character.isLetterOrDigit(description.charAt(idx + 3)))) {
            return "perl";
        } else {
            idx = StringUtils.indexOfIgnoreCase(description, ".pl");
            if (idx > 0 && (idx + 3 == description.length() || !Character.isLetterOrDigit(description.charAt(idx + 3)))) {
                return "perl";
            }
        }
        idx = StringUtils.indexOfIgnoreCase(description, ".java");
        if (idx > 0 && (idx + 5 == description.length() || !Character.isLetterOrDigit(description.charAt(idx + 5)))) {
            return JarAnalyzer.DEPENDENCY_ECOSYSTEM;
        } else {
            idx = StringUtils.indexOfIgnoreCase(description, ".jsp");
            if (idx > 0 && (idx + 4 == description.length() || !Character.isLetterOrDigit(description.charAt(idx + 4)))) {
                return JarAnalyzer.DEPENDENCY_ECOSYSTEM;
            }
        }
        if (StringUtils.containsIgnoreCase(description, " grails ")) {
            return JarAnalyzer.DEPENDENCY_ECOSYSTEM;
        }

        idx = StringUtils.indexOfIgnoreCase(description, ".rb");
        if (idx > 0 && (idx + 3 == description.length() || !Character.isLetterOrDigit(description.charAt(idx + 3)))) {
            return RubyBundleAuditAnalyzer.DEPENDENCY_ECOSYSTEM;
        }
        if (StringUtils.containsIgnoreCase(description, "ruby gem")) {
            return RubyBundleAuditAnalyzer.DEPENDENCY_ECOSYSTEM;
        }

        idx = StringUtils.indexOfIgnoreCase(description, ".py");
        if ((idx > 0 && (idx + 3 == description.length() || !Character.isLetterOrDigit(description.charAt(idx + 3))))
                || StringUtils.containsIgnoreCase(description, "django")) {
            return PythonPackageAnalyzer.DEPENDENCY_ECOSYSTEM;
        }

        if (StringUtils.containsIgnoreCase(description, "buffer overflow")
                && !StringUtils.containsIgnoreCase(description, "android")) {
            return CMakeAnalyzer.DEPENDENCY_ECOSYSTEM;
        }
        idx = StringUtils.indexOfIgnoreCase(description, ".c");
        if (idx > 0 && (idx + 2 == description.length() || !Character.isLetterOrDigit(description.charAt(idx + 2)))) {
            return CMakeAnalyzer.DEPENDENCY_ECOSYSTEM;
        } else {
            idx = StringUtils.indexOfIgnoreCase(description, ".cpp");
            if (idx > 0 && (idx + 4 == description.length() || !Character.isLetterOrDigit(description.charAt(idx + 4)))) {
                return CMakeAnalyzer.DEPENDENCY_ECOSYSTEM;
            } else {
                idx = StringUtils.indexOfIgnoreCase(description, ".h");
                if (idx > 0 && (idx + 2 == description.length() || !Character.isLetterOrDigit(description.charAt(idx + 2)))) {
                    return CMakeAnalyzer.DEPENDENCY_ECOSYSTEM;
                }
            }
        }
        return null;
    }
 
	public static String getEcosystemFromReferenceData(String url) {
		if (url.contains("elixir-security-advisories")) {
		    return "elixir";
		} else if (url.contains("ruby-lang.org")) {
		    return RubyGemspecAnalyzer.DEPENDENCY_ECOSYSTEM;
		} else if (url.contains("python.org")) {
		    return PythonPackageAnalyzer.DEPENDENCY_ECOSYSTEM;
		} else if (url.contains("drupal.org")) {
		    return PythonPackageAnalyzer.DEPENDENCY_ECOSYSTEM;
		} else if (url.contains("npm")) {
		    return NodeAuditAnalyzer.DEPENDENCY_ECOSYSTEM;
		} else if (url.contains("nodejs.org")) {
		    return NodeAuditAnalyzer.DEPENDENCY_ECOSYSTEM;
		} else if (url.contains("nodesecurity.io")) {
		    return NodeAuditAnalyzer.DEPENDENCY_ECOSYSTEM;
		}
		return null;
	}    
	
	public static ReturnResultAhoCorasickDoubleArrayTrie<String> getDescriptionSearch() {
        String[] mappingsArray = new String[] {
                ".php", ComposerLockAnalyzer.DEPENDENCY_ECOSYSTEM,
                " npm ", AbstractNpmAnalyzer.NPM_DEPENDENCY_ECOSYSTEM,
                " node.js", AbstractNpmAnalyzer.NPM_DEPENDENCY_ECOSYSTEM,
                ".pm", "perl",
                ".pl", "perl",
                ".java", JarAnalyzer.DEPENDENCY_ECOSYSTEM,
                ".jsp", JarAnalyzer.DEPENDENCY_ECOSYSTEM,
                " grails ", JarAnalyzer.DEPENDENCY_ECOSYSTEM,
                ".rb", RubyBundleAuditAnalyzer.DEPENDENCY_ECOSYSTEM,
                "ruby gem", RubyBundleAuditAnalyzer.DEPENDENCY_ECOSYSTEM,
                ".py", PythonPackageAnalyzer.DEPENDENCY_ECOSYSTEM,
                "django", PythonPackageAnalyzer.DEPENDENCY_ECOSYSTEM,
                "buffer overflow", CMakeAnalyzer.DEPENDENCY_ECOSYSTEM,
                ".cpp", CMakeAnalyzer.DEPENDENCY_ECOSYSTEM,
                ".c", CMakeAnalyzer.DEPENDENCY_ECOSYSTEM,
                ".h", CMakeAnalyzer.DEPENDENCY_ECOSYSTEM,
                "wordpress", ComposerLockAnalyzer.DEPENDENCY_ECOSYSTEM,
                "drupal", ComposerLockAnalyzer.DEPENDENCY_ECOSYSTEM,
                "joomla", ComposerLockAnalyzer.DEPENDENCY_ECOSYSTEM,
                "moodle", ComposerLockAnalyzer.DEPENDENCY_ECOSYSTEM,
                "typo3", ComposerLockAnalyzer.DEPENDENCY_ECOSYSTEM,
        };
        
		TreeMap<String, String> exactMap = new TreeMap<String, String>();
        for(int i = 0; i < mappingsArray.length; i += 2) {
            exactMap.put(mappingsArray[i], mappingsArray[i + 1]);
        }
        // Build an AhoCorasickDoubleArrayTrie
        ReturnResultAhoCorasickDoubleArrayTrie<String> exact = new ReturnResultAhoCorasickDoubleArrayTrie<String>();
        exact.build(exactMap);
		return exact;
	}	
	
	public static ReturnResultAhoCorasickDoubleArrayTrie<String> getReferenceData() {
		TreeMap<String, String> exactMap = new TreeMap<String, String>();
        String[] mappingsArray = new String[] {
        		"elixir-security-advisories", "elixir",
		       "ruby-lang.org", RubyGemspecAnalyzer.DEPENDENCY_ECOSYSTEM,
		       "python.org", PythonPackageAnalyzer.DEPENDENCY_ECOSYSTEM,
		       "drupal.org", PythonPackageAnalyzer.DEPENDENCY_ECOSYSTEM,
		       "npm", NodeAuditAnalyzer.DEPENDENCY_ECOSYSTEM,
		       "nodejs.org", NodeAuditAnalyzer.DEPENDENCY_ECOSYSTEM,
		       "nodesecurity.io", NodeAuditAnalyzer.DEPENDENCY_ECOSYSTEM
        };
        for(int i = 0; i < mappingsArray.length; i += 2) {
            exactMap.put(mappingsArray[i], mappingsArray[i + 1]);
        }
        // Build an AhoCorasickDoubleArrayTrie
        ReturnResultAhoCorasickDoubleArrayTrie<String> exact = new ReturnResultAhoCorasickDoubleArrayTrie<String>();
        exact.build(exactMap);
		return exact;
	}	
	
	public static AhoCorasickDoubleArrayTrie<Integer> getDescriptionSearchByIndex(List<String> indexes) {
		
        String[] mappingsArray = new String[] {
                ".php", ComposerLockAnalyzer.DEPENDENCY_ECOSYSTEM,
                " npm ", AbstractNpmAnalyzer.NPM_DEPENDENCY_ECOSYSTEM,
                " node.js", AbstractNpmAnalyzer.NPM_DEPENDENCY_ECOSYSTEM,
                ".pm", "perl",
                ".pl", "perl",
                ".java", JarAnalyzer.DEPENDENCY_ECOSYSTEM,
                ".jsp", JarAnalyzer.DEPENDENCY_ECOSYSTEM,
                " grails ", JarAnalyzer.DEPENDENCY_ECOSYSTEM,
                ".rb", RubyBundleAuditAnalyzer.DEPENDENCY_ECOSYSTEM,
                "ruby gem", RubyBundleAuditAnalyzer.DEPENDENCY_ECOSYSTEM,
                ".py", PythonPackageAnalyzer.DEPENDENCY_ECOSYSTEM,
                "django", PythonPackageAnalyzer.DEPENDENCY_ECOSYSTEM,
                "buffer overflow", CMakeAnalyzer.DEPENDENCY_ECOSYSTEM,
                ".cpp", CMakeAnalyzer.DEPENDENCY_ECOSYSTEM,
                ".c", CMakeAnalyzer.DEPENDENCY_ECOSYSTEM,
                ".h", CMakeAnalyzer.DEPENDENCY_ECOSYSTEM,
                "wordpress", ComposerLockAnalyzer.DEPENDENCY_ECOSYSTEM,
                "drupal", ComposerLockAnalyzer.DEPENDENCY_ECOSYSTEM,
                "joomla", ComposerLockAnalyzer.DEPENDENCY_ECOSYSTEM,
                "moodle", ComposerLockAnalyzer.DEPENDENCY_ECOSYSTEM,
                "typo3", ComposerLockAnalyzer.DEPENDENCY_ECOSYSTEM,
        };
        
		TreeMap<String, Integer> exactMap = new TreeMap<String, Integer>();
        for(int i = 0; i < mappingsArray.length; i += 2) {
            exactMap.put(mappingsArray[i], indexes.indexOf(mappingsArray[i + 1]));
        }
        // Build an AhoCorasickDoubleArrayTrie
        AhoCorasickDoubleArrayTrie<Integer> exact = new AhoCorasickDoubleArrayTrie<>();
        exact.build(exactMap);
		return exact;
	}	
	
	public static void add(String key, Map<String, Long> map) {
		if(key == null) {
			key = "-";
		}
		Long frequency = map.get(key);
		if(frequency == null) {
			frequency = 1L;
		} else {
			frequency++;
		}
		map.put(key, frequency);		
	}
}
