
package org.nvd.json.gson;

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
    @SerializedName("negate")
    @Expose
    private Boolean negate;
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

    public Boolean getNegate() {
        return negate;
    }

    public void setNegate(Boolean negate) {
        this.negate = negate;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DefNode.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("operator");
        sb.append('=');
        sb.append(((this.operator == null)?"<null>":this.operator));
        sb.append(',');
        sb.append("negate");
        sb.append('=');
        sb.append(((this.negate == null)?"<null>":this.negate));
        sb.append(',');
        sb.append("children");
        sb.append('=');
        sb.append(((this.children == null)?"<null>":this.children));
        sb.append(',');
        sb.append("cpeMatch");
        sb.append('=');
        sb.append(((this.cpeMatch == null)?"<null>":this.cpeMatch));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
