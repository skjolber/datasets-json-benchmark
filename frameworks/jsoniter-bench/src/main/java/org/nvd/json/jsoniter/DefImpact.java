
package org.nvd.json.jsoniter;

import java.util.HashMap;
import java.util.Map;
import com.jsoniter.annotation.JsonProperty;



/**
 * Impact scores for a vulnerability as found on NVD.
 * 
 */

public class DefImpact {

    /**
     * CVSS V3.0 score.
     * 
     */
    @JsonProperty("baseMetricV3")
    private BaseMetricV3 baseMetricV3;
    /**
     * CVSS V2.0 score.
     * 
     */
    @JsonProperty("baseMetricV2")
    private BaseMetricV2 baseMetricV2;

    /**
     * CVSS V3.0 score.
     * 
     */
    @JsonProperty("baseMetricV3")
    public BaseMetricV3 getBaseMetricV3() {
        return baseMetricV3;
    }

    /**
     * CVSS V3.0 score.
     * 
     */
    @JsonProperty("baseMetricV3")
    public void setBaseMetricV3(BaseMetricV3 baseMetricV3) {
        this.baseMetricV3 = baseMetricV3;
    }

    /**
     * CVSS V2.0 score.
     * 
     */
    @JsonProperty("baseMetricV2")
    public BaseMetricV2 getBaseMetricV2() {
        return baseMetricV2;
    }

    /**
     * CVSS V2.0 score.
     * 
     */
    @JsonProperty("baseMetricV2")
    public void setBaseMetricV2(BaseMetricV2 baseMetricV2) {
        this.baseMetricV2 = baseMetricV2;
    }

}
