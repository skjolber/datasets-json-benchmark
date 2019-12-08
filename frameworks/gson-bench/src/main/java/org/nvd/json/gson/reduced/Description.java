
package org.nvd.json.gson.reduced;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Description {

    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("description_data")
    @Expose
    private List<LangString> descriptionData = new ArrayList<LangString>();

    /**
     * 
     * (Required)
     * 
     */
    public List<LangString> getDescriptionData() {
        return descriptionData;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setDescriptionData(List<LangString> descriptionData) {
        this.descriptionData = descriptionData;
    }

}
