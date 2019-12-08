
package org.nvd.json.jackson;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Defines a node or sub-node in an NVD applicability statement.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "operator",
    "negate",
    "children",
    "cpe_match"
})
public class DefNode {

    @JsonProperty("operator")
    private String operator;
    @JsonProperty("negate")
    private Boolean negate;
    @JsonProperty("children")
    private List<DefNode> children = new ArrayList<DefNode>();
    @JsonProperty("cpe_match")
    private List<DefCpeMatch> cpeMatch = new ArrayList<DefCpeMatch>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("operator")
    public String getOperator() {
        return operator;
    }

    @JsonProperty("operator")
    public void setOperator(String operator) {
        this.operator = operator;
    }

    @JsonProperty("negate")
    public Boolean getNegate() {
        return negate;
    }

    @JsonProperty("negate")
    public void setNegate(Boolean negate) {
        this.negate = negate;
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

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
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
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
