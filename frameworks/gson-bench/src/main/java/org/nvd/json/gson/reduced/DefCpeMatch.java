
package org.nvd.json.gson.reduced;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * CPE match string or range
 * 
 */
public class DefCpeMatch {

    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("vulnerable")
    @Expose
    private Boolean vulnerable;
    @SerializedName("cpe22Uri")
    @Expose
    private String cpe22Uri;
    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("cpe23Uri")
    @Expose
    private String cpe23Uri;
    @SerializedName("versionStartExcluding")
    @Expose
    private String versionStartExcluding;
    @SerializedName("versionStartIncluding")
    @Expose
    private String versionStartIncluding;
    @SerializedName("versionEndExcluding")
    @Expose
    private String versionEndExcluding;
    @SerializedName("versionEndIncluding")
    @Expose
    private String versionEndIncluding;

    /**
     * 
     * (Required)
     * 
     */
    public Boolean getVulnerable() {
        return vulnerable;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setVulnerable(Boolean vulnerable) {
        this.vulnerable = vulnerable;
    }

    public String getCpe22Uri() {
        return cpe22Uri;
    }

    public void setCpe22Uri(String cpe22Uri) {
        this.cpe22Uri = cpe22Uri;
    }

    /**
     * 
     * (Required)
     * 
     */
    public String getCpe23Uri() {
        return cpe23Uri;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setCpe23Uri(String cpe23Uri) {
        this.cpe23Uri = cpe23Uri;
    }

    public String getVersionStartExcluding() {
        return versionStartExcluding;
    }

    public void setVersionStartExcluding(String versionStartExcluding) {
        this.versionStartExcluding = versionStartExcluding;
    }

    public String getVersionStartIncluding() {
        return versionStartIncluding;
    }

    public void setVersionStartIncluding(String versionStartIncluding) {
        this.versionStartIncluding = versionStartIncluding;
    }

    public String getVersionEndExcluding() {
        return versionEndExcluding;
    }

    public void setVersionEndExcluding(String versionEndExcluding) {
        this.versionEndExcluding = versionEndExcluding;
    }

    public String getVersionEndIncluding() {
        return versionEndIncluding;
    }

    public void setVersionEndIncluding(String versionEndIncluding) {
        this.versionEndIncluding = versionEndIncluding;
    }

}
