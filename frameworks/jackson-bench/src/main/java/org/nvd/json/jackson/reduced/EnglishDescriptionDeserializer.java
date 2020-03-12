package org.nvd.json.jackson.reduced;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

public class EnglishDescriptionDeserializer extends StdDeserializer<Description> {

	public EnglishDescriptionDeserializer() {
		super(Description.class);
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	/**
	 * 
	 * "description_data" : [ {
          "lang" : "en",
          "value" : "poppassd_pam 1.0 and earlier, when changing a user password, does not verify that the user entered the old password correctly, which allows remote attackers to change passwords for arbitrary users."
        } ]
	 * 
	 */
	
	@Override
	public Description deserialize(JsonParser parser, DeserializationContext ctxt) throws IOException, JsonProcessingException {
		
		StringBuilder builder = new StringBuilder();
		
        int open = 1;
        while (true) {
            JsonToken t = parser.nextToken();
            if (t.isStructStart()) {
                ++open;

                if(open == 2 && parser.getCurrentName().equals("description_data")) {
                	parseDescriptionData(builder, parser);
                }
                
                open--;
            } else if (t.isStructEnd()) {
                if (--open == 0) {
                    break;
                }
            }
        }		
		return new Description(builder.toString());
	}

	private void parseDescriptionData(StringBuilder builder, JsonParser parser) throws IOException {
		// array type
        int open = 1;
        while (true) {
            JsonToken t = parser.nextToken();
            if (t.isStructStart()) {
                ++open;
                
               	parseLangString(builder, parser);
                
                open--;
            } else if (t.isStructEnd()) {
                if (--open == 0) {
                    break;
                }
            } else {
            	throw new RuntimeException();
            }
        }		
		
	}

	private void parseLangString(StringBuilder builder, JsonParser parser) throws IOException {
		String lang = null;
        int open = 1;
        while (true) {
            JsonToken t = parser.nextToken();
            
            if (t.isStructStart()) {
                ++open;
                
               	parseLangString(builder, parser);
                
                open--;
            } else if (t.isStructEnd()) {
                if (--open == 0) {
                    break;
                }
            } else if(t == JsonToken.FIELD_NAME) {
            	if(parser.getCurrentName().equals("lang")) {
            		t = parser.nextToken();
            		lang = parser.getText();
            	} else if(parser.getCurrentName().equals("value") && "en".equals(lang)) {
            		t = parser.nextToken();
            		
            		if(builder.length() > 0) {
            			builder.append(' ');
            		}
        			builder.append(parser.getTextCharacters(), parser.getTextOffset(), parser.getTextLength());
            	}
            }
        }
        
		
	}

}
