
package org.nvd.json.jsoniter.reduced;

import java.util.HashMap;
import java.util.Map;

import org.nvd.json.jsoniter.reduced.CvssV20;

import com.jsoniter.annotation.JsonCreator;
import com.jsoniter.annotation.JsonProperty;

public class CvssV20 {

    @JsonProperty("accessVector")
    private CvssV20 .AccessVectorType accessVector;
    @JsonProperty("accessComplexity")
    private CvssV20 .AccessComplexityType accessComplexity;
    @JsonProperty("authentication")
    private CvssV20 .AuthenticationType authentication;
    @JsonProperty("confidentialityImpact")
    private CvssV20 .CiaType confidentialityImpact;
    @JsonProperty("integrityImpact")
    private CvssV20 .CiaType integrityImpact;
    @JsonProperty("availabilityImpact")
    private CvssV20 .CiaType availabilityImpact;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("baseScore")
    private Double baseScore;

    @JsonProperty("accessVector")
    public CvssV20 .AccessVectorType getAccessVector() {
        return accessVector;
    }

    @JsonProperty("accessVector")
    public void setAccessVector(CvssV20 .AccessVectorType accessVector) {
        this.accessVector = accessVector;
    }

    @JsonProperty("accessComplexity")
    public CvssV20 .AccessComplexityType getAccessComplexity() {
        return accessComplexity;
    }

    @JsonProperty("accessComplexity")
    public void setAccessComplexity(CvssV20 .AccessComplexityType accessComplexity) {
        this.accessComplexity = accessComplexity;
    }

    @JsonProperty("authentication")
    public CvssV20 .AuthenticationType getAuthentication() {
        return authentication;
    }

    @JsonProperty("authentication")
    public void setAuthentication(CvssV20 .AuthenticationType authentication) {
        this.authentication = authentication;
    }

    @JsonProperty("confidentialityImpact")
    public CvssV20 .CiaType getConfidentialityImpact() {
        return confidentialityImpact;
    }

    @JsonProperty("confidentialityImpact")
    public void setConfidentialityImpact(CvssV20 .CiaType confidentialityImpact) {
        this.confidentialityImpact = confidentialityImpact;
    }

    @JsonProperty("integrityImpact")
    public CvssV20 .CiaType getIntegrityImpact() {
        return integrityImpact;
    }

    @JsonProperty("integrityImpact")
    public void setIntegrityImpact(CvssV20 .CiaType integrityImpact) {
        this.integrityImpact = integrityImpact;
    }

    @JsonProperty("availabilityImpact")
    public CvssV20 .CiaType getAvailabilityImpact() {
        return availabilityImpact;
    }

    @JsonProperty("availabilityImpact")
    public void setAvailabilityImpact(CvssV20 .CiaType availabilityImpact) {
        this.availabilityImpact = availabilityImpact;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("baseScore")
    public Double getBaseScore() {
        return baseScore;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("baseScore")
    public void setBaseScore(Double baseScore) {
        this.baseScore = baseScore;
    }

    public static enum AccessComplexityType {

        HIGH("HIGH"),
        MEDIUM("MEDIUM"),
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

        @JsonCreator
        public static CvssV20 .AccessComplexityType fromValue(String value) {
            CvssV20 .AccessComplexityType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public static enum AccessVectorType {

        NETWORK("NETWORK"),
        ADJACENT_NETWORK("ADJACENT_NETWORK"),
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

        @JsonCreator
        public static CvssV20 .AccessVectorType fromValue(String value) {
            CvssV20 .AccessVectorType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public static enum AuthenticationType {

        MULTIPLE("MULTIPLE"),
        SINGLE("SINGLE"),
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

        @JsonCreator
        public static CvssV20 .AuthenticationType fromValue(String value) {
            CvssV20 .AuthenticationType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public static enum CiaType {

        NONE("NONE"),
        PARTIAL("PARTIAL"),
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

        @JsonCreator
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
