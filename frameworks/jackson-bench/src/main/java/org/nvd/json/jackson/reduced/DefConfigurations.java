
package org.nvd.json.jackson.reduced;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Defines the set of product configurations for a NVD applicability statement.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "nodes"
})
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
