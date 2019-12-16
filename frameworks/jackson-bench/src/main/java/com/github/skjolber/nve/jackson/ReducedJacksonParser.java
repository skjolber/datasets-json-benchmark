package com.github.skjolber.nve.jackson;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.module.afterburner.AfterburnerModule;

public class ReducedJacksonParser {

    public static int countDefCveItem(List<byte[]> contents) throws IOException {

		int count = 0;

		ObjectMapper objectMapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		objectMapper.registerModule(new AfterburnerModule());
		
		ObjectReader objectReader = objectMapper.readerFor(org.nvd.json.jackson.reduced.DefCveItem.class);
		
		for(byte[] content : contents) {
			try (JacksonParser<org.nvd.json.jackson.reduced.DefCveItem> reader = new JacksonParser<>(content, objectReader)) {
	            while (reader.hasNext()) {
	                final org.nvd.json.jackson.reduced.DefCveItem cve = reader.next();
	                if(cve != null) {
	                	count += cve.getCve().getReferences().getReferenceData().size();
	                }
	            }
			}
		}		
		
		return count;
    }

}
