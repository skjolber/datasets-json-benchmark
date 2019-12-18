package com.github.skjolber.nve;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.apache.commons.lang3.StringUtils;
import org.nvd.json.jackson.reduced.LangString;
import org.nvd.json.jackson.reduced.Reference;
import org.openjdk.jmh.annotations.Benchmark;
import org.owasp.dependencycheck.analyzer.CMakeAnalyzer;
import org.owasp.dependencycheck.analyzer.JarAnalyzer;
import org.owasp.dependencycheck.analyzer.NodeAuditAnalyzer;
import org.owasp.dependencycheck.analyzer.PythonPackageAnalyzer;
import org.owasp.dependencycheck.analyzer.RubyGemspecAnalyzer;
import static com.github.skjolber.bench.utils.EcoSystemGenerator.*;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.module.afterburner.AfterburnerModule;
import com.github.skjolber.bench.utils.EcoSystemGenerator;
import com.github.skjolber.bench.utils.ReturnResultAhoCorasickDoubleArrayTrie;
import com.github.skjolber.nve.gson.GsonParser;
import com.github.skjolber.nve.jackson.JacksonParser;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class EndToEndBenchmark {

	@Benchmark
    public long gson_v524(DatabindingBenchmarkState state) throws Exception {
		Map<String, Long> map = new HashMap<>();

		Gson gson = new GsonBuilder().create();

        long count = 0;

		for(byte[] content : state.getContents()) {
			try (GsonParser<org.nvd.json.gson.DefCveItem> reader = new GsonParser<>(content, gson, org.nvd.json.gson.DefCveItem.class)) {
	            while (reader.hasNext()) {
	                org.nvd.json.gson.DefCveItem cve = reader.next();
	                
		            final String description = cve.getCve().getDescription().getDescriptionData().stream().filter((desc)
		                    -> "en".equals(desc.getLang())).map(d
		                    -> d.getValue()).collect(Collectors.joining(" "));
	                
	                String ecosystem = EcoSystemGenerator.determineBaseEcosystem(description);
	                
	                if (ecosystem == null) {
	                    for (org.nvd.json.gson.Reference r : cve.getCve().getReferences().getReferenceData()) {
	                        if (r.getUrl().contains("elixir-security-advisories")) {
	                            ecosystem = "elixir";
	                        } else if (r.getUrl().contains("ruby-lang.org")) {
	                            ecosystem = RubyGemspecAnalyzer.DEPENDENCY_ECOSYSTEM;
	                        } else if (r.getUrl().contains("python.org")) {
	                            ecosystem = PythonPackageAnalyzer.DEPENDENCY_ECOSYSTEM;
	                        } else if (r.getUrl().contains("drupal.org")) {
	                            ecosystem = PythonPackageAnalyzer.DEPENDENCY_ECOSYSTEM;
	                        } else if (r.getUrl().contains("npm")) {
	                            ecosystem = NodeAuditAnalyzer.DEPENDENCY_ECOSYSTEM;
	                        } else if (r.getUrl().contains("nodejs.org")) {
	                            ecosystem = NodeAuditAnalyzer.DEPENDENCY_ECOSYSTEM;
	                        } else if (r.getUrl().contains("nodesecurity.io")) {
	                            ecosystem = NodeAuditAnalyzer.DEPENDENCY_ECOSYSTEM;
	                        }
	                    }
	                }
	                add(ecosystem, map);
                	count++;
	            }
			}
		}
		System.out.println(map + " for count " + count);

		return count;
    }

	@Benchmark
    public long jackson_reduced_aho_corasick(DatabindingBenchmarkState state) throws IOException {
		Map<String, Long> map = new HashMap<>();

		ReturnResultAhoCorasickDoubleArrayTrie<String> descriptionSearch = EcoSystemGenerator.getDescriptionSearch();
		ReturnResultAhoCorasickDoubleArrayTrie<String> referenceDataSearch = EcoSystemGenerator.getReferenceData();
		
		ObjectMapper objectMapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		objectMapper.registerModule(new AfterburnerModule());
		
		ObjectReader objectReader = objectMapper.readerFor(org.nvd.json.jackson.reduced.DefCveItem.class);
		
        long count = 0;
        
		for(byte[] content : state.getContents()) {
			try (JacksonParser<org.nvd.json.jackson.reduced.DefCveItem> reader = new JacksonParser<>(content, objectReader)) {
	            while (reader.hasNext()) {
	                final org.nvd.json.jackson.reduced.DefCveItem cve = reader.next();
	                
	                String ecosystem = null;
	                
	                List<LangString> descriptionData = cve.getCve().getDescription().getDescriptionData();
	                if(!descriptionData.isEmpty()) {
	                	String description;
		                if(descriptionData.size() == 1) {
		                	if(descriptionData.get(0).getLang().equals("en")) {
		                		description = descriptionData.get(0).getValue();
		                	} else {
		                		description = null;
		                	}
		                } else {
			                description = cve.getCve().getDescription().getDescriptionData().stream().filter((desc)
			                        -> "en".equals(desc.getLang())).map(d
			                        -> d.getValue()).collect(Collectors.joining(" "));	                
		                }
		                
		                if(description != null) {
	            			String c = description.toLowerCase();
	            			
	            			ecosystem = descriptionSearch.parseTextForResult(c, (begin, end, value) -> {
	                        	if(c.charAt(begin) == '.' && (c.length() == end || !Character.isLetterOrDigit(c.charAt(end)))) {
    	                        	// hit
	                        	} else if(CMakeAnalyzer.DEPENDENCY_ECOSYSTEM != value || !StringUtils.contains(c, "android")) {
	                        		// hit - i.e. don't make a c match on android
	                        	} else {
	                        		// no hit
	                        		return true;
	                        	}
	                        	
	                            return false;
	            			});
		                }
	                }
	                
	                if(ecosystem == null) {
	                    for (Reference r : cve.getCve().getReferences().getReferenceData()) {
	            			ecosystem = referenceDataSearch.parseTextForResult(r.getUrl(), (begin, end, value) -> {
	                            return true;
	            			});
	            			if(ecosystem != null) {
	            				break;
	            			}
	                    }	                	
	                }
	                
	                add(ecosystem, map);
                	count++;
	            }
			}
		}
		System.out.println(map + " for count " + count);
		return count;
    }
	
}
