
package org.nvd.json.jsoniter;

import java.util.HashMap;
import java.util.Map;

import com.jsoniter.annotation.JsonCreator;
import com.jsoniter.annotation.JsonProperty;



/**
 * JSON Schema for Common Vulnerability Scoring System version 3.0
 * <p>
 * 
 * 
 */

public class CvssV30 {

    /**
     * CVSS Version
     * (Required)
     * 
     */
    @JsonProperty("version")
    private CvssV30 .Version version;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("vectorString")
    private String vectorString;
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
    @JsonProperty("exploitCodeMaturity")
    private CvssV30 .ExploitCodeMaturityType exploitCodeMaturity;
    @JsonProperty("remediationLevel")
    private CvssV30 .RemediationLevelType remediationLevel;
    @JsonProperty("reportConfidence")
    private CvssV30 .ConfidenceType reportConfidence;
    @JsonProperty("temporalScore")
    private Double temporalScore;
    @JsonProperty("temporalSeverity")
    private CvssV30 .SeverityType temporalSeverity;
    @JsonProperty("confidentialityRequirement")
    private CvssV30 .CiaRequirementType confidentialityRequirement;
    @JsonProperty("integrityRequirement")
    private CvssV30 .CiaRequirementType integrityRequirement;
    @JsonProperty("availabilityRequirement")
    private CvssV30 .CiaRequirementType availabilityRequirement;
    @JsonProperty("modifiedAttackVector")
    private CvssV30 .ModifiedAttackVectorType modifiedAttackVector;
    @JsonProperty("modifiedAttackComplexity")
    private CvssV30 .ModifiedAttackComplexityType modifiedAttackComplexity;
    @JsonProperty("modifiedPrivilegesRequired")
    private CvssV30 .ModifiedPrivilegesRequiredType modifiedPrivilegesRequired;
    @JsonProperty("modifiedUserInteraction")
    private CvssV30 .ModifiedUserInteractionType modifiedUserInteraction;
    @JsonProperty("modifiedScope")
    private CvssV30 .ModifiedScopeType modifiedScope;
    @JsonProperty("modifiedConfidentialityImpact")
    private CvssV30 .ModifiedCiaType modifiedConfidentialityImpact;
    @JsonProperty("modifiedIntegrityImpact")
    private CvssV30 .ModifiedCiaType modifiedIntegrityImpact;
    @JsonProperty("modifiedAvailabilityImpact")
    private CvssV30 .ModifiedCiaType modifiedAvailabilityImpact;
    @JsonProperty("environmentalScore")
    private Double environmentalScore;
    @JsonProperty("environmentalSeverity")
    private CvssV30 .SeverityType environmentalSeverity;

    /**
     * CVSS Version
     * (Required)
     * 
     */
    @JsonProperty("version")
    public CvssV30 .Version getVersion() {
        return version;
    }

    /**
     * CVSS Version
     * (Required)
     * 
     */
    @JsonProperty("version")
    public void setVersion(CvssV30 .Version version) {
        this.version = version;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("vectorString")
    public String getVectorString() {
        return vectorString;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("vectorString")
    public void setVectorString(String vectorString) {
        this.vectorString = vectorString;
    }

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

    @JsonProperty("exploitCodeMaturity")
    public CvssV30 .ExploitCodeMaturityType getExploitCodeMaturity() {
        return exploitCodeMaturity;
    }

    @JsonProperty("exploitCodeMaturity")
    public void setExploitCodeMaturity(CvssV30 .ExploitCodeMaturityType exploitCodeMaturity) {
        this.exploitCodeMaturity = exploitCodeMaturity;
    }

    @JsonProperty("remediationLevel")
    public CvssV30 .RemediationLevelType getRemediationLevel() {
        return remediationLevel;
    }

    @JsonProperty("remediationLevel")
    public void setRemediationLevel(CvssV30 .RemediationLevelType remediationLevel) {
        this.remediationLevel = remediationLevel;
    }

    @JsonProperty("reportConfidence")
    public CvssV30 .ConfidenceType getReportConfidence() {
        return reportConfidence;
    }

    @JsonProperty("reportConfidence")
    public void setReportConfidence(CvssV30 .ConfidenceType reportConfidence) {
        this.reportConfidence = reportConfidence;
    }

    @JsonProperty("temporalScore")
    public Double getTemporalScore() {
        return temporalScore;
    }

    @JsonProperty("temporalScore")
    public void setTemporalScore(Double temporalScore) {
        this.temporalScore = temporalScore;
    }

    @JsonProperty("temporalSeverity")
    public CvssV30 .SeverityType getTemporalSeverity() {
        return temporalSeverity;
    }

    @JsonProperty("temporalSeverity")
    public void setTemporalSeverity(CvssV30 .SeverityType temporalSeverity) {
        this.temporalSeverity = temporalSeverity;
    }

    @JsonProperty("confidentialityRequirement")
    public CvssV30 .CiaRequirementType getConfidentialityRequirement() {
        return confidentialityRequirement;
    }

    @JsonProperty("confidentialityRequirement")
    public void setConfidentialityRequirement(CvssV30 .CiaRequirementType confidentialityRequirement) {
        this.confidentialityRequirement = confidentialityRequirement;
    }

    @JsonProperty("integrityRequirement")
    public CvssV30 .CiaRequirementType getIntegrityRequirement() {
        return integrityRequirement;
    }

    @JsonProperty("integrityRequirement")
    public void setIntegrityRequirement(CvssV30 .CiaRequirementType integrityRequirement) {
        this.integrityRequirement = integrityRequirement;
    }

    @JsonProperty("availabilityRequirement")
    public CvssV30 .CiaRequirementType getAvailabilityRequirement() {
        return availabilityRequirement;
    }

    @JsonProperty("availabilityRequirement")
    public void setAvailabilityRequirement(CvssV30 .CiaRequirementType availabilityRequirement) {
        this.availabilityRequirement = availabilityRequirement;
    }

    @JsonProperty("modifiedAttackVector")
    public CvssV30 .ModifiedAttackVectorType getModifiedAttackVector() {
        return modifiedAttackVector;
    }

    @JsonProperty("modifiedAttackVector")
    public void setModifiedAttackVector(CvssV30 .ModifiedAttackVectorType modifiedAttackVector) {
        this.modifiedAttackVector = modifiedAttackVector;
    }

    @JsonProperty("modifiedAttackComplexity")
    public CvssV30 .ModifiedAttackComplexityType getModifiedAttackComplexity() {
        return modifiedAttackComplexity;
    }

    @JsonProperty("modifiedAttackComplexity")
    public void setModifiedAttackComplexity(CvssV30 .ModifiedAttackComplexityType modifiedAttackComplexity) {
        this.modifiedAttackComplexity = modifiedAttackComplexity;
    }

    @JsonProperty("modifiedPrivilegesRequired")
    public CvssV30 .ModifiedPrivilegesRequiredType getModifiedPrivilegesRequired() {
        return modifiedPrivilegesRequired;
    }

    @JsonProperty("modifiedPrivilegesRequired")
    public void setModifiedPrivilegesRequired(CvssV30 .ModifiedPrivilegesRequiredType modifiedPrivilegesRequired) {
        this.modifiedPrivilegesRequired = modifiedPrivilegesRequired;
    }

    @JsonProperty("modifiedUserInteraction")
    public CvssV30 .ModifiedUserInteractionType getModifiedUserInteraction() {
        return modifiedUserInteraction;
    }

    @JsonProperty("modifiedUserInteraction")
    public void setModifiedUserInteraction(CvssV30 .ModifiedUserInteractionType modifiedUserInteraction) {
        this.modifiedUserInteraction = modifiedUserInteraction;
    }

    @JsonProperty("modifiedScope")
    public CvssV30 .ModifiedScopeType getModifiedScope() {
        return modifiedScope;
    }

    @JsonProperty("modifiedScope")
    public void setModifiedScope(CvssV30 .ModifiedScopeType modifiedScope) {
        this.modifiedScope = modifiedScope;
    }

    @JsonProperty("modifiedConfidentialityImpact")
    public CvssV30 .ModifiedCiaType getModifiedConfidentialityImpact() {
        return modifiedConfidentialityImpact;
    }

    @JsonProperty("modifiedConfidentialityImpact")
    public void setModifiedConfidentialityImpact(CvssV30 .ModifiedCiaType modifiedConfidentialityImpact) {
        this.modifiedConfidentialityImpact = modifiedConfidentialityImpact;
    }

    @JsonProperty("modifiedIntegrityImpact")
    public CvssV30 .ModifiedCiaType getModifiedIntegrityImpact() {
        return modifiedIntegrityImpact;
    }

    @JsonProperty("modifiedIntegrityImpact")
    public void setModifiedIntegrityImpact(CvssV30 .ModifiedCiaType modifiedIntegrityImpact) {
        this.modifiedIntegrityImpact = modifiedIntegrityImpact;
    }

    @JsonProperty("modifiedAvailabilityImpact")
    public CvssV30 .ModifiedCiaType getModifiedAvailabilityImpact() {
        return modifiedAvailabilityImpact;
    }

    @JsonProperty("modifiedAvailabilityImpact")
    public void setModifiedAvailabilityImpact(CvssV30 .ModifiedCiaType modifiedAvailabilityImpact) {
        this.modifiedAvailabilityImpact = modifiedAvailabilityImpact;
    }

    @JsonProperty("environmentalScore")
    public Double getEnvironmentalScore() {
        return environmentalScore;
    }

    @JsonProperty("environmentalScore")
    public void setEnvironmentalScore(Double environmentalScore) {
        this.environmentalScore = environmentalScore;
    }

    @JsonProperty("environmentalSeverity")
    public CvssV30 .SeverityType getEnvironmentalSeverity() {
        return environmentalSeverity;
    }

    @JsonProperty("environmentalSeverity")
    public void setEnvironmentalSeverity(CvssV30 .SeverityType environmentalSeverity) {
        this.environmentalSeverity = environmentalSeverity;
    }

    public enum AttackComplexityType {

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

    public enum AttackVectorType {

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

    public enum CiaRequirementType {

        LOW("LOW"),
        MEDIUM("MEDIUM"),
        HIGH("HIGH"),
        NOT_DEFINED("NOT_DEFINED");
        private final String value;
        private final static Map<String, CvssV30 .CiaRequirementType> CONSTANTS = new HashMap<String, CvssV30 .CiaRequirementType>();

        static {
            for (CvssV30 .CiaRequirementType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private CiaRequirementType(String value) {
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
        public static CvssV30 .CiaRequirementType fromValue(String value) {
            CvssV30 .CiaRequirementType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum CiaType {

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

    public enum ConfidenceType {

        UNKNOWN("UNKNOWN"),
        REASONABLE("REASONABLE"),
        CONFIRMED("CONFIRMED"),
        NOT_DEFINED("NOT_DEFINED");
        private final String value;
        private final static Map<String, CvssV30 .ConfidenceType> CONSTANTS = new HashMap<String, CvssV30 .ConfidenceType>();

        static {
            for (CvssV30 .ConfidenceType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private ConfidenceType(String value) {
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
        public static CvssV30 .ConfidenceType fromValue(String value) {
            CvssV30 .ConfidenceType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum ExploitCodeMaturityType {

        UNPROVEN("UNPROVEN"),
        PROOF_OF_CONCEPT("PROOF_OF_CONCEPT"),
        FUNCTIONAL("FUNCTIONAL"),
        HIGH("HIGH"),
        NOT_DEFINED("NOT_DEFINED");
        private final String value;
        private final static Map<String, CvssV30 .ExploitCodeMaturityType> CONSTANTS = new HashMap<String, CvssV30 .ExploitCodeMaturityType>();

        static {
            for (CvssV30 .ExploitCodeMaturityType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private ExploitCodeMaturityType(String value) {
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
        public static CvssV30 .ExploitCodeMaturityType fromValue(String value) {
            CvssV30 .ExploitCodeMaturityType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum ModifiedAttackComplexityType {

        HIGH("HIGH"),
        LOW("LOW"),
        NOT_DEFINED("NOT_DEFINED");
        private final String value;
        private final static Map<String, CvssV30 .ModifiedAttackComplexityType> CONSTANTS = new HashMap<String, CvssV30 .ModifiedAttackComplexityType>();

        static {
            for (CvssV30 .ModifiedAttackComplexityType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private ModifiedAttackComplexityType(String value) {
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
        public static CvssV30 .ModifiedAttackComplexityType fromValue(String value) {
            CvssV30 .ModifiedAttackComplexityType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum ModifiedAttackVectorType {

        NETWORK("NETWORK"),
        ADJACENT_NETWORK("ADJACENT_NETWORK"),
        LOCAL("LOCAL"),
        PHYSICAL("PHYSICAL"),
        NOT_DEFINED("NOT_DEFINED");
        private final String value;
        private final static Map<String, CvssV30 .ModifiedAttackVectorType> CONSTANTS = new HashMap<String, CvssV30 .ModifiedAttackVectorType>();

        static {
            for (CvssV30 .ModifiedAttackVectorType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private ModifiedAttackVectorType(String value) {
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
        public static CvssV30 .ModifiedAttackVectorType fromValue(String value) {
            CvssV30 .ModifiedAttackVectorType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum ModifiedCiaType {

        NONE("NONE"),
        LOW("LOW"),
        HIGH("HIGH"),
        NOT_DEFINED("NOT_DEFINED");
        private final String value;
        private final static Map<String, CvssV30 .ModifiedCiaType> CONSTANTS = new HashMap<String, CvssV30 .ModifiedCiaType>();

        static {
            for (CvssV30 .ModifiedCiaType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private ModifiedCiaType(String value) {
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
        public static CvssV30 .ModifiedCiaType fromValue(String value) {
            CvssV30 .ModifiedCiaType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum ModifiedPrivilegesRequiredType {

        HIGH("HIGH"),
        LOW("LOW"),
        NONE("NONE"),
        NOT_DEFINED("NOT_DEFINED");
        private final String value;
        private final static Map<String, CvssV30 .ModifiedPrivilegesRequiredType> CONSTANTS = new HashMap<String, CvssV30 .ModifiedPrivilegesRequiredType>();

        static {
            for (CvssV30 .ModifiedPrivilegesRequiredType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private ModifiedPrivilegesRequiredType(String value) {
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
        public static CvssV30 .ModifiedPrivilegesRequiredType fromValue(String value) {
            CvssV30 .ModifiedPrivilegesRequiredType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum ModifiedScopeType {

        UNCHANGED("UNCHANGED"),
        CHANGED("CHANGED"),
        NOT_DEFINED("NOT_DEFINED");
        private final String value;
        private final static Map<String, CvssV30 .ModifiedScopeType> CONSTANTS = new HashMap<String, CvssV30 .ModifiedScopeType>();

        static {
            for (CvssV30 .ModifiedScopeType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private ModifiedScopeType(String value) {
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
        public static CvssV30 .ModifiedScopeType fromValue(String value) {
            CvssV30 .ModifiedScopeType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum ModifiedUserInteractionType {

        NONE("NONE"),
        REQUIRED("REQUIRED"),
        NOT_DEFINED("NOT_DEFINED");
        private final String value;
        private final static Map<String, CvssV30 .ModifiedUserInteractionType> CONSTANTS = new HashMap<String, CvssV30 .ModifiedUserInteractionType>();

        static {
            for (CvssV30 .ModifiedUserInteractionType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private ModifiedUserInteractionType(String value) {
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
        public static CvssV30 .ModifiedUserInteractionType fromValue(String value) {
            CvssV30 .ModifiedUserInteractionType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum PrivilegesRequiredType {

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

    public enum RemediationLevelType {

        OFFICIAL_FIX("OFFICIAL_FIX"),
        TEMPORARY_FIX("TEMPORARY_FIX"),
        WORKAROUND("WORKAROUND"),
        UNAVAILABLE("UNAVAILABLE"),
        NOT_DEFINED("NOT_DEFINED");
        private final String value;
        private final static Map<String, CvssV30 .RemediationLevelType> CONSTANTS = new HashMap<String, CvssV30 .RemediationLevelType>();

        static {
            for (CvssV30 .RemediationLevelType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private RemediationLevelType(String value) {
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
        public static CvssV30 .RemediationLevelType fromValue(String value) {
            CvssV30 .RemediationLevelType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum ScopeType {

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

    public enum SeverityType {

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

    public enum UserInteractionType {

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

    public enum Version {

        _3_0("3.0");
        private final String value;
        private final static Map<String, CvssV30 .Version> CONSTANTS = new HashMap<String, CvssV30 .Version>();

        static {
            for (CvssV30 .Version c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private Version(String value) {
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
        public static CvssV30 .Version fromValue(String value) {
            CvssV30 .Version constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
