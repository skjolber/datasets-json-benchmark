
package org.nvd.json.gson;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


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
    @SerializedName("CVE_data_version")
    @Expose
    private String cVEDataVersion;
    @SerializedName("nodes")
    @Expose
    private List<DefNode> nodes = new ArrayList<DefNode>();

    public String getCVEDataVersion() {
        return cVEDataVersion;
    }

    public void setCVEDataVersion(String cVEDataVersion) {
        this.cVEDataVersion = cVEDataVersion;
    }

    public List<DefNode> getNodes() {
        return nodes;
    }

    public void setNodes(List<DefNode> nodes) {
        this.nodes = nodes;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DefConfigurations.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("cVEDataVersion");
        sb.append('=');
        sb.append(((this.cVEDataVersion == null)?"<null>":this.cVEDataVersion));
        sb.append(',');
        sb.append("nodes");
        sb.append('=');
        sb.append(((this.nodes == null)?"<null>":this.nodes));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
