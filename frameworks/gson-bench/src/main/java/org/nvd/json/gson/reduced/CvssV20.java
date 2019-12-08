
package org.nvd.json.gson.reduced;

import java.util.HashMap;
import java.util.Map;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * JSON Schema for Common Vulnerability Scoring System version 2.0
 * <p>
 * 
 * 
 */
public class CvssV20 {

    @SerializedName("accessVector")
    @Expose
    private CvssV20 .AccessVectorType accessVector;
    @SerializedName("accessComplexity")
    @Expose
    private CvssV20 .AccessComplexityType accessComplexity;
    @SerializedName("authentication")
    @Expose
    private CvssV20 .AuthenticationType authentication;
    @SerializedName("confidentialityImpact")
    @Expose
    private CvssV20 .CiaType confidentialityImpact;
    @SerializedName("integrityImpact")
    @Expose
    private CvssV20 .CiaType integrityImpact;
    @SerializedName("availabilityImpact")
    @Expose
    private CvssV20 .CiaType availabilityImpact;
    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("baseScore")
    @Expose
    private Double baseScore;

    public CvssV20 .AccessVectorType getAccessVector() {
        return accessVector;
    }

    public void setAccessVector(CvssV20 .AccessVectorType accessVector) {
        this.accessVector = accessVector;
    }

    public CvssV20 .AccessComplexityType getAccessComplexity() {
        return accessComplexity;
    }

    public void setAccessComplexity(CvssV20 .AccessComplexityType accessComplexity) {
        this.accessComplexity = accessComplexity;
    }

    public CvssV20 .AuthenticationType getAuthentication() {
        return authentication;
    }

    public void setAuthentication(CvssV20 .AuthenticationType authentication) {
        this.authentication = authentication;
    }

    public CvssV20 .CiaType getConfidentialityImpact() {
        return confidentialityImpact;
    }

    public void setConfidentialityImpact(CvssV20 .CiaType confidentialityImpact) {
        this.confidentialityImpact = confidentialityImpact;
    }

    public CvssV20 .CiaType getIntegrityImpact() {
        return integrityImpact;
    }

    public void setIntegrityImpact(CvssV20 .CiaType integrityImpact) {
        this.integrityImpact = integrityImpact;
    }

    public CvssV20 .CiaType getAvailabilityImpact() {
        return availabilityImpact;
    }

    public void setAvailabilityImpact(CvssV20 .CiaType availabilityImpact) {
        this.availabilityImpact = availabilityImpact;
    }

    /**
     * 
     * (Required)
     * 
     */
    public Double getBaseScore() {
        return baseScore;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setBaseScore(Double baseScore) {
        this.baseScore = baseScore;
    }

    public enum AccessComplexityType {

        @SerializedName("HIGH")
        HIGH("HIGH"),
        @SerializedName("MEDIUM")
        MEDIUM("MEDIUM"),
        @SerializedName("LOW")
        LOW("LOW");
        private final String value;
        private final static Map<String, CvssV20 .AccessComplexityType> CONSTANTS = new HashMap<String, CvssV20 .AccessComplexityType>();

        static {
            for (CvssV20 .AccessComplexityType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private AccessComplexityType(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        public String value() {
            return this.value;
        }

        public static CvssV20 .AccessComplexityType fromValue(String value) {
            CvssV20 .AccessComplexityType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum AccessVectorType {

        @SerializedName("NETWORK")
        NETWORK("NETWORK"),
        @SerializedName("ADJACENT_NETWORK")
        ADJACENT_NETWORK("ADJACENT_NETWORK"),
        @SerializedName("LOCAL")
        LOCAL("LOCAL");
        private final String value;
        private final static Map<String, CvssV20 .AccessVectorType> CONSTANTS = new HashMap<String, CvssV20 .AccessVectorType>();

        static {
            for (CvssV20 .AccessVectorType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private AccessVectorType(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        public String value() {
            return this.value;
        }

        public static CvssV20 .AccessVectorType fromValue(String value) {
            CvssV20 .AccessVectorType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum AuthenticationType {

        @SerializedName("MULTIPLE")
        MULTIPLE("MULTIPLE"),
        @SerializedName("SINGLE")
        SINGLE("SINGLE"),
        @SerializedName("NONE")
        NONE("NONE");
        private final String value;
        private final static Map<String, CvssV20 .AuthenticationType> CONSTANTS = new HashMap<String, CvssV20 .AuthenticationType>();

        static {
            for (CvssV20 .AuthenticationType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private AuthenticationType(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        public String value() {
            return this.value;
        }

        public static CvssV20 .AuthenticationType fromValue(String value) {
            CvssV20 .AuthenticationType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum CiaType {

        @SerializedName("NONE")
        NONE("NONE"),
        @SerializedName("PARTIAL")
        PARTIAL("PARTIAL"),
        @SerializedName("COMPLETE")
        COMPLETE("COMPLETE");
        private final String value;
        private final static Map<String, CvssV20 .CiaType> CONSTANTS = new HashMap<String, CvssV20 .CiaType>();

        static {
            for (CvssV20 .CiaType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private CiaType(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        public String value() {
            return this.value;
        }

        public static CvssV20 .CiaType fromValue(String value) {
            CvssV20 .CiaType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
