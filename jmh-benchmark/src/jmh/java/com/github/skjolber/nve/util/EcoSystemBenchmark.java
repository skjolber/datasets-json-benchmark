package com.github.skjolber.nve.util;

import java.util.List;
import java.util.TreeMap;

import org.apache.commons.lang3.StringUtils;
import org.openjdk.jmh.annotations.Benchmark;
import org.owasp.dependencycheck.analyzer.AbstractNpmAnalyzer;
import org.owasp.dependencycheck.analyzer.CMakeAnalyzer;
import org.owasp.dependencycheck.analyzer.ComposerLockAnalyzer;
import org.owasp.dependencycheck.analyzer.JarAnalyzer;
import org.owasp.dependencycheck.analyzer.PythonPackageAnalyzer;
import org.owasp.dependencycheck.analyzer.RubyBundleAuditAnalyzer;

import com.hankcs.algorithm.AhoCorasickDoubleArrayTrie;

public class EcoSystemBenchmark {

	@Benchmark
    public long classic(EcoSystemBenchmarkState state) throws Exception {
		List<String> content = state.getContent();
		
		long result = 0;
		
		for(String c : content) {
			String ecosystem = determineBaseEcosystem(c);
			if(ecosystem != null) {
				result += 1;
			}
		}
		System.out.println("Classic got " + result);

		return result;
	}
	
	@Benchmark
    public long ahoCorasickDoubleArrayTrie(EcoSystemBenchmarkState state) throws Exception {
		// Collect test data set
        AhoCorasickDoubleArrayTrie<CharSequence> exact = getExact();
		
        long[] result = new long[] {0};
        
		List<String> content = state.getContent();
		
		for(String multicase : content) {
			String c = multicase.toLowerCase();
			
			long before = result[0];
			exact.parseText(c, (begin, end, value) -> {
            	if(c.charAt(begin) == '.') {
	            	if(c.length() == end || !Character.isLetterOrDigit(c.charAt(end))) {
	            		result[0]++;
	            		
	                    return false;
	            	}
	            	return true;
            	} else {
            		if("buffer overflow" == value) {
            			if(StringUtils.containsIgnoreCase(c, "android")) {
            				return true;
            			}
            		}
            	}
        		result[0]++;

                return false;
		            
		        }
			);
			
			/*
			String ecosystem = determineBaseEcosystem(c);
			if(ecosystem != null && result[0] == before) {
				System.out.println("No luck for " + c + " is " + ecosystem);
			} else if(ecosystem == null && result[0] != before) {
				System.out.println("Less luck for " + c + " is " + ecosystem);
			}
			*/
		}
		System.out.println("New got " + result[0]);
		return result[0];
	}

	private AhoCorasickDoubleArrayTrie<CharSequence> getExact() {
		TreeMap<String, CharSequence> exactMap = new TreeMap<String, CharSequence>();
        String[] exactArray = new String[]
                {
                        ".php",
                        " npm ",
                        " node.js",
                        ".pm",
                        ".pl",
                        ".java",
                        ".jsp",
                        " grails ",
                        ".rb",
                        "ruby gem",
                        ".py",
                        "django",
                        "buffer overflow",
                        ".cpp",
                        ".c",
                        ".h",
	                    "wordpress",
	                    "drupal",
	                    "joomla",
	                    "moodle",
	                    "typo3"        		
                        
                };
        for (String key : exactArray) {
            exactMap.put(key, key);
        }
        // Build an AhoCorasickDoubleArrayTrie
        AhoCorasickDoubleArrayTrie<CharSequence> exact = new AhoCorasickDoubleArrayTrie<CharSequence>();
        exact.build(exactMap);
		return exact;
	}	
	
    private String determineBaseEcosystem(String description) {
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
 
	
}
