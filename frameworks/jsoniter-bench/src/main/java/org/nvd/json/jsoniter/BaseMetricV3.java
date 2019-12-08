
package org.nvd.json.jsoniter;

import java.util.HashMap;
import java.util.Map;
import com.jsoniter.annotation.JsonProperty;



/**
 * CVSS V3.0 score.
 * 
 */

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
    private Double exploitabilityScore;
    /**
     * CVSS subscore.
     * 
     */
    @JsonProperty("impactScore")
    private Double impactScore;

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

}
