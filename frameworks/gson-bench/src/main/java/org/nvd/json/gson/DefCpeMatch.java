
package org.nvd.json.gson;

import java.util.ArrayList;
import java.util.List;
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
    @SerializedName("cpe_name")
    @Expose
    private List<DefCpeName> cpeName = new ArrayList<DefCpeName>();

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

    public List<DefCpeName> getCpeName() {
        return cpeName;
    }

    public void setCpeName(List<DefCpeName> cpeName) {
        this.cpeName = cpeName;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DefCpeMatch.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("vulnerable");
        sb.append('=');
        sb.append(((this.vulnerable == null)?"<null>":this.vulnerable));
        sb.append(',');
        sb.append("cpe22Uri");
        sb.append('=');
        sb.append(((this.cpe22Uri == null)?"<null>":this.cpe22Uri));
        sb.append(',');
        sb.append("cpe23Uri");
        sb.append('=');
        sb.append(((this.cpe23Uri == null)?"<null>":this.cpe23Uri));
        sb.append(',');
        sb.append("versionStartExcluding");
        sb.append('=');
        sb.append(((this.versionStartExcluding == null)?"<null>":this.versionStartExcluding));
        sb.append(',');
        sb.append("versionStartIncluding");
        sb.append('=');
        sb.append(((this.versionStartIncluding == null)?"<null>":this.versionStartIncluding));
        sb.append(',');
        sb.append("versionEndExcluding");
        sb.append('=');
        sb.append(((this.versionEndExcluding == null)?"<null>":this.versionEndExcluding));
        sb.append(',');
        sb.append("versionEndIncluding");
        sb.append('=');
        sb.append(((this.versionEndIncluding == null)?"<null>":this.versionEndIncluding));
        sb.append(',');
        sb.append("cpeName");
        sb.append('=');
        sb.append(((this.cpeName == null)?"<null>":this.cpeName));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
