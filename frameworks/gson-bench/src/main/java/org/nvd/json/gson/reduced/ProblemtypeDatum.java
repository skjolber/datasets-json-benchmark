
package org.nvd.json.gson.reduced;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ProblemtypeDatum {

    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("description")
    @Expose
    private List<LangString> description = new ArrayList<LangString>();

    /**
     * 
     * (Required)
     * 
     */
    public List<LangString> getDescription() {
        return description;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setDescription(List<LangString> description) {
        this.description = description;
    }

}
