
package org.nvd.json.jsoniter;

import java.util.HashMap;
import java.util.Map;

import com.jsoniter.annotation.JsonCreator;
import com.jsoniter.annotation.JsonProperty;


public class CVEJSON40Min {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("data_type")
    private CVEJSON40Min.DataType dataType;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("data_format")
    private CVEJSON40Min.DataFormat dataFormat;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("data_version")
    private CVEJSON40Min.DataVersion dataVersion;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("CVE_data_meta")
    private CVEDataMeta cVEDataMeta;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("affects")
    private Affects affects;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("problemtype")
    private Problemtype problemtype;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("references")
    private References references;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("description")
    private Description description;

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("data_type")
    public CVEJSON40Min.DataType getDataType() {
        return dataType;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("data_type")
    public void setDataType(CVEJSON40Min.DataType dataType) {
        this.dataType = dataType;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("data_format")
    public CVEJSON40Min.DataFormat getDataFormat() {
        return dataFormat;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("data_format")
    public void setDataFormat(CVEJSON40Min.DataFormat dataFormat) {
        this.dataFormat = dataFormat;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("data_version")
    public CVEJSON40Min.DataVersion getDataVersion() {
        return dataVersion;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("data_version")
    public void setDataVersion(CVEJSON40Min.DataVersion dataVersion) {
        this.dataVersion = dataVersion;
    }

    @JsonProperty("CVE_data_meta")
    public CVEDataMeta getCVEDataMeta() {
        return cVEDataMeta;
    }

    @JsonProperty("CVE_data_meta")
    public void setCVEDataMeta(CVEDataMeta cVEDataMeta) {
        this.cVEDataMeta = cVEDataMeta;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("affects")
    public Affects getAffects() {
        return affects;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("affects")
    public void setAffects(Affects affects) {
        this.affects = affects;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("problemtype")
    public Problemtype getProblemtype() {
        return problemtype;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("problemtype")
    public void setProblemtype(Problemtype problemtype) {
        this.problemtype = problemtype;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("references")
    public References getReferences() {
        return references;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("references")
    public void setReferences(References references) {
        this.references = references;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("description")
    public Description getDescription() {
        return description;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("description")
    public void setDescription(Description description) {
        this.description = description;
    }

    public enum DataFormat {

        MITRE("MITRE");
        private final String value;
        private final static Map<String, CVEJSON40Min.DataFormat> CONSTANTS = new HashMap<String, CVEJSON40Min.DataFormat>();

        static {
            for (CVEJSON40Min.DataFormat c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private DataFormat(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        public String value() {
            return this.value;
        }

        @JsonCreator
        public static CVEJSON40Min.DataFormat fromValue(String value) {
            CVEJSON40Min.DataFormat constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum DataType {

        CVE("CVE");
        private final String value;
        private final static Map<String, CVEJSON40Min.DataType> CONSTANTS = new HashMap<String, CVEJSON40Min.DataType>();

        static {
            for (CVEJSON40Min.DataType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private DataType(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        public String value() {
            return this.value;
        }

        @JsonCreator
        public static CVEJSON40Min.DataType fromValue(String value) {
            CVEJSON40Min.DataType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum DataVersion {

        _4_0("4.0");
        private final String value;
        private final static Map<String, CVEJSON40Min.DataVersion> CONSTANTS = new HashMap<String, CVEJSON40Min.DataVersion>();

        static {
            for (CVEJSON40Min.DataVersion c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private DataVersion(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        public String value() {
            return this.value;
        }

        @JsonCreator
        public static CVEJSON40Min.DataVersion fromValue(String value) {
            CVEJSON40Min.DataVersion constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
