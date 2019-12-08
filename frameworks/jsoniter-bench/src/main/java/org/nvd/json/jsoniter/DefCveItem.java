
package org.nvd.json.jsoniter;

import java.util.HashMap;
import java.util.Map;
import com.jsoniter.annotation.JsonProperty;



/**
 * Defines a vulnerability in the NVD data feed.
 * 
 */

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
    private DefConfigurations configurations;
    /**
     * Impact scores for a vulnerability as found on NVD.
     * 
     */
    @JsonProperty("impact")
    private DefImpact impact;
    @JsonProperty("publishedDate")
    private String publishedDate;
    @JsonProperty("lastModifiedDate")
    private String lastModifiedDate;

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

    @JsonProperty("publishedDate")
    public String getPublishedDate() {
        return publishedDate;
    }

    @JsonProperty("publishedDate")
    public void setPublishedDate(String publishedDate) {
        this.publishedDate = publishedDate;
    }

    @JsonProperty("lastModifiedDate")
    public String getLastModifiedDate() {
        return lastModifiedDate;
    }

    @JsonProperty("lastModifiedDate")
    public void setLastModifiedDate(String lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

}
