package com.github.skjolber.nve;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.lang3.StringUtils;
import org.nvd.json.jackson.reduced.LangString;
import org.nvd.json.jackson.reduced.Reference;
import org.openjdk.jmh.annotations.Benchmark;
import org.owasp.dependencycheck.analyzer.CMakeAnalyzer;
import org.owasp.dependencycheck.analyzer.JarAnalyzer;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.module.afterburner.AfterburnerModule;
import com.github.skjolber.nve.gson.GsonParser;
import com.github.skjolber.nve.jackson.JacksonParser;
import com.github.skjolber.nve.util.EcoSystemGenerator;
import com.github.skjolber.nve.util.ReturnResultAhoCorasickDoubleArrayTrie;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class EndToEndBenchmark {

	@Benchmark
    public long gson_v524(DatabindingBenchmarkState state) throws Exception {
		
		Gson gson = new GsonBuilder().create();

        long count = 0;

		for(byte[] content : state.getContents()) {
			try (GsonParser<org.nvd.json.gson.DefCveItem> reader = new GsonParser<>(content, gson, org.nvd.json.gson.DefCveItem.class)) {
	            while (reader.hasNext()) {
	                org.nvd.json.gson.DefCveItem cve = reader.next();
	                
		            final String description = cve.getCve().getDescription().getDescriptionData().stream().filter((desc)
		                    -> "en".equals(desc.getLang())).map(d
		                    -> d.getValue()).collect(Collectors.joining(" "));
	                
	                String ecosystem = EcoSystemGenerator.determineEcoSystem(cve, description);
	                
	                if(ecosystem != null) {
	                	count += ecosystem.length();
	                }
	            }
			}
		}
		
		return count;
    }

	@Benchmark
    public long jackson_reduced_aho_corasick(DatabindingBenchmarkState state) throws IOException {
		
		ReturnResultAhoCorasickDoubleArrayTrie<String> descriptionSearch = EcoSystemGenerator.getDescriptionSearch();
		ReturnResultAhoCorasickDoubleArrayTrie<String> referenceDataSearch = EcoSystemGenerator.getReferenceData();
		
		ObjectMapper objectMapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		objectMapper.registerModule(new AfterburnerModule());
		
		ObjectReader objectReader = objectMapper.readerFor(org.nvd.json.jackson.reduced.DefCveItem.class);
		
        long count = 0;
        long miss = 0;
        long java = 0;
        
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
	                
	                if(ecosystem != null) {
	                	if(ecosystem == JarAnalyzer.DEPENDENCY_ECOSYSTEM) {
	    					java++;
	    				}
	                	count += ecosystem.length();
	                } else {
	                	miss++;
	                }
	                
	            }
			}
		}		
		
		System.out.println("Hits " + count + " and misses " + miss);
		System.out.println("Java " + java);
		
		
		return count;
    }
	
}
