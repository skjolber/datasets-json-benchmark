
package org.nvd.json.gson.reduced;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


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
    @SerializedName("cvssV3")
    @Expose
    private CvssV30 cvssV3;

    /**
     * JSON Schema for Common Vulnerability Scoring System version 3.0
     * <p>
     * 
     * 
     */
    public CvssV30 getCvssV3() {
        return cvssV3;
    }

    /**
     * JSON Schema for Common Vulnerability Scoring System version 3.0
     * <p>
     * 
     * 
     */
    public void setCvssV3(CvssV30 cvssV3) {
        this.cvssV3 = cvssV3;
    }

}
