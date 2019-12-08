
package org.nvd.json.jsoniter;

import java.util.HashMap;
import java.util.Map;

import com.jsoniter.annotation.JsonProperty;


/**
 * CPE name
 * 
 */

public class DefCpeName {

    @JsonProperty("cpe22Uri")
    private String cpe22Uri;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("cpe23Uri")
    private String cpe23Uri;

    @JsonProperty("cpe22Uri")
    public String getCpe22Uri() {
        return cpe22Uri;
    }

    @JsonProperty("cpe22Uri")
    public void setCpe22Uri(String cpe22Uri) {
        this.cpe22Uri = cpe22Uri;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("cpe23Uri")
    public String getCpe23Uri() {
        return cpe23Uri;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("cpe23Uri")
    public void setCpe23Uri(String cpe23Uri) {
        this.cpe23Uri = cpe23Uri;
    }

}
