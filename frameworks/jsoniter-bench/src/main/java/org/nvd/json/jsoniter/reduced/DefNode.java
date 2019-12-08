
package org.nvd.json.jsoniter.reduced;

import java.util.ArrayList;
import java.util.List;

import org.nvd.json.jsoniter.reduced.DefCpeMatch;
import org.nvd.json.jsoniter.reduced.DefNode;

import com.jsoniter.annotation.JsonProperty;



/**
 * Defines a node or sub-node in an NVD applicability statement.
 * 
 */

public class DefNode {

    @JsonProperty("operator")
    private String operator;
    @JsonProperty("children")
    private List<DefNode> children = new ArrayList<DefNode>();
    @JsonProperty("cpe_match")
    private List<DefCpeMatch> cpeMatch = new ArrayList<DefCpeMatch>();

    @JsonProperty("operator")
    public String getOperator() {
        return operator;
    }

    @JsonProperty("operator")
    public void setOperator(String operator) {
        this.operator = operator;
    }

    @JsonProperty("children")
    public List<DefNode> getChildren() {
        return children;
    }

    @JsonProperty("children")
    public void setChildren(List<DefNode> children) {
        this.children = children;
    }

    @JsonProperty("cpe_match")
    public List<DefCpeMatch> getCpeMatch() {
        return cpeMatch;
    }

    @JsonProperty("cpe_match")
    public void setCpeMatch(List<DefCpeMatch> cpeMatch) {
        this.cpeMatch = cpeMatch;
    }

}
