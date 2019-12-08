
package org.nvd.json.jsoniter.reduced;

import com.jsoniter.annotation.JsonProperty;
public class CVEDataMeta {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("ID")
    private String id;

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("ID")
    public String getId() {
        return id;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("ID")
    public void setId(String id) {
        this.id = id;
    }

}
