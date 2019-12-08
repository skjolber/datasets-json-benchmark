
package org.nvd.json.gson.reduced;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


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
    @SerializedName("cve")
    @Expose
    private CVEJSON40Min cve;
    /**
     * Defines the set of product configurations for a NVD applicability statement.
     * 
     */
    @SerializedName("configurations")
    @Expose
    private DefConfigurations configurations;
    /**
     * Impact scores for a vulnerability as found on NVD.
     * 
     */
    @SerializedName("impact")
    @Expose
    private DefImpact impact;

    /**
     * 
     * (Required)
     * 
     */
    public CVEJSON40Min getCve() {
        return cve;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setCve(CVEJSON40Min cve) {
        this.cve = cve;
    }

    /**
     * Defines the set of product configurations for a NVD applicability statement.
     * 
     */
    public DefConfigurations getConfigurations() {
        return configurations;
    }

    /**
     * Defines the set of product configurations for a NVD applicability statement.
     * 
     */
    public void setConfigurations(DefConfigurations configurations) {
        this.configurations = configurations;
    }

    /**
     * Impact scores for a vulnerability as found on NVD.
     * 
     */
    public DefImpact getImpact() {
        return impact;
    }

    /**
     * Impact scores for a vulnerability as found on NVD.
     * 
     */
    public void setImpact(DefImpact impact) {
        this.impact = impact;
    }

}
