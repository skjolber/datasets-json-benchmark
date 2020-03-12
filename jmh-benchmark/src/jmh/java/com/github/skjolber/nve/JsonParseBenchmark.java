package com.github.skjolber.nve;

import java.io.IOException;

import org.openjdk.jmh.annotations.Benchmark;

import com.github.skjolber.nve.gson.FullGsonParser;
import com.github.skjolber.nve.gson.ReducedGsonParser;
import com.github.skjolber.nve.jackson.FullJacksonParser;
import com.github.skjolber.nve.jackson.ReducedJacksonParser;
import com.github.skjolber.nve.jsoniter.FullJsoniterParser;
import com.github.skjolber.nve.jsoniter.PrecompileJsoniterParser;
import com.github.skjolber.nve.jsoniter.ReducedJsoniterParser;

public class JsonParseBenchmark {

	@Benchmark
	public long gson_parse_full(DatabindingBenchmarkState state) throws Exception {
		return FullGsonParser.countDefCveItem(state.getContents());
	}

	@Benchmark
	public long gson_parse_reduced(DatabindingBenchmarkState state) throws Exception {
		return ReducedGsonParser.countDefCveItem(state.getContents());
	}

	@Benchmark
	public long jackson_parse_full(DatabindingBenchmarkState state) throws IOException {
		return FullJacksonParser.countDefCveItem(state.getContents());
	}

	@Benchmark
	public long jackson_parse_reduced(DatabindingBenchmarkState state) throws IOException {
		return ReducedJacksonParser.countDefCveItem(state.getContents(), false);
	}

	@Benchmark
	public long jackson_parse_reduced_custom(DatabindingBenchmarkState state) throws IOException {
		return ReducedJacksonParser.countDefCveItem(state.getContents(), false);
	}

	@Benchmark
	public long jsoniter_parse_reduced(DatabindingBenchmarkState state) throws IOException {
		return ReducedJsoniterParser.countDefCveItem(state.getContents());
	}

	@Benchmark
	public long jsoniter_parse_reduced_precompiled(DatabindingBenchmarkState state) throws IOException {
		return PrecompileJsoniterParser.countDefCveItem(state.getContents());
	}

	@Benchmark
	public long jsoniter_parse_full(DatabindingBenchmarkState state) throws IOException {
		return FullJsoniterParser.countDefCveItem(state.getContents());
	}	
}
