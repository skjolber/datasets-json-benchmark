package com.github.skjolber.nve.util;

import java.util.List;

import org.openjdk.jmh.annotations.Benchmark;

import com.github.skjolber.bench.utils.EcoSystemGenerator;
import com.github.skjolber.ecosystem.hint.description.DescriptionEcosystemMapper;

public class EcoSystemBenchmark {

	@Benchmark
	public long classic(EcoSystemBenchmarkState state) throws Exception {
		List<String> content = state.getContent();
		
		long count = 0;

		for(String c : content) {
			String result = EcoSystemGenerator.determineBaseEcosystem(c);
						
			if(result != null) {
				count +=result.length();
			}
		}
		return count;
	}

	@Benchmark
	public long scoring_ahoCorasickDoubleArrayTrie(EcoSystemBenchmarkState state) throws Exception {
		// Collect test data set
		DescriptionEcosystemMapper mapper = new DescriptionEcosystemMapper();

		long count = 0;

		List<String> content = state.getContent();

		for(String multicase : content) {
			String result = mapper.apply(multicase);
			if(result != null) {
				count +=result.length();
			}
		}
		return count;
	}

}
