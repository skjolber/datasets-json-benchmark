package com.github.skjolber.nve.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.lang3.StringUtils;
import org.openjdk.jmh.annotations.Benchmark;
import org.owasp.dependencycheck.analyzer.AbstractNpmAnalyzer;
import org.owasp.dependencycheck.analyzer.CMakeAnalyzer;
import org.owasp.dependencycheck.analyzer.ComposerLockAnalyzer;
import org.owasp.dependencycheck.analyzer.JarAnalyzer;
import org.owasp.dependencycheck.analyzer.PythonPackageAnalyzer;
import org.owasp.dependencycheck.analyzer.RubyBundleAuditAnalyzer;
import static com.github.skjolber.bench.utils.EcoSystemGenerator.*;
import com.github.skjolber.bench.utils.EcoSystemGenerator;
import com.github.skjolber.bench.utils.ReturnResultAhoCorasickDoubleArrayTrie;
import com.hankcs.algorithm.AhoCorasickDoubleArrayTrie;

public class EcoSystemBenchmark {

	@Benchmark
	public long classic(EcoSystemBenchmarkState state) throws Exception {
		List<String> content = state.getContent();
		Map<String, Long> map = new HashMap<>();

		long count = 0;

		for(String c : content) {
			String result = EcoSystemGenerator.determineBaseEcosystem(c);
			add(result, map);			
			count++;
		}
		return count;
	}

	@Benchmark
	public long ahoCorasickDoubleArrayTrie(EcoSystemBenchmarkState state) throws Exception {
		// Collect test data set
		ReturnResultAhoCorasickDoubleArrayTrie<String> exact = EcoSystemGenerator.getDescriptionSearch();

		Map<String, Long> map = new HashMap<>();

		long count = 0;

		List<String> content = state.getContent();

		for(String multicase : content) {
			String c = multicase.toLowerCase();

			String result = exact.parseTextForResult(c, (begin, end, value) -> {
				if(c.charAt(begin) == '.') {
					if(c.length() == end || !Character.isLetterOrDigit(c.charAt(end))) {

						if(value == CMakeAnalyzer.DEPENDENCY_ECOSYSTEM) {
							if(Character.isUpperCase(multicase.charAt(begin + 1))) {
								return true; // i.e. continue search
							}
						}

						return false;
					}
					return true;
				} else {
					if(CMakeAnalyzer.DEPENDENCY_ECOSYSTEM == value) {
						if(StringUtils.contains(c, "android")) {
							return true; // i.e. continue search
						}
					}
				}
				return false;

			});

			add(result, map);
			count++;
		}
		return count;
	}

	@Benchmark
	public long scoring_ahoCorasickDoubleArrayTrie(EcoSystemBenchmarkState state) throws Exception {
		// example of more complex search
		List<String> systems = new ArrayList<>();
		systems.add(ComposerLockAnalyzer.DEPENDENCY_ECOSYSTEM);
		systems.add(AbstractNpmAnalyzer.NPM_DEPENDENCY_ECOSYSTEM);
		systems.add("perl");
		systems.add(JarAnalyzer.DEPENDENCY_ECOSYSTEM);
		systems.add(RubyBundleAuditAnalyzer.DEPENDENCY_ECOSYSTEM);
		systems.add(PythonPackageAnalyzer.DEPENDENCY_ECOSYSTEM);
		systems.add(CMakeAnalyzer.DEPENDENCY_ECOSYSTEM);

		AhoCorasickDoubleArrayTrie<Integer> exact = EcoSystemGenerator.getDescriptionSearchByIndex(systems);

		int[] score = new int[systems.size()];

		Map<String, Long> map = new HashMap<>();

		long count = 0;

		List<String> content = state.getContent();

		for(String multicase : content) {
			String c = multicase.toLowerCase();

			exact.parseText(c, (begin, end, value) -> {
				if(c.charAt(begin) == '.') {
					if(c.length() == end || !Character.isLetterOrDigit(c.charAt(end))) {
						if(systems.get(value) == CMakeAnalyzer.DEPENDENCY_ECOSYSTEM) {
							if(Character.isUpperCase(multicase.charAt(begin + 1))) {
								return;
							}
						} else if(systems.get(value) == ComposerLockAnalyzer.DEPENDENCY_ECOSYSTEM && (end - begin == 4) && c.regionMatches(begin, ".php", 0, 4)) {
							if(isURL(c, begin)) {
								return;
							}
						} else if(systems.get(value) == JarAnalyzer.DEPENDENCY_ECOSYSTEM && (end - begin == 4) && c.regionMatches(begin, ".jsp", 0, 4)) {
							if(isURL(c, begin)) {
								return;
							}
						}
					}
				} else {
					if(CMakeAnalyzer.DEPENDENCY_ECOSYSTEM == systems.get(value)) {
						if(StringUtils.contains(c, "android")) {
							return;
						}
					}
				}
				score[value]++;
			});

			int best = -1;
			for(int i = 0; i < score.length; i++) {
				if(score[i] > 0) {
					add(systems.get(i), map);

					if(best == -1 || score[i] > score[best]) {
						best = i;
					}
					score[i] = 0;
				}
			}

			if(best == -1) {
				add(null, map);
			}
			count++;

		}
		return count;
	}

	public static boolean isURL(String c, int begin) {
		begin -= 2;

		while(begin > 2) {
			begin--;

			if(c.charAt(begin) == ' ') {
				return false;
			}
			if(c.charAt(begin) == ':') {
				return c.charAt(begin + 1) == '/' && c.charAt(begin + 2) == '/';
			}
		}

		return false;
	}

}
