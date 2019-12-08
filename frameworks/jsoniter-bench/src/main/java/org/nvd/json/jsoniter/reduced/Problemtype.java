
package org.nvd.json.jsoniter.reduced;

import java.util.ArrayList;
import java.util.List;

import org.nvd.json.jsoniter.reduced.ProblemtypeDatum;

import com.jsoniter.annotation.JsonProperty;

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
