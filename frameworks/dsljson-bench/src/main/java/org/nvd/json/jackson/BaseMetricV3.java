
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
 * CVSS V3.0 score.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "cvssV3",
    "exploitabilityScore",
    "impactScore"
})
public class BaseMetricV3 {

    /**
     * JSON Schema for Common Vulnerability Scoring System version 3.0
     * <p>
     * 
     * 
     */
    @JsonProperty("cvssV3")
    private CvssV30 cvssV3;
    /**
     * CVSS subscore.
     * 
     */
    @JsonProperty("exploitabilityScore")
    @JsonPropertyDescription("CVSS subscore.")
    private Double exploitabilityScore;
    /**
     * CVSS subscore.
     * 
     */
    @JsonProperty("impactScore")
    @JsonPropertyDescription("CVSS subscore.")
    private Double impactScore;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * JSON Schema for Common Vulnerability Scoring System version 3.0
     * <p>
     * 
     * 
     */
    @JsonProperty("cvssV3")
    public CvssV30 getCvssV3() {
        return cvssV3;
    }

    /**
     * JSON Schema for Common Vulnerability Scoring System version 3.0
     * <p>
     * 
     * 
     */
    @JsonProperty("cvssV3")
    public void setCvssV3(CvssV30 cvssV3) {
        this.cvssV3 = cvssV3;
    }

    /**
     * CVSS subscore.
     * 
     */
    @JsonProperty("exploitabilityScore")
    public Double getExploitabilityScore() {
        return exploitabilityScore;
    }

    /**
     * CVSS subscore.
     * 
     */
    @JsonProperty("exploitabilityScore")
    public void setExploitabilityScore(Double exploitabilityScore) {
        this.exploitabilityScore = exploitabilityScore;
    }

    /**
     * CVSS subscore.
     * 
     */
    @JsonProperty("impactScore")
    public Double getImpactScore() {
        return impactScore;
    }

    /**
     * CVSS subscore.
     * 
     */
    @JsonProperty("impactScore")
    public void setImpactScore(Double impactScore) {
        this.impactScore = impactScore;
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
        sb.append(BaseMetricV3 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("cvssV3");
        sb.append('=');
        sb.append(((this.cvssV3 == null)?"<null>":this.cvssV3));
        sb.append(',');
        sb.append("exploitabilityScore");
        sb.append('=');
        sb.append(((this.exploitabilityScore == null)?"<null>":this.exploitabilityScore));
        sb.append(',');
        sb.append("impactScore");
        sb.append('=');
        sb.append(((this.impactScore == null)?"<null>":this.impactScore));
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
