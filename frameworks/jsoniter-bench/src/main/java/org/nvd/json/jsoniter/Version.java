
package org.nvd.json.jsoniter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.jsoniter.annotation.JsonProperty;



public class Version {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("version_data")
    private List<VersionDatum> versionData = new ArrayList<VersionDatum>();

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("version_data")
    public List<VersionDatum> getVersionData() {
        return versionData;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("version_data")
    public void setVersionData(List<VersionDatum> versionData) {
        this.versionData = versionData;
    }

}
