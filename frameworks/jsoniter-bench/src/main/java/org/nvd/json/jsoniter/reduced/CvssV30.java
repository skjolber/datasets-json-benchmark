
package org.nvd.json.jsoniter.reduced;

import java.util.HashMap;
import java.util.Map;

import org.nvd.json.jsoniter.reduced.CvssV30;

import com.jsoniter.annotation.JsonCreator;
import com.jsoniter.annotation.JsonProperty;

/**
 * JSON Schema for Common Vulnerability Scoring System version 3.0
 * <p>
 * 
 * 
 */

public class CvssV30 {

    @JsonProperty("attackVector")
    private CvssV30 .AttackVectorType attackVector;
    @JsonProperty("attackComplexity")
    private CvssV30 .AttackComplexityType attackComplexity;
    @JsonProperty("privilegesRequired")
    private CvssV30 .PrivilegesRequiredType privilegesRequired;
    @JsonProperty("userInteraction")
    private CvssV30 .UserInteractionType userInteraction;
    @JsonProperty("scope")
    private CvssV30 .ScopeType scope;
    @JsonProperty("confidentialityImpact")
    private CvssV30 .CiaType confidentialityImpact;
    @JsonProperty("integrityImpact")
    private CvssV30 .CiaType integrityImpact;
    @JsonProperty("availabilityImpact")
    private CvssV30 .CiaType availabilityImpact;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("baseScore")
    private Double baseScore;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("baseSeverity")
    private CvssV30 .SeverityType baseSeverity;

    @JsonProperty("attackVector")
    public CvssV30 .AttackVectorType getAttackVector() {
        return attackVector;
    }

    @JsonProperty("attackVector")
    public void setAttackVector(CvssV30 .AttackVectorType attackVector) {
        this.attackVector = attackVector;
    }

    @JsonProperty("attackComplexity")
    public CvssV30 .AttackComplexityType getAttackComplexity() {
        return attackComplexity;
    }

    @JsonProperty("attackComplexity")
    public void setAttackComplexity(CvssV30 .AttackComplexityType attackComplexity) {
        this.attackComplexity = attackComplexity;
    }

    @JsonProperty("privilegesRequired")
    public CvssV30 .PrivilegesRequiredType getPrivilegesRequired() {
        return privilegesRequired;
    }

    @JsonProperty("privilegesRequired")
    public void setPrivilegesRequired(CvssV30 .PrivilegesRequiredType privilegesRequired) {
        this.privilegesRequired = privilegesRequired;
    }

    @JsonProperty("userInteraction")
    public CvssV30 .UserInteractionType getUserInteraction() {
        return userInteraction;
    }

    @JsonProperty("userInteraction")
    public void setUserInteraction(CvssV30 .UserInteractionType userInteraction) {
        this.userInteraction = userInteraction;
    }

    @JsonProperty("scope")
    public CvssV30 .ScopeType getScope() {
        return scope;
    }

    @JsonProperty("scope")
    public void setScope(CvssV30 .ScopeType scope) {
        this.scope = scope;
    }

    @JsonProperty("confidentialityImpact")
    public CvssV30 .CiaType getConfidentialityImpact() {
        return confidentialityImpact;
    }

    @JsonProperty("confidentialityImpact")
    public void setConfidentialityImpact(CvssV30 .CiaType confidentialityImpact) {
        this.confidentialityImpact = confidentialityImpact;
    }

    @JsonProperty("integrityImpact")
    public CvssV30 .CiaType getIntegrityImpact() {
        return integrityImpact;
    }

    @JsonProperty("integrityImpact")
    public void setIntegrityImpact(CvssV30 .CiaType integrityImpact) {
        this.integrityImpact = integrityImpact;
    }

    @JsonProperty("availabilityImpact")
    public CvssV30 .CiaType getAvailabilityImpact() {
        return availabilityImpact;
    }

    @JsonProperty("availabilityImpact")
    public void setAvailabilityImpact(CvssV30 .CiaType availabilityImpact) {
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

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("baseSeverity")
    public CvssV30 .SeverityType getBaseSeverity() {
        return baseSeverity;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("baseSeverity")
    public void setBaseSeverity(CvssV30 .SeverityType baseSeverity) {
        this.baseSeverity = baseSeverity;
    }

    public static enum AttackComplexityType {

        HIGH("HIGH"),
        LOW("LOW");
        private final String value;
        private final static Map<String, CvssV30 .AttackComplexityType> CONSTANTS = new HashMap<String, CvssV30 .AttackComplexityType>();

        static {
            for (CvssV30 .AttackComplexityType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private AttackComplexityType(String value) {
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
        public static CvssV30 .AttackComplexityType fromValue(String value) {
            CvssV30 .AttackComplexityType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public static enum AttackVectorType {

        NETWORK("NETWORK"),
        ADJACENT_NETWORK("ADJACENT_NETWORK"),
        LOCAL("LOCAL"),
        PHYSICAL("PHYSICAL");
        private final String value;
        private final static Map<String, CvssV30 .AttackVectorType> CONSTANTS = new HashMap<String, CvssV30 .AttackVectorType>();

        static {
            for (CvssV30 .AttackVectorType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private AttackVectorType(String value) {
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
        public static CvssV30 .AttackVectorType fromValue(String value) {
            CvssV30 .AttackVectorType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public static enum CiaType {

        NONE("NONE"),
        LOW("LOW"),
        HIGH("HIGH");
        private final String value;
        private final static Map<String, CvssV30 .CiaType> CONSTANTS = new HashMap<String, CvssV30 .CiaType>();

        static {
            for (CvssV30 .CiaType c: values()) {
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
        public static CvssV30 .CiaType fromValue(String value) {
            CvssV30 .CiaType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public static enum PrivilegesRequiredType {

        HIGH("HIGH"),
        LOW("LOW"),
        NONE("NONE");
        private final String value;
        private final static Map<String, CvssV30 .PrivilegesRequiredType> CONSTANTS = new HashMap<String, CvssV30 .PrivilegesRequiredType>();

        static {
            for (CvssV30 .PrivilegesRequiredType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private PrivilegesRequiredType(String value) {
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
        public static CvssV30 .PrivilegesRequiredType fromValue(String value) {
            CvssV30 .PrivilegesRequiredType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public static enum ScopeType {

        UNCHANGED("UNCHANGED"),
        CHANGED("CHANGED");
        private final String value;
        private final static Map<String, CvssV30 .ScopeType> CONSTANTS = new HashMap<String, CvssV30 .ScopeType>();

        static {
            for (CvssV30 .ScopeType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private ScopeType(String value) {
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
        public static CvssV30 .ScopeType fromValue(String value) {
            CvssV30 .ScopeType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public static enum SeverityType {

        NONE("NONE"),
        LOW("LOW"),
        MEDIUM("MEDIUM"),
        HIGH("HIGH"),
        CRITICAL("CRITICAL");
        private final String value;
        private final static Map<String, CvssV30 .SeverityType> CONSTANTS = new HashMap<String, CvssV30 .SeverityType>();

        static {
            for (CvssV30 .SeverityType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private SeverityType(String value) {
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
        public static CvssV30 .SeverityType fromValue(String value) {
            CvssV30 .SeverityType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public static enum UserInteractionType {

        NONE("NONE"),
        REQUIRED("REQUIRED");
        private final String value;
        private final static Map<String, CvssV30 .UserInteractionType> CONSTANTS = new HashMap<String, CvssV30 .UserInteractionType>();

        static {
            for (CvssV30 .UserInteractionType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private UserInteractionType(String value) {
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
        public static CvssV30 .UserInteractionType fromValue(String value) {
            CvssV30 .UserInteractionType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
