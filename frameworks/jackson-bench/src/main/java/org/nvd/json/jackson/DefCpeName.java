
package org.nvd.json.jackson;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * CPE name
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "cpe22Uri",
    "cpe23Uri"
})
public class DefCpeName {

    @JsonProperty("cpe22Uri")
    private String cpe22Uri;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("cpe23Uri")
    private String cpe23Uri;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("cpe22Uri")
    public String getCpe22Uri() {
        return cpe22Uri;
    }

    @JsonProperty("cpe22Uri")
    public void setCpe22Uri(String cpe22Uri) {
        this.cpe22Uri = cpe22Uri;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("cpe23Uri")
    public String getCpe23Uri() {
        return cpe23Uri;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("cpe23Uri")
    public void setCpe23Uri(String cpe23Uri) {
        this.cpe23Uri = cpe23Uri;
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
        sb.append(DefCpeName.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("cpe22Uri");
        sb.append('=');
        sb.append(((this.cpe22Uri == null)?"<null>":this.cpe22Uri));
        sb.append(',');
        sb.append("cpe23Uri");
        sb.append('=');
        sb.append(((this.cpe23Uri == null)?"<null>":this.cpe23Uri));
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
