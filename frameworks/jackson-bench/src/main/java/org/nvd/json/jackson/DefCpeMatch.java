
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
 * CPE match string or range
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "vulnerable",
    "cpe22Uri",
    "cpe23Uri",
    "versionStartExcluding",
    "versionStartIncluding",
    "versionEndExcluding",
    "versionEndIncluding",
    "cpe_name"
})
public class DefCpeMatch {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("vulnerable")
    private Boolean vulnerable;
    @JsonProperty("cpe22Uri")
    private String cpe22Uri;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("cpe23Uri")
    private String cpe23Uri;
    @JsonProperty("versionStartExcluding")
    private String versionStartExcluding;
    @JsonProperty("versionStartIncluding")
    private String versionStartIncluding;
    @JsonProperty("versionEndExcluding")
    private String versionEndExcluding;
    @JsonProperty("versionEndIncluding")
    private String versionEndIncluding;
    @JsonProperty("cpe_name")
    private List<DefCpeName> cpeName = new ArrayList<DefCpeName>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("vulnerable")
    public Boolean getVulnerable() {
        return vulnerable;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("vulnerable")
    public void setVulnerable(Boolean vulnerable) {
        this.vulnerable = vulnerable;
    }

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

    @JsonProperty("versionStartExcluding")
    public String getVersionStartExcluding() {
        return versionStartExcluding;
    }

    @JsonProperty("versionStartExcluding")
    public void setVersionStartExcluding(String versionStartExcluding) {
        this.versionStartExcluding = versionStartExcluding;
    }

    @JsonProperty("versionStartIncluding")
    public String getVersionStartIncluding() {
        return versionStartIncluding;
    }

    @JsonProperty("versionStartIncluding")
    public void setVersionStartIncluding(String versionStartIncluding) {
        this.versionStartIncluding = versionStartIncluding;
    }

    @JsonProperty("versionEndExcluding")
    public String getVersionEndExcluding() {
        return versionEndExcluding;
    }

    @JsonProperty("versionEndExcluding")
    public void setVersionEndExcluding(String versionEndExcluding) {
        this.versionEndExcluding = versionEndExcluding;
    }

    @JsonProperty("versionEndIncluding")
    public String getVersionEndIncluding() {
        return versionEndIncluding;
    }

    @JsonProperty("versionEndIncluding")
    public void setVersionEndIncluding(String versionEndIncluding) {
        this.versionEndIncluding = versionEndIncluding;
    }

    @JsonProperty("cpe_name")
    public List<DefCpeName> getCpeName() {
        return cpeName;
    }

    @JsonProperty("cpe_name")
    public void setCpeName(List<DefCpeName> cpeName) {
        this.cpeName = cpeName;
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
        sb.append(DefCpeMatch.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("vulnerable");
        sb.append('=');
        sb.append(((this.vulnerable == null)?"<null>":this.vulnerable));
        sb.append(',');
        sb.append("cpe22Uri");
        sb.append('=');
        sb.append(((this.cpe22Uri == null)?"<null>":this.cpe22Uri));
        sb.append(',');
        sb.append("cpe23Uri");
        sb.append('=');
        sb.append(((this.cpe23Uri == null)?"<null>":this.cpe23Uri));
        sb.append(',');
        sb.append("versionStartExcluding");
        sb.append('=');
        sb.append(((this.versionStartExcluding == null)?"<null>":this.versionStartExcluding));
        sb.append(',');
        sb.append("versionStartIncluding");
        sb.append('=');
        sb.append(((this.versionStartIncluding == null)?"<null>":this.versionStartIncluding));
        sb.append(',');
        sb.append("versionEndExcluding");
        sb.append('=');
        sb.append(((this.versionEndExcluding == null)?"<null>":this.versionEndExcluding));
        sb.append(',');
        sb.append("versionEndIncluding");
        sb.append('=');
        sb.append(((this.versionEndIncluding == null)?"<null>":this.versionEndIncluding));
        sb.append(',');
        sb.append("cpeName");
        sb.append('=');
        sb.append(((this.cpeName == null)?"<null>":this.cpeName));
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
