
package org.nvd.json.jsoniter.reduced;

import java.util.ArrayList;
import java.util.List;

import org.nvd.json.jsoniter.reduced.LangString;

import com.jsoniter.annotation.JsonProperty;



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
