
package org.nvd.json.jackson.reduced;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "reference_data"
})
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
