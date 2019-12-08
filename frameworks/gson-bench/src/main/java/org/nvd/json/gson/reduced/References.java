
package org.nvd.json.gson.reduced;

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

}
