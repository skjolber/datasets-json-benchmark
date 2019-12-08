
package org.nvd.json.jsoniter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.jsoniter.annotation.JsonProperty;



public class References {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("reference_data")
    private List<Reference> referenceData = new ArrayList<Reference>();

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("reference_data")
    public List<Reference> getReferenceData() {
        return referenceData;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("reference_data")
    public void setReferenceData(List<Reference> referenceData) {
        this.referenceData = referenceData;
    }

}
