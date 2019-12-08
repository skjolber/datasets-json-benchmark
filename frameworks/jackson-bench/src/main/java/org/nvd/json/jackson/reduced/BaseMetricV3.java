
package org.nvd.json.jackson.reduced;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * CVSS V3.0 score.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "cvssV3"
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

}
