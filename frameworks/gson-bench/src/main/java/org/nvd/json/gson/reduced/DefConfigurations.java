
package org.nvd.json.gson.reduced;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * Defines the set of product configurations for a NVD applicability statement.
 * 
 */
public class DefConfigurations {

    @SerializedName("nodes")
    @Expose
    private List<DefNode> nodes = new ArrayList<DefNode>();

    public List<DefNode> getNodes() {
        return nodes;
    }

    public void setNodes(List<DefNode> nodes) {
        this.nodes = nodes;
    }

}
