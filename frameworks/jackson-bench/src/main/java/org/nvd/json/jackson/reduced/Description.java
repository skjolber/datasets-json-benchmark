
package org.nvd.json.jackson.reduced;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "description_data"
})
public class Description {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("description_data")
    private List<LangString> descriptionData = new ArrayList<LangString>();

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("description_data")
    public List<LangString> getDescriptionData() {
        return descriptionData;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("description_data")
    public void setDescriptionData(List<LangString> descriptionData) {
        this.descriptionData = descriptionData;
    }

}
