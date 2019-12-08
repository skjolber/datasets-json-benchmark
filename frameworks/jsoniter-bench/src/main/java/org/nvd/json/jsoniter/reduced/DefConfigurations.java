
package org.nvd.json.jsoniter.reduced;

import java.util.ArrayList;
import java.util.List;

import org.nvd.json.jsoniter.reduced.DefNode;

import com.jsoniter.annotation.JsonProperty;

/**
 * Defines the set of product configurations for a NVD applicability statement.
 * 
 */

public class DefConfigurations {

    @JsonProperty("nodes")
    private List<DefNode> nodes = new ArrayList<DefNode>();

    @JsonProperty("nodes")
    public List<DefNode> getNodes() {
        return nodes;
    }

    @JsonProperty("nodes")
    public void setNodes(List<DefNode> nodes) {
        this.nodes = nodes;
    }

}
