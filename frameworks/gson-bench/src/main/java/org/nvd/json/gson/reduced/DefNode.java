
package org.nvd.json.gson.reduced;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * Defines a node or sub-node in an NVD applicability statement.
 * 
 */
public class DefNode {

    @SerializedName("operator")
    @Expose
    private String operator;
    @SerializedName("children")
    @Expose
    private List<DefNode> children = new ArrayList<DefNode>();
    @SerializedName("cpe_match")
    @Expose
    private List<DefCpeMatch> cpeMatch = new ArrayList<DefCpeMatch>();

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public List<DefNode> getChildren() {
        return children;
    }

    public void setChildren(List<DefNode> children) {
        this.children = children;
    }

    public List<DefCpeMatch> getCpeMatch() {
        return cpeMatch;
    }

    public void setCpeMatch(List<DefCpeMatch> cpeMatch) {
        this.cpeMatch = cpeMatch;
    }

}
