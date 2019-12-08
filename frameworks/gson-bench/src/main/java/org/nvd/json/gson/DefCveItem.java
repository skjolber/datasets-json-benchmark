
package org.nvd.json.gson;

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
    @SerializedName("publishedDate")
    @Expose
    private String publishedDate;
    @SerializedName("lastModifiedDate")
    @Expose
    private String lastModifiedDate;

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

    public String getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(String publishedDate) {
        this.publishedDate = publishedDate;
    }

    public String getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(String lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DefCveItem.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("cve");
        sb.append('=');
        sb.append(((this.cve == null)?"<null>":this.cve));
        sb.append(',');
        sb.append("configurations");
        sb.append('=');
        sb.append(((this.configurations == null)?"<null>":this.configurations));
        sb.append(',');
        sb.append("impact");
        sb.append('=');
        sb.append(((this.impact == null)?"<null>":this.impact));
        sb.append(',');
        sb.append("publishedDate");
        sb.append('=');
        sb.append(((this.publishedDate == null)?"<null>":this.publishedDate));
        sb.append(',');
        sb.append("lastModifiedDate");
        sb.append('=');
        sb.append(((this.lastModifiedDate == null)?"<null>":this.lastModifiedDate));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
