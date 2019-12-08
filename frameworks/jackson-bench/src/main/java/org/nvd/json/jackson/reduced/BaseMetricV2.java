
package org.nvd.json.jackson.reduced;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * CVSS V2.0 score.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "cvssV2",
    "severity"
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
