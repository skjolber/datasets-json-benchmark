
package org.nvd.json.jsoniter;

import java.util.HashMap;
import java.util.Map;
import com.jsoniter.annotation.JsonProperty;



public class VersionDatum {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("version_value")
    private String versionValue;
    @JsonProperty("version_affected")
    private String versionAffected;

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("version_value")
    public String getVersionValue() {
        return versionValue;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("version_value")
    public void setVersionValue(String versionValue) {
        this.versionValue = versionValue;
    }

    @JsonProperty("version_affected")
    public String getVersionAffected() {
        return versionAffected;
    }

    @JsonProperty("version_affected")
    public void setVersionAffected(String versionAffected) {
        this.versionAffected = versionAffected;
    }

}
