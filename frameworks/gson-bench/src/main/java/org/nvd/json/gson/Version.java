
package org.nvd.json.gson;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Version {

    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("version_data")
    @Expose
    private List<VersionDatum> versionData = new ArrayList<VersionDatum>();

    /**
     * 
     * (Required)
     * 
     */
    public List<VersionDatum> getVersionData() {
        return versionData;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setVersionData(List<VersionDatum> versionData) {
        this.versionData = versionData;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Version.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("versionData");
        sb.append('=');
        sb.append(((this.versionData == null)?"<null>":this.versionData));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
