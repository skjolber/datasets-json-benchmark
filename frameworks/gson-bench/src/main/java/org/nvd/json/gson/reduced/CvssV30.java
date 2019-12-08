
package org.nvd.json.gson.reduced;

import java.util.HashMap;
import java.util.Map;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * JSON Schema for Common Vulnerability Scoring System version 3.0
 * <p>
 * 
 * 
 */
public class CvssV30 {

    @SerializedName("attackVector")
    @Expose
    private CvssV30 .AttackVectorType attackVector;
    @SerializedName("attackComplexity")
    @Expose
    private CvssV30 .AttackComplexityType attackComplexity;
    @SerializedName("privilegesRequired")
    @Expose
    private CvssV30 .PrivilegesRequiredType privilegesRequired;
    @SerializedName("userInteraction")
    @Expose
    private CvssV30 .UserInteractionType userInteraction;
    @SerializedName("scope")
    @Expose
    private CvssV30 .ScopeType scope;
    @SerializedName("confidentialityImpact")
    @Expose
    private CvssV30 .CiaType confidentialityImpact;
    @SerializedName("integrityImpact")
    @Expose
    private CvssV30 .CiaType integrityImpact;
    @SerializedName("availabilityImpact")
    @Expose
    private CvssV30 .CiaType availabilityImpact;
    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("baseScore")
    @Expose
    private Double baseScore;
    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("baseSeverity")
    @Expose
    private CvssV30 .SeverityType baseSeverity;

    public CvssV30 .AttackVectorType getAttackVector() {
        return attackVector;
    }

    public void setAttackVector(CvssV30 .AttackVectorType attackVector) {
        this.attackVector = attackVector;
    }

    public CvssV30 .AttackComplexityType getAttackComplexity() {
        return attackComplexity;
    }

    public void setAttackComplexity(CvssV30 .AttackComplexityType attackComplexity) {
        this.attackComplexity = attackComplexity;
    }

    public CvssV30 .PrivilegesRequiredType getPrivilegesRequired() {
        return privilegesRequired;
    }

    public void setPrivilegesRequired(CvssV30 .PrivilegesRequiredType privilegesRequired) {
        this.privilegesRequired = privilegesRequired;
    }

    public CvssV30 .UserInteractionType getUserInteraction() {
        return userInteraction;
    }

    public void setUserInteraction(CvssV30 .UserInteractionType userInteraction) {
        this.userInteraction = userInteraction;
    }

    public CvssV30 .ScopeType getScope() {
        return scope;
    }

    public void setScope(CvssV30 .ScopeType scope) {
        this.scope = scope;
    }

    public CvssV30 .CiaType getConfidentialityImpact() {
        return confidentialityImpact;
    }

    public void setConfidentialityImpact(CvssV30 .CiaType confidentialityImpact) {
        this.confidentialityImpact = confidentialityImpact;
    }

    public CvssV30 .CiaType getIntegrityImpact() {
        return integrityImpact;
    }

    public void setIntegrityImpact(CvssV30 .CiaType integrityImpact) {
        this.integrityImpact = integrityImpact;
    }

    public CvssV30 .CiaType getAvailabilityImpact() {
        return availabilityImpact;
    }

    public void setAvailabilityImpact(CvssV30 .CiaType availabilityImpact) {
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

    /**
     * 
     * (Required)
     * 
     */
    public CvssV30 .SeverityType getBaseSeverity() {
        return baseSeverity;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setBaseSeverity(CvssV30 .SeverityType baseSeverity) {
        this.baseSeverity = baseSeverity;
    }

    public enum AttackComplexityType {

        @SerializedName("HIGH")
        HIGH("HIGH"),
        @SerializedName("LOW")
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

        public static CvssV30 .AttackComplexityType fromValue(String value) {
            CvssV30 .AttackComplexityType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum AttackVectorType {

        @SerializedName("NETWORK")
        NETWORK("NETWORK"),
        @SerializedName("ADJACENT_NETWORK")
        ADJACENT_NETWORK("ADJACENT_NETWORK"),
        @SerializedName("LOCAL")
        LOCAL("LOCAL"),
        @SerializedName("PHYSICAL")
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

        public static CvssV30 .AttackVectorType fromValue(String value) {
            CvssV30 .AttackVectorType constant = CONSTANTS.get(value);
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
        @SerializedName("LOW")
        LOW("LOW"),
        @SerializedName("HIGH")
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

        public static CvssV30 .CiaType fromValue(String value) {
            CvssV30 .CiaType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum PrivilegesRequiredType {

        @SerializedName("HIGH")
        HIGH("HIGH"),
        @SerializedName("LOW")
        LOW("LOW"),
        @SerializedName("NONE")
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

        public static CvssV30 .PrivilegesRequiredType fromValue(String value) {
            CvssV30 .PrivilegesRequiredType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum ScopeType {

        @SerializedName("UNCHANGED")
        UNCHANGED("UNCHANGED"),
        @SerializedName("CHANGED")
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

        public static CvssV30 .ScopeType fromValue(String value) {
            CvssV30 .ScopeType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum SeverityType {

        @SerializedName("NONE")
        NONE("NONE"),
        @SerializedName("LOW")
        LOW("LOW"),
        @SerializedName("MEDIUM")
        MEDIUM("MEDIUM"),
        @SerializedName("HIGH")
        HIGH("HIGH"),
        @SerializedName("CRITICAL")
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

        public static CvssV30 .SeverityType fromValue(String value) {
            CvssV30 .SeverityType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum UserInteractionType {

        @SerializedName("NONE")
        NONE("NONE"),
        @SerializedName("REQUIRED")
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
