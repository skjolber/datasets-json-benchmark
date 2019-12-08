
package org.nvd.json.gson;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * JSON Schema for NVD Vulnerability Data Feed version 1.0
 * <p>
 * 
 * 
 */
public class NvdCveFeedJson10 {

    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("CVE_data_type")
    @Expose
    private String cVEDataType;
    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("CVE_data_format")
    @Expose
    private String cVEDataFormat;
    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("CVE_data_version")
    @Expose
    private String cVEDataVersion;
    /**
     * NVD adds number of CVE in this feed
     * 
     */
    @SerializedName("CVE_data_numberOfCVEs")
    @Expose
    private String cVEDataNumberOfCVEs;
    /**
     * NVD adds feed date timestamp
     * 
     */
    @SerializedName("CVE_data_timestamp")
    @Expose
    private String cVEDataTimestamp;
    /**
     * NVD feed array of CVE
     * (Required)
     * 
     */
    @SerializedName("CVE_Items")
    @Expose
    private List<DefCveItem> cVEItems = new ArrayList<DefCveItem>();

    public String getCVEDataType() {
        return cVEDataType;
    }

    public void setCVEDataType(String cVEDataType) {
        this.cVEDataType = cVEDataType;
    }

    public String getCVEDataFormat() {
        return cVEDataFormat;
    }

    public void setCVEDataFormat(String cVEDataFormat) {
        this.cVEDataFormat = cVEDataFormat;
    }

    public String getCVEDataVersion() {
        return cVEDataVersion;
    }

    public void setCVEDataVersion(String cVEDataVersion) {
        this.cVEDataVersion = cVEDataVersion;
    }

    /**
     * NVD adds number of CVE in this feed
     * 
     */
    public String getCVEDataNumberOfCVEs() {
        return cVEDataNumberOfCVEs;
    }

    /**
     * NVD adds number of CVE in this feed
     * 
     */
    public void setCVEDataNumberOfCVEs(String cVEDataNumberOfCVEs) {
        this.cVEDataNumberOfCVEs = cVEDataNumberOfCVEs;
    }

    /**
     * NVD adds feed date timestamp
     * 
     */
    public String getCVEDataTimestamp() {
        return cVEDataTimestamp;
    }

    /**
     * NVD adds feed date timestamp
     * 
     */
    public void setCVEDataTimestamp(String cVEDataTimestamp) {
        this.cVEDataTimestamp = cVEDataTimestamp;
    }

    /**
     * NVD feed array of CVE
     * 
     */
    public List<DefCveItem> getCVEItems() {
        return cVEItems;
    }

    /**
     * NVD feed array of CVE
     * 
     */
    public void setCVEItems(List<DefCveItem> cVEItems) {
        this.cVEItems = cVEItems;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(NvdCveFeedJson10 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("cVEDataType");
        sb.append('=');
        sb.append(((this.cVEDataType == null)?"<null>":this.cVEDataType));
        sb.append(',');
        sb.append("cVEDataFormat");
        sb.append('=');
        sb.append(((this.cVEDataFormat == null)?"<null>":this.cVEDataFormat));
        sb.append(',');
        sb.append("cVEDataVersion");
        sb.append('=');
        sb.append(((this.cVEDataVersion == null)?"<null>":this.cVEDataVersion));
        sb.append(',');
        sb.append("cVEDataNumberOfCVEs");
        sb.append('=');
        sb.append(((this.cVEDataNumberOfCVEs == null)?"<null>":this.cVEDataNumberOfCVEs));
        sb.append(',');
        sb.append("cVEDataTimestamp");
        sb.append('=');
        sb.append(((this.cVEDataTimestamp == null)?"<null>":this.cVEDataTimestamp));
        sb.append(',');
        sb.append("cVEItems");
        sb.append('=');
        sb.append(((this.cVEItems == null)?"<null>":this.cVEItems));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
