
package org.nvd.json.gson;

import java.util.HashMap;
import java.util.Map;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CVEJSON40Min {

    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("data_type")
    @Expose
    private CVEJSON40Min.DataType dataType;
    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("data_format")
    @Expose
    private CVEJSON40Min.DataFormat dataFormat;
    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("data_version")
    @Expose
    private CVEJSON40Min.DataVersion dataVersion;
    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("CVE_data_meta")
    @Expose
    private CVEDataMeta cVEDataMeta;
    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("affects")
    @Expose
    private Affects affects;
    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("problemtype")
    @Expose
    private Problemtype problemtype;
    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("references")
    @Expose
    private References references;
    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("description")
    @Expose
    private Description description;

    /**
     * 
     * (Required)
     * 
     */
    public CVEJSON40Min.DataType getDataType() {
        return dataType;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setDataType(CVEJSON40Min.DataType dataType) {
        this.dataType = dataType;
    }

    /**
     * 
     * (Required)
     * 
     */
    public CVEJSON40Min.DataFormat getDataFormat() {
        return dataFormat;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setDataFormat(CVEJSON40Min.DataFormat dataFormat) {
        this.dataFormat = dataFormat;
    }

    /**
     * 
     * (Required)
     * 
     */
    public CVEJSON40Min.DataVersion getDataVersion() {
        return dataVersion;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setDataVersion(CVEJSON40Min.DataVersion dataVersion) {
        this.dataVersion = dataVersion;
    }

    public CVEDataMeta getCVEDataMeta() {
        return cVEDataMeta;
    }

    public void setCVEDataMeta(CVEDataMeta cVEDataMeta) {
        this.cVEDataMeta = cVEDataMeta;
    }

    /**
     * 
     * (Required)
     * 
     */
    public Affects getAffects() {
        return affects;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setAffects(Affects affects) {
        this.affects = affects;
    }

    /**
     * 
     * (Required)
     * 
     */
    public Problemtype getProblemtype() {
        return problemtype;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setProblemtype(Problemtype problemtype) {
        this.problemtype = problemtype;
    }

    /**
     * 
     * (Required)
     * 
     */
    public References getReferences() {
        return references;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setReferences(References references) {
        this.references = references;
    }

    /**
     * 
     * (Required)
     * 
     */
    public Description getDescription() {
        return description;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setDescription(Description description) {
        this.description = description;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CVEJSON40Min.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("dataType");
        sb.append('=');
        sb.append(((this.dataType == null)?"<null>":this.dataType));
        sb.append(',');
        sb.append("dataFormat");
        sb.append('=');
        sb.append(((this.dataFormat == null)?"<null>":this.dataFormat));
        sb.append(',');
        sb.append("dataVersion");
        sb.append('=');
        sb.append(((this.dataVersion == null)?"<null>":this.dataVersion));
        sb.append(',');
        sb.append("cVEDataMeta");
        sb.append('=');
        sb.append(((this.cVEDataMeta == null)?"<null>":this.cVEDataMeta));
        sb.append(',');
        sb.append("affects");
        sb.append('=');
        sb.append(((this.affects == null)?"<null>":this.affects));
        sb.append(',');
        sb.append("problemtype");
        sb.append('=');
        sb.append(((this.problemtype == null)?"<null>":this.problemtype));
        sb.append(',');
        sb.append("references");
        sb.append('=');
        sb.append(((this.references == null)?"<null>":this.references));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    public enum DataFormat {

        @SerializedName("MITRE")
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

        @SerializedName("CVE")
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

        @SerializedName("4.0")
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
