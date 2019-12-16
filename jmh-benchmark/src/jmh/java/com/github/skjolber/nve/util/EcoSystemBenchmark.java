package com.github.skjolber.nve.util;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.openjdk.jmh.annotations.Benchmark;

import com.hankcs.algorithm.AhoCorasickDoubleArrayTrie;

public class EcoSystemBenchmark {

	@Benchmark
    public long classic(EcoSystemBenchmarkState state) throws Exception {
		List<String> content = state.getContent();
		
		long result = 0;
		
		for(String c : content) {
			String ecosystem = EcoSystemGenerator.determineBaseEcosystem(c);
			if(ecosystem != null) {
				result += 1;
			}
		}

		return result;
	}
	
	@Benchmark
    public long ahoCorasickDoubleArrayTrie(EcoSystemBenchmarkState state) throws Exception {
		// Collect test data set
		ReturnResultAhoCorasickDoubleArrayTrie<String> exact = EcoSystemGenerator.getDescriptionSearch();
		
        long count = 0;
        
		List<String> content = state.getContent();
		
		for(String multicase : content) {
			String c = multicase.toLowerCase();
			
			String result = exact.parseTextForResult(c, (begin, end, value) -> {
            	if(c.charAt(begin) == '.') {
	            	if(c.length() == end || !Character.isLetterOrDigit(c.charAt(end))) {
	                    return false;
	            	}
	            	return true;
            	} else {
            		if("buffer overflow" == value) {
            			if(StringUtils.contains(c, "android")) {
            				return true;
            			}
            		}
            	}
                return false;
		            
		        }
			);
			
			if(result != null) {
				count++;
			}
			/*
			String ecosystem = determineBaseEcosystem(c);
			if(ecosystem != null && result[0] == before) {
				System.out.println("No luck for " + c + " is " + ecosystem);
			} else if(ecosystem == null && result[0] != before) {
				System.out.println("To much luck for " + c + " is " + ecosystem);
			}
			*/
		}
		return count;
	}

	
}
