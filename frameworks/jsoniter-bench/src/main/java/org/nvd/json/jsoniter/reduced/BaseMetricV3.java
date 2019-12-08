
package org.nvd.json.jsoniter.reduced;

import org.nvd.json.jsoniter.reduced.CvssV30;

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
