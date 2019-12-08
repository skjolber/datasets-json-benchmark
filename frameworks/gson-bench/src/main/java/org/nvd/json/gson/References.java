
package org.nvd.json.gson;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class References {

    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("reference_data")
    @Expose
    private List<Reference> referenceData = new ArrayList<Reference>();

    /**
     * 
     * (Required)
     * 
     */
    public List<Reference> getReferenceData() {
        return referenceData;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setReferenceData(List<Reference> referenceData) {
        this.referenceData = referenceData;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(References.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("referenceData");
        sb.append('=');
        sb.append(((this.referenceData == null)?"<null>":this.referenceData));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
