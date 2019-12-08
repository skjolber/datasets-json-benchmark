
package org.nvd.json.gson;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * Impact scores for a vulnerability as found on NVD.
 * 
 */
public class DefImpact {

    /**
     * CVSS V3.0 score.
     * 
     */
    @SerializedName("baseMetricV3")
    @Expose
    private BaseMetricV3 baseMetricV3;
    /**
     * CVSS V2.0 score.
     * 
     */
    @SerializedName("baseMetricV2")
    @Expose
    private BaseMetricV2 baseMetricV2;

    /**
     * CVSS V3.0 score.
     * 
     */
    public BaseMetricV3 getBaseMetricV3() {
        return baseMetricV3;
    }

    /**
     * CVSS V3.0 score.
     * 
     */
    public void setBaseMetricV3(BaseMetricV3 baseMetricV3) {
        this.baseMetricV3 = baseMetricV3;
    }

    /**
     * CVSS V2.0 score.
     * 
     */
    public BaseMetricV2 getBaseMetricV2() {
        return baseMetricV2;
    }

    /**
     * CVSS V2.0 score.
     * 
     */
    public void setBaseMetricV2(BaseMetricV2 baseMetricV2) {
        this.baseMetricV2 = baseMetricV2;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DefImpact.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("baseMetricV3");
        sb.append('=');
        sb.append(((this.baseMetricV3 == null)?"<null>":this.baseMetricV3));
        sb.append(',');
        sb.append("baseMetricV2");
        sb.append('=');
        sb.append(((this.baseMetricV2 == null)?"<null>":this.baseMetricV2));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
