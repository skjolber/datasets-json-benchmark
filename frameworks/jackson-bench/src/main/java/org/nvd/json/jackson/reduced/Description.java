
package org.nvd.json.jackson.reduced;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


/** Dual purpose object; works both with built-in serializer and with custom deserializer */

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "description_data"
})
public class Description {

	@JsonIgnore
	private String value;

	
	public Description(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Description() {
	}

    @JsonProperty("description_data")
    private List<LangString> descriptionData = new ArrayList<LangString>();

    @JsonProperty("description_data")
    public List<LangString> getDescriptionData() {
        return descriptionData;
    }

    @JsonProperty("description_data")
    public void setDescriptionData(List<LangString> descriptionData) {
        this.descriptionData = descriptionData;
    }
	

}
