package com.github.skjolber.nve.jackson;


import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;
import org.nvd.json.jackson.reduced.Description;
import org.nvd.json.jackson.reduced.EnglishDescriptionDeserializer;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.github.skjolber.bench.utils.GZipUtility;
import static org.junit.jupiter.api.Assertions.*;
public class JacksonParserTest {

	@Test
	public void parse() throws IOException {
		File inputDirectory = new File("../../jmh-benchmark/src/jmh/resources");
		GZipUtility utilitiy = new GZipUtility();
		Map<File, byte[]> bytes = utilitiy.toBytes(inputDirectory);
		
		List<byte[]> list = bytes.values().stream().collect(Collectors.toList());
		long full = FullJacksonParser.countDefCveItem(list);
		long reduced = ReducedJacksonParser.countDefCveItem(list, false);
		
		assertEquals(full, 579486);
		assertEquals(full, reduced);
	}

	@Test
	public void parseSingleDescription() throws IOException {
		EnglishDescriptionDeserializer deserializer = new EnglishDescriptionDeserializer();
		
		InputStream in = getClass().getResourceAsStream("/descriptions/single.json");
		if(in == null) {
			throw new RuntimeException();
		}
		JsonFactory factory = new JsonFactory();
		JsonParser  parser  = factory.createParser(in);
		
		parser.nextToken();
		
		Description deserialize = deserializer.deserialize(parser, null);
		assertEquals("This is the description we want", deserialize.getValue());
	}

	@Test
	public void parseDoubleDescription() throws IOException {
		EnglishDescriptionDeserializer deserializer = new EnglishDescriptionDeserializer();
		
		InputStream in = getClass().getResourceAsStream("/descriptions/double.json");
		if(in == null) {
			throw new RuntimeException();
		}
		JsonFactory factory = new JsonFactory();
		JsonParser  parser  = factory.createParser(in);
		
		parser.nextToken();
		
		Description deserialize = deserializer.deserialize(parser, null);
		assertEquals("In addition to this description, this is the description we want.", deserialize.getValue());
	}

	@Test
	public void parseCustom() throws IOException {
		File inputDirectory = new File("../../jmh-benchmark/src/jmh/resources");
		GZipUtility utilitiy = new GZipUtility();
		Map<File, byte[]> bytes = utilitiy.toBytes(inputDirectory);
		
		List<byte[]> list = bytes.values().stream().collect(Collectors.toList());
		long full = FullJacksonParser.countDefCveItem(list);
		long reduced = ReducedJacksonParser.countDefCveItem(list, true);
		
		assertEquals(full, 579486);
		assertEquals(full, reduced);
	}

}
