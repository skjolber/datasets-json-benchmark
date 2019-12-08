
package org.nvd.json.jackson;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
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
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
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
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
