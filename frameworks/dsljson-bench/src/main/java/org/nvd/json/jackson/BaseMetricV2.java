
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
 * CVSS V2.0 score.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "cvssV2",
    "severity",
    "exploitabilityScore",
    "impactScore",
    "acInsufInfo",
    "obtainAllPrivilege",
    "obtainUserPrivilege",
    "obtainOtherPrivilege",
    "userInteractionRequired"
})
public class BaseMetricV2 {

    /**
     * JSON Schema for Common Vulnerability Scoring System version 2.0
     * <p>
     * 
     * 
     */
    @JsonProperty("cvssV2")
    private CvssV20 cvssV2;
    @JsonProperty("severity")
    private String severity;
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
    @JsonProperty("acInsufInfo")
    private Boolean acInsufInfo;
    @JsonProperty("obtainAllPrivilege")
    private Boolean obtainAllPrivilege;
    @JsonProperty("obtainUserPrivilege")
    private Boolean obtainUserPrivilege;
    @JsonProperty("obtainOtherPrivilege")
    private Boolean obtainOtherPrivilege;
    @JsonProperty("userInteractionRequired")
    private Boolean userInteractionRequired;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * JSON Schema for Common Vulnerability Scoring System version 2.0
     * <p>
     * 
     * 
     */
    @JsonProperty("cvssV2")
    public CvssV20 getCvssV2() {
        return cvssV2;
    }

    /**
     * JSON Schema for Common Vulnerability Scoring System version 2.0
     * <p>
     * 
     * 
     */
    @JsonProperty("cvssV2")
    public void setCvssV2(CvssV20 cvssV2) {
        this.cvssV2 = cvssV2;
    }

    @JsonProperty("severity")
    public String getSeverity() {
        return severity;
    }

    @JsonProperty("severity")
    public void setSeverity(String severity) {
        this.severity = severity;
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

    @JsonProperty("acInsufInfo")
    public Boolean getAcInsufInfo() {
        return acInsufInfo;
    }

    @JsonProperty("acInsufInfo")
    public void setAcInsufInfo(Boolean acInsufInfo) {
        this.acInsufInfo = acInsufInfo;
    }

    @JsonProperty("obtainAllPrivilege")
    public Boolean getObtainAllPrivilege() {
        return obtainAllPrivilege;
    }

    @JsonProperty("obtainAllPrivilege")
    public void setObtainAllPrivilege(Boolean obtainAllPrivilege) {
        this.obtainAllPrivilege = obtainAllPrivilege;
    }

    @JsonProperty("obtainUserPrivilege")
    public Boolean getObtainUserPrivilege() {
        return obtainUserPrivilege;
    }

    @JsonProperty("obtainUserPrivilege")
    public void setObtainUserPrivilege(Boolean obtainUserPrivilege) {
        this.obtainUserPrivilege = obtainUserPrivilege;
    }

    @JsonProperty("obtainOtherPrivilege")
    public Boolean getObtainOtherPrivilege() {
        return obtainOtherPrivilege;
    }

    @JsonProperty("obtainOtherPrivilege")
    public void setObtainOtherPrivilege(Boolean obtainOtherPrivilege) {
        this.obtainOtherPrivilege = obtainOtherPrivilege;
    }

    @JsonProperty("userInteractionRequired")
    public Boolean getUserInteractionRequired() {
        return userInteractionRequired;
    }

    @JsonProperty("userInteractionRequired")
    public void setUserInteractionRequired(Boolean userInteractionRequired) {
        this.userInteractionRequired = userInteractionRequired;
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
        sb.append(BaseMetricV2 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("cvssV2");
        sb.append('=');
        sb.append(((this.cvssV2 == null)?"<null>":this.cvssV2));
        sb.append(',');
        sb.append("severity");
        sb.append('=');
        sb.append(((this.severity == null)?"<null>":this.severity));
        sb.append(',');
        sb.append("exploitabilityScore");
        sb.append('=');
        sb.append(((this.exploitabilityScore == null)?"<null>":this.exploitabilityScore));
        sb.append(',');
        sb.append("impactScore");
        sb.append('=');
        sb.append(((this.impactScore == null)?"<null>":this.impactScore));
        sb.append(',');
        sb.append("acInsufInfo");
        sb.append('=');
        sb.append(((this.acInsufInfo == null)?"<null>":this.acInsufInfo));
        sb.append(',');
        sb.append("obtainAllPrivilege");
        sb.append('=');
        sb.append(((this.obtainAllPrivilege == null)?"<null>":this.obtainAllPrivilege));
        sb.append(',');
        sb.append("obtainUserPrivilege");
        sb.append('=');
        sb.append(((this.obtainUserPrivilege == null)?"<null>":this.obtainUserPrivilege));
        sb.append(',');
        sb.append("obtainOtherPrivilege");
        sb.append('=');
        sb.append(((this.obtainOtherPrivilege == null)?"<null>":this.obtainOtherPrivilege));
        sb.append(',');
        sb.append("userInteractionRequired");
        sb.append('=');
        sb.append(((this.userInteractionRequired == null)?"<null>":this.userInteractionRequired));
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
