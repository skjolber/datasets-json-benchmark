
package org.nvd.json.jackson.reduced;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Defines a vulnerability in the NVD data feed.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "cve",
    "configurations",
    "impact"
})
public class DefCveItem {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("cve")
    private CVEJSON40Min cve;
    /**
     * Defines the set of product configurations for a NVD applicability statement.
     * 
     */
    @JsonProperty("configurations")
    @JsonPropertyDescription("Defines the set of product configurations for a NVD applicability statement.")
    private DefConfigurations configurations;
    /**
     * Impact scores for a vulnerability as found on NVD.
     * 
     */
    @JsonProperty("impact")
    @JsonPropertyDescription("Impact scores for a vulnerability as found on NVD.")
    private DefImpact impact;

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("cve")
    public CVEJSON40Min getCve() {
        return cve;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("cve")
    public void setCve(CVEJSON40Min cve) {
        this.cve = cve;
    }

    /**
     * Defines the set of product configurations for a NVD applicability statement.
     * 
     */
    @JsonProperty("configurations")
    public DefConfigurations getConfigurations() {
        return configurations;
    }

    /**
     * Defines the set of product configurations for a NVD applicability statement.
     * 
     */
    @JsonProperty("configurations")
    public void setConfigurations(DefConfigurations configurations) {
        this.configurations = configurations;
    }

    /**
     * Impact scores for a vulnerability as found on NVD.
     * 
     */
    @JsonProperty("impact")
    public DefImpact getImpact() {
        return impact;
    }

    /**
     * Impact scores for a vulnerability as found on NVD.
     * 
     */
    @JsonProperty("impact")
    public void setImpact(DefImpact impact) {
        this.impact = impact;
    }

}
