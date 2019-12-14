package com.github.skjolber.nve.jackson;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.List;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.module.afterburner.AfterburnerModule;

public class ReducedParser {

    public static int count(List<byte[]> contents) {

		int count = 0;

		ObjectMapper objectMapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		objectMapper.registerModule(new AfterburnerModule());
		
		ObjectReader readerFor = objectMapper.readerFor(org.nvd.json.jackson.reduced.DefCveItem.class);
		JsonFactory factory = objectMapper.getFactory();
		
		for(byte[] content : contents) {
			try (InputStream in  = new ByteArrayInputStream(content);
					JsonParser parser  = factory.createParser(in)) {

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
								org.nvd.json.jackson.reduced.DefCveItem cve = readerFor.readValue(parser);
				                if(cve != null) {
				                	count += cve.getCve().getReferences().getReferenceData().size();
				                }
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
		
		return count;
    }

}
