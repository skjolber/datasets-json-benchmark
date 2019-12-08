
package org.nvd.json.jsoniter;

import java.util.HashMap;
import java.util.Map;
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
    @JsonProperty("ASSIGNER")
    private String assigner;
    @JsonProperty("STATE")
    private String state;

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

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("ASSIGNER")
    public String getAssigner() {
        return assigner;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("ASSIGNER")
    public void setAssigner(String assigner) {
        this.assigner = assigner;
    }

    @JsonProperty("STATE")
    public String getState() {
        return state;
    }

    @JsonProperty("STATE")
    public void setState(String state) {
        this.state = state;
    }

}
