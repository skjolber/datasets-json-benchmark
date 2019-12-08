
package org.nvd.json.gson;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class VersionDatum {

    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("version_value")
    @Expose
    private String versionValue;
    @SerializedName("version_affected")
    @Expose
    private String versionAffected;

    /**
     * 
     * (Required)
     * 
     */
    public String getVersionValue() {
        return versionValue;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setVersionValue(String versionValue) {
        this.versionValue = versionValue;
    }

    public String getVersionAffected() {
        return versionAffected;
    }

    public void setVersionAffected(String versionAffected) {
        this.versionAffected = versionAffected;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(VersionDatum.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("versionValue");
        sb.append('=');
        sb.append(((this.versionValue == null)?"<null>":this.versionValue));
        sb.append(',');
        sb.append("versionAffected");
        sb.append('=');
        sb.append(((this.versionAffected == null)?"<null>":this.versionAffected));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
