package com.github.skjolber.nve.gson;

import java.io.IOException;
import java.util.List;

public class ReducedGsonParser {

    public static long countDefCveItem(List<byte[]> contents) throws IOException {

    	long count = 0;
		
		for(byte[] content : contents) {
			try (GsonParser<org.nvd.json.gson.reduced.DefCveItem> reader = new GsonParser<>(content, org.nvd.json.gson.reduced.DefCveItem.class)) {
	            while (reader.hasNext()) {
	                final org.nvd.json.gson.reduced.DefCveItem cve = reader.next();
	                if(cve != null) {
	                	count += cve.getCve().getReferences().getReferenceData().size();
	                }
	            }
			}
		}		

		return count;
    }

}
