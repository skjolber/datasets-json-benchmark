package com.github.skjolber.nve.jsoniter;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;

import com.github.skjolber.bench.utils.GZipUtility;
import static org.junit.jupiter.api.Assertions.*;
public class JsoniterParserTest {

	@Test
	public void parse() throws IOException {
		File inputDirectory = new File("../../jmh-benchmark/src/jmh/resources");
		GZipUtility utilitiy = new GZipUtility();
		Map<File, byte[]> bytes = utilitiy.toBytes(inputDirectory);
		
		List<byte[]> list = bytes.values().stream().collect(Collectors.toList());
		long full = FullJsoniterParser.countDefCveItem(list);
		long reduced = ReducedJsoniterParser.countDefCveItem(list);
		long precompiled = PrecompileJsoniterParser.countDefCveItem(list);
		
		assertEquals(full, 579486);
		assertEquals(full, reduced);
		assertEquals(full, precompiled);
	}
}
