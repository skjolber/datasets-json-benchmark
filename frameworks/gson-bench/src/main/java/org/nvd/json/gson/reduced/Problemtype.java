
package org.nvd.json.gson.reduced;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Problemtype {

    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("problemtype_data")
    @Expose
    private List<ProblemtypeDatum> problemtypeData = new ArrayList<ProblemtypeDatum>();

    /**
     * 
     * (Required)
     * 
     */
    public List<ProblemtypeDatum> getProblemtypeData() {
        return problemtypeData;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setProblemtypeData(List<ProblemtypeDatum> problemtypeData) {
        this.problemtypeData = problemtypeData;
    }

}
