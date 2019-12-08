
package org.nvd.json.jsoniter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.jsoniter.annotation.JsonProperty;



/**
 * Defines the set of product configurations for a NVD applicability statement.
 * 
 */

public class DefConfigurations {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("CVE_data_version")
    private String cVEDataVersion;
    @JsonProperty("nodes")
    private List<DefNode> nodes = new ArrayList<DefNode>();

    @JsonProperty("CVE_data_version")
    public String getCVEDataVersion() {
        return cVEDataVersion;
    }

    @JsonProperty("CVE_data_version")
    public void setCVEDataVersion(String cVEDataVersion) {
        this.cVEDataVersion = cVEDataVersion;
    }

    @JsonProperty("nodes")
    public List<DefNode> getNodes() {
        return nodes;
    }

    @JsonProperty("nodes")
    public void setNodes(List<DefNode> nodes) {
        this.nodes = nodes;
    }

}
