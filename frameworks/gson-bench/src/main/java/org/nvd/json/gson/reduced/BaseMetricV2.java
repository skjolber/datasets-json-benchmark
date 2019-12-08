
package org.nvd.json.gson.reduced;

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

}
