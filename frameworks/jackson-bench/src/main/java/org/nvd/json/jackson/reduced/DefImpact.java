
package org.nvd.json.jackson.reduced;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Impact scores for a vulnerability as found on NVD.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "baseMetricV3",
    "baseMetricV2"
})
public class DefImpact {

    /**
     * CVSS V3.0 score.
     * 
     */
    @JsonProperty("baseMetricV3")
    @JsonPropertyDescription("CVSS V3.0 score.")
    private BaseMetricV3 baseMetricV3;
    /**
     * CVSS V2.0 score.
     * 
     */
    @JsonProperty("baseMetricV2")
    @JsonPropertyDescription("CVSS V2.0 score.")
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
