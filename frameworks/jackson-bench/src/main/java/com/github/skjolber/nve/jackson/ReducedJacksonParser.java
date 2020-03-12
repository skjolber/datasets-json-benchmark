package com.github.skjolber.nve.jackson;

import java.io.IOException;
import java.util.List;

import org.nvd.json.jackson.reduced.Description;
import org.nvd.json.jackson.reduced.EnglishDescriptionDeserializer;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.module.afterburner.AfterburnerModule;

public class ReducedJacksonParser {

    public static long countDefCveItem(List<byte[]> contents, boolean customDescriptionDeserialier) throws IOException {

    	long count = 0;

		ObjectMapper objectMapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		objectMapper.registerModule(new AfterburnerModule());
		
		if (customDescriptionDeserialier) {
			SimpleModule module = new SimpleModule();
			module.addDeserializer(Description.class, new EnglishDescriptionDeserializer());
			objectMapper.registerModule(module);
		}
		
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
