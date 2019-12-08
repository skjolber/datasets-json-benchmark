
package org.nvd.json.jsoniter.reduced;

import org.nvd.json.jsoniter.reduced.CvssV20;

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

}
