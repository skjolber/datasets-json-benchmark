
package org.nvd.json.jsoniter.reduced;

import java.util.ArrayList;
import java.util.List;

import org.nvd.json.jsoniter.reduced.LangString;

import com.jsoniter.annotation.JsonProperty;

public class ProblemtypeDatum {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("description")
    private List<LangString> description = new ArrayList<LangString>();

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("description")
    public List<LangString> getDescription() {
        return description;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("description")
    public void setDescription(List<LangString> description) {
        this.description = description;
    }

}
