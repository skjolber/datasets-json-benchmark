
package org.nvd.json.gson;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * CPE name
 * 
 */
public class DefCpeName {

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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DefCpeName.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("cpe22Uri");
        sb.append('=');
        sb.append(((this.cpe22Uri == null)?"<null>":this.cpe22Uri));
        sb.append(',');
        sb.append("cpe23Uri");
        sb.append('=');
        sb.append(((this.cpe23Uri == null)?"<null>":this.cpe23Uri));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
