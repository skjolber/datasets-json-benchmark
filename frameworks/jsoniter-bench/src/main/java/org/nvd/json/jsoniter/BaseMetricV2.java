
package org.nvd.json.jsoniter;

import java.util.HashMap;
import java.util.Map;
import com.jsoniter.annotation.JsonProperty;


/**
 * CVSS V2.0 score.
 * 
 */

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
    private Double exploitabilityScore;
    /**
     * CVSS subscore.
     * 
     */
    @JsonProperty("impactScore")
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
}
