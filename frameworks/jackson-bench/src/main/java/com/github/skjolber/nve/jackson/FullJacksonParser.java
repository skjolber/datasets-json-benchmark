package com.github.skjolber.nve.jackson;

import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.module.afterburner.AfterburnerModule;

public class FullJacksonParser {

    public static long countDefCveItem(List<byte[]> contents) throws IOException {

    	long count = 0;

		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.registerModule(new AfterburnerModule());
		
		ObjectReader objectReader = objectMapper.readerFor(org.nvd.json.jackson.DefCveItem.class);
		
		for(byte[] content : contents) {
			try (JacksonParser<org.nvd.json.jackson.DefCveItem> reader = new JacksonParser<>(content, objectReader)) {
	            while (reader.hasNext()) {
	                final org.nvd.json.jackson.DefCveItem cve = reader.next();
	                if(cve != null) {
	                	count += cve.getCve().getReferences().getReferenceData().size();
	                }
	            }
			}
		}
		
		return count;
    }

}
