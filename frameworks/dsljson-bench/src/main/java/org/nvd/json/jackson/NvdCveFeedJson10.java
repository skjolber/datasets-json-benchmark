
package org.nvd.json.jackson;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * JSON Schema for NVD Vulnerability Data Feed version 1.0
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "CVE_data_type",
    "CVE_data_format",
    "CVE_data_version",
    "CVE_data_numberOfCVEs",
    "CVE_data_timestamp",
    "CVE_Items"
})
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
    @JsonPropertyDescription("NVD adds number of CVE in this feed")
    private String cVEDataNumberOfCVEs;
    /**
     * NVD adds feed date timestamp
     * 
     */
    @JsonProperty("CVE_data_timestamp")
    @JsonPropertyDescription("NVD adds feed date timestamp")
    private String cVEDataTimestamp;
    /**
     * NVD feed array of CVE
     * (Required)
     * 
     */
    @JsonProperty("CVE_Items")
    @JsonPropertyDescription("NVD feed array of CVE")
    private List<DefCveItem> cVEItems = new ArrayList<DefCveItem>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
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
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
