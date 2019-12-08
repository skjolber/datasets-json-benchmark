
package org.nvd.json.gson;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


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
    @SerializedName("cvssV2")
    @Expose
    private CvssV20 cvssV2;
    @SerializedName("severity")
    @Expose
    private String severity;
    /**
     * CVSS subscore.
     * 
     */
    @SerializedName("exploitabilityScore")
    @Expose
    private Double exploitabilityScore;
    /**
     * CVSS subscore.
     * 
     */
    @SerializedName("impactScore")
    @Expose
    private Double impactScore;
    @SerializedName("acInsufInfo")
    @Expose
    private Boolean acInsufInfo;
    @SerializedName("obtainAllPrivilege")
    @Expose
    private Boolean obtainAllPrivilege;
    @SerializedName("obtainUserPrivilege")
    @Expose
    private Boolean obtainUserPrivilege;
    @SerializedName("obtainOtherPrivilege")
    @Expose
    private Boolean obtainOtherPrivilege;
    @SerializedName("userInteractionRequired")
    @Expose
    private Boolean userInteractionRequired;

    /**
     * JSON Schema for Common Vulnerability Scoring System version 2.0
     * <p>
     * 
     * 
     */
    public CvssV20 getCvssV2() {
        return cvssV2;
    }

    /**
     * JSON Schema for Common Vulnerability Scoring System version 2.0
     * <p>
     * 
     * 
     */
    public void setCvssV2(CvssV20 cvssV2) {
        this.cvssV2 = cvssV2;
    }

    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    /**
     * CVSS subscore.
     * 
     */
    public Double getExploitabilityScore() {
        return exploitabilityScore;
    }

    /**
     * CVSS subscore.
     * 
     */
    public void setExploitabilityScore(Double exploitabilityScore) {
        this.exploitabilityScore = exploitabilityScore;
    }

    /**
     * CVSS subscore.
     * 
     */
    public Double getImpactScore() {
        return impactScore;
    }

    /**
     * CVSS subscore.
     * 
     */
    public void setImpactScore(Double impactScore) {
        this.impactScore = impactScore;
    }

    public Boolean getAcInsufInfo() {
        return acInsufInfo;
    }

    public void setAcInsufInfo(Boolean acInsufInfo) {
        this.acInsufInfo = acInsufInfo;
    }

    public Boolean getObtainAllPrivilege() {
        return obtainAllPrivilege;
    }

    public void setObtainAllPrivilege(Boolean obtainAllPrivilege) {
        this.obtainAllPrivilege = obtainAllPrivilege;
    }

    public Boolean getObtainUserPrivilege() {
        return obtainUserPrivilege;
    }

    public void setObtainUserPrivilege(Boolean obtainUserPrivilege) {
        this.obtainUserPrivilege = obtainUserPrivilege;
    }

    public Boolean getObtainOtherPrivilege() {
        return obtainOtherPrivilege;
    }

    public void setObtainOtherPrivilege(Boolean obtainOtherPrivilege) {
        this.obtainOtherPrivilege = obtainOtherPrivilege;
    }

    public Boolean getUserInteractionRequired() {
        return userInteractionRequired;
    }

    public void setUserInteractionRequired(Boolean userInteractionRequired) {
        this.userInteractionRequired = userInteractionRequired;
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
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
