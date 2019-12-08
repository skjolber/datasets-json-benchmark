
package org.nvd.json.gson.reduced;

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

}
