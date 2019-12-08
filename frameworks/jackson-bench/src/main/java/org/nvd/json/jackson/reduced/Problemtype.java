
package org.nvd.json.jackson.reduced;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "problemtype_data"
})
public class Problemtype {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("problemtype_data")
    private List<ProblemtypeDatum> problemtypeData = new ArrayList<ProblemtypeDatum>();

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("problemtype_data")
    public List<ProblemtypeDatum> getProblemtypeData() {
        return problemtypeData;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("problemtype_data")
    public void setProblemtypeData(List<ProblemtypeDatum> problemtypeData) {
        this.problemtypeData = problemtypeData;
    }

}
