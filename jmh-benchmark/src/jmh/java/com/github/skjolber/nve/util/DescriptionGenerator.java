package com.github.skjolber.nve.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.stream.Collectors;

import org.nvd.json.jackson.DefCveItem;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import com.github.skjolber.bench.utils.GZipUtility;

public class DescriptionGenerator {

	public void generateDescriptions(File inputDirectory, File outputFile) throws Exception {
		GZipUtility utility = new GZipUtility();

		File outputDirectory = new File("/tmp/nve");
		
		FileOutputStream fout = new FileOutputStream(outputFile);
		Writer writer = new OutputStreamWriter(fout, StandardCharsets.UTF_8);
		
		outputDirectory.mkdirs();
		
		List<File> files = utility.toFiles(inputDirectory, outputDirectory);
		if(files != null && !files.isEmpty()) {
			for(File file : files) {
				try (InputStream in = new FileInputStream(file)) {
					System.out.println("Parse file " + file + " size " + file.length() / (1024 * 1024) + "MB");
					
					parse(in, writer);
				}
			}
		} else {
			throw new RuntimeException("No files in " + inputDirectory.getAbsolutePath());
		}
		
		writer.close();
	}

	private void parse(InputStream in, Writer writer) {
		ObjectMapper objectMapper = new ObjectMapper();
		ObjectReader readerFor = objectMapper.readerFor(org.nvd.json.jackson.DefCveItem.class);

		JsonFactory factory = objectMapper.getFactory();

		try (JsonParser parser  = factory.createParser(in)) {

			com.fasterxml.jackson.core.JsonToken nextToken = parser.nextToken();
			if(nextToken != com.fasterxml.jackson.core.JsonToken.START_OBJECT) {
				throw new RuntimeException();
			}

			do {
				nextToken = parser.nextToken();
				if(nextToken == null) {
					break;
				}

				if(nextToken.isStructStart()) {
					if(nextToken == com.fasterxml.jackson.core.JsonToken.START_ARRAY) {
						while(parser.nextToken() == com.fasterxml.jackson.core.JsonToken.START_OBJECT) {
							org.nvd.json.jackson.DefCveItem cve = readerFor.readValue(parser);
							writeDescription(writer, cve);
						}
					} else {
						parser.skipChildren();
					}
				}
			} while(true);
        } catch (Exception ex) {
        	throw new RuntimeException(ex);
        }		
	}

	private void writeDescription(Writer writer, DefCveItem cve) throws IOException {
        final String description = cve.getCve().getDescription().getDescriptionData().stream().filter((desc)
                -> "en".equals(desc.getLang())).map(d
                -> d.getValue()).collect(Collectors.joining(" "));
        
        writer.write(description.replace("\n", "").replace("\r", ""));
        writer.write('\n');
	}

	
}
