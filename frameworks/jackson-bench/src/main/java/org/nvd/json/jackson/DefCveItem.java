
package org.nvd.json.jackson;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Defines a vulnerability in the NVD data feed.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "cve",
    "configurations",
    "impact",
    "publishedDate",
    "lastModifiedDate"
})
public class DefCveItem {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("cve")
    private CVEJSON40Min cve;
    /**
     * Defines the set of product configurations for a NVD applicability statement.
     * 
     */
    @JsonProperty("configurations")
    @JsonPropertyDescription("Defines the set of product configurations for a NVD applicability statement.")
    private DefConfigurations configurations;
    /**
     * Impact scores for a vulnerability as found on NVD.
     * 
     */
    @JsonProperty("impact")
    @JsonPropertyDescription("Impact scores for a vulnerability as found on NVD.")
    private DefImpact impact;
    @JsonProperty("publishedDate")
    private String publishedDate;
    @JsonProperty("lastModifiedDate")
    private String lastModifiedDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("cve")
    public CVEJSON40Min getCve() {
        return cve;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("cve")
    public void setCve(CVEJSON40Min cve) {
        this.cve = cve;
    }

    /**
     * Defines the set of product configurations for a NVD applicability statement.
     * 
     */
    @JsonProperty("configurations")
    public DefConfigurations getConfigurations() {
        return configurations;
    }

    /**
     * Defines the set of product configurations for a NVD applicability statement.
     * 
     */
    @JsonProperty("configurations")
    public void setConfigurations(DefConfigurations configurations) {
        this.configurations = configurations;
    }

    /**
     * Impact scores for a vulnerability as found on NVD.
     * 
     */
    @JsonProperty("impact")
    public DefImpact getImpact() {
        return impact;
    }

    /**
     * Impact scores for a vulnerability as found on NVD.
     * 
     */
    @JsonProperty("impact")
    public void setImpact(DefImpact impact) {
        this.impact = impact;
    }

    @JsonProperty("publishedDate")
    public String getPublishedDate() {
        return publishedDate;
    }

    @JsonProperty("publishedDate")
    public void setPublishedDate(String publishedDate) {
        this.publishedDate = publishedDate;
    }

    @JsonProperty("lastModifiedDate")
    public String getLastModifiedDate() {
        return lastModifiedDate;
    }

    @JsonProperty("lastModifiedDate")
    public void setLastModifiedDate(String lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
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
        sb.append(DefCveItem.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("cve");
        sb.append('=');
        sb.append(((this.cve == null)?"<null>":this.cve));
        sb.append(',');
        sb.append("configurations");
        sb.append('=');
        sb.append(((this.configurations == null)?"<null>":this.configurations));
        sb.append(',');
        sb.append("impact");
        sb.append('=');
        sb.append(((this.impact == null)?"<null>":this.impact));
        sb.append(',');
        sb.append("publishedDate");
        sb.append('=');
        sb.append(((this.publishedDate == null)?"<null>":this.publishedDate));
        sb.append(',');
        sb.append("lastModifiedDate");
        sb.append('=');
        sb.append(((this.lastModifiedDate == null)?"<null>":this.lastModifiedDate));
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
