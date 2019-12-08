
package org.nvd.json.jsoniter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
