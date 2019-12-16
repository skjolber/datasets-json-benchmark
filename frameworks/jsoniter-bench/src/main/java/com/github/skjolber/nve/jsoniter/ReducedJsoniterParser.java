package com.github.skjolber.nve.jsoniter;

import java.io.IOException;
import java.util.List;

import com.jsoniter.JsonIterator;


public class ReducedJsoniterParser {

    public static long countDefCveItem(List<byte[]> contents) throws IOException {

    	long count = 0;
		
		for(byte[] content : contents) {
			try (JsonIterator iter = JsonIterator.parse(content)) {
				for (String field = iter.readObject(); field != null; field = iter.readObject()) {
			        switch (field) {
			            case "CVE_Items":
			                while (iter.readArray()) {
			                	
			                	org.nvd.json.jsoniter.reduced.DefCveItem cve = iter.read(org.nvd.json.jsoniter.reduced.DefCveItem.class);
			                    
				                if(cve != null) {
				                	count += cve.getCve().getReferences().getReferenceData().size();
				                }
			                    
			                    count ++;
			                }
			                break;
			            default:
			                iter.skip();
			        }
			    }
			}
		}		
		
		return count;
    }

}
