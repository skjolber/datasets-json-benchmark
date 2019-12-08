
package org.nvd.json.gson;

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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Problemtype.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("problemtypeData");
        sb.append('=');
        sb.append(((this.problemtypeData == null)?"<null>":this.problemtypeData));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
