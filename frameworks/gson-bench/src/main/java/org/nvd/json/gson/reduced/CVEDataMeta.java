
package org.nvd.json.gson.reduced;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CVEDataMeta {

    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("ID")
    @Expose
    private String id;

    /**
     * 
     * (Required)
     * 
     */
    public String getId() {
        return id;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setId(String id) {
        this.id = id;
    }

}
