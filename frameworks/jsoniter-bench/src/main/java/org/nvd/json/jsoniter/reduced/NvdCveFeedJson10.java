
package org.nvd.json.jsoniter.reduced;

import java.util.ArrayList;
import java.util.List;

import org.nvd.json.jsoniter.reduced.DefCveItem;

import com.jsoniter.annotation.JsonProperty;



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
    @JsonProperty("CVE_data_type")
    private String cVEDataType;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("CVE_data_format")
    private String cVEDataFormat;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("CVE_data_version")
    private String cVEDataVersion;
    /**
     * NVD adds number of CVE in this feed
     * 
     */
    @JsonProperty("CVE_data_numberOfCVEs")
    private String cVEDataNumberOfCVEs;
    /**
     * NVD adds feed date timestamp
     * 
     */
    @JsonProperty("CVE_data_timestamp")
    private String cVEDataTimestamp;
    /**
     * NVD feed array of CVE
     * (Required)
     * 
     */
    @JsonProperty("CVE_Items")
    private List<DefCveItem> cVEItems = new ArrayList<DefCveItem>();

    @JsonProperty("CVE_data_type")
    public String getCVEDataType() {
        return cVEDataType;
    }

    @JsonProperty("CVE_data_type")
    public void setCVEDataType(String cVEDataType) {
        this.cVEDataType = cVEDataType;
    }

    @JsonProperty("CVE_data_format")
    public String getCVEDataFormat() {
        return cVEDataFormat;
    }

    @JsonProperty("CVE_data_format")
    public void setCVEDataFormat(String cVEDataFormat) {
        this.cVEDataFormat = cVEDataFormat;
    }

    @JsonProperty("CVE_data_version")
    public String getCVEDataVersion() {
        return cVEDataVersion;
    }

    @JsonProperty("CVE_data_version")
    public void setCVEDataVersion(String cVEDataVersion) {
        this.cVEDataVersion = cVEDataVersion;
    }

    /**
     * NVD adds number of CVE in this feed
     * 
     */
    @JsonProperty("CVE_data_numberOfCVEs")
    public String getCVEDataNumberOfCVEs() {
        return cVEDataNumberOfCVEs;
    }

    /**
     * NVD adds number of CVE in this feed
     * 
     */
    @JsonProperty("CVE_data_numberOfCVEs")
    public void setCVEDataNumberOfCVEs(String cVEDataNumberOfCVEs) {
        this.cVEDataNumberOfCVEs = cVEDataNumberOfCVEs;
    }

    /**
     * NVD adds feed date timestamp
     * 
     */
    @JsonProperty("CVE_data_timestamp")
    public String getCVEDataTimestamp() {
        return cVEDataTimestamp;
    }

    /**
     * NVD adds feed date timestamp
     * 
     */
    @JsonProperty("CVE_data_timestamp")
    public void setCVEDataTimestamp(String cVEDataTimestamp) {
        this.cVEDataTimestamp = cVEDataTimestamp;
    }

    /**
     * NVD feed array of CVE
     * 
     */
    @JsonProperty("CVE_Items")
    public List<DefCveItem> getCVEItems() {
        return cVEItems;
    }

    /**
     * NVD feed array of CVE
     * 
     */
    @JsonProperty("CVE_Items")
    public void setCVEItems(List<DefCveItem> cVEItems) {
        this.cVEItems = cVEItems;
    }

}
