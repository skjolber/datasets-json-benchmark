
package org.nvd.json.gson;

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

    /**
     * CVSS Version
     * (Required)
     * 
     */
    @SerializedName("version")
    @Expose
    private CvssV30 .Version version;
    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("vectorString")
    @Expose
    private String vectorString;
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
    @SerializedName("exploitCodeMaturity")
    @Expose
    private CvssV30 .ExploitCodeMaturityType exploitCodeMaturity;
    @SerializedName("remediationLevel")
    @Expose
    private CvssV30 .RemediationLevelType remediationLevel;
    @SerializedName("reportConfidence")
    @Expose
    private CvssV30 .ConfidenceType reportConfidence;
    @SerializedName("temporalScore")
    @Expose
    private Double temporalScore;
    @SerializedName("temporalSeverity")
    @Expose
    private CvssV30 .SeverityType temporalSeverity;
    @SerializedName("confidentialityRequirement")
    @Expose
    private CvssV30 .CiaRequirementType confidentialityRequirement;
    @SerializedName("integrityRequirement")
    @Expose
    private CvssV30 .CiaRequirementType integrityRequirement;
    @SerializedName("availabilityRequirement")
    @Expose
    private CvssV30 .CiaRequirementType availabilityRequirement;
    @SerializedName("modifiedAttackVector")
    @Expose
    private CvssV30 .ModifiedAttackVectorType modifiedAttackVector;
    @SerializedName("modifiedAttackComplexity")
    @Expose
    private CvssV30 .ModifiedAttackComplexityType modifiedAttackComplexity;
    @SerializedName("modifiedPrivilegesRequired")
    @Expose
    private CvssV30 .ModifiedPrivilegesRequiredType modifiedPrivilegesRequired;
    @SerializedName("modifiedUserInteraction")
    @Expose
    private CvssV30 .ModifiedUserInteractionType modifiedUserInteraction;
    @SerializedName("modifiedScope")
    @Expose
    private CvssV30 .ModifiedScopeType modifiedScope;
    @SerializedName("modifiedConfidentialityImpact")
    @Expose
    private CvssV30 .ModifiedCiaType modifiedConfidentialityImpact;
    @SerializedName("modifiedIntegrityImpact")
    @Expose
    private CvssV30 .ModifiedCiaType modifiedIntegrityImpact;
    @SerializedName("modifiedAvailabilityImpact")
    @Expose
    private CvssV30 .ModifiedCiaType modifiedAvailabilityImpact;
    @SerializedName("environmentalScore")
    @Expose
    private Double environmentalScore;
    @SerializedName("environmentalSeverity")
    @Expose
    private CvssV30 .SeverityType environmentalSeverity;

    /**
     * CVSS Version
     * (Required)
     * 
     */
    public CvssV30 .Version getVersion() {
        return version;
    }

    /**
     * CVSS Version
     * (Required)
     * 
     */
    public void setVersion(CvssV30 .Version version) {
        this.version = version;
    }

    /**
     * 
     * (Required)
     * 
     */
    public String getVectorString() {
        return vectorString;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setVectorString(String vectorString) {
        this.vectorString = vectorString;
    }

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

    public CvssV30 .ExploitCodeMaturityType getExploitCodeMaturity() {
        return exploitCodeMaturity;
    }

    public void setExploitCodeMaturity(CvssV30 .ExploitCodeMaturityType exploitCodeMaturity) {
        this.exploitCodeMaturity = exploitCodeMaturity;
    }

    public CvssV30 .RemediationLevelType getRemediationLevel() {
        return remediationLevel;
    }

    public void setRemediationLevel(CvssV30 .RemediationLevelType remediationLevel) {
        this.remediationLevel = remediationLevel;
    }

    public CvssV30 .ConfidenceType getReportConfidence() {
        return reportConfidence;
    }

    public void setReportConfidence(CvssV30 .ConfidenceType reportConfidence) {
        this.reportConfidence = reportConfidence;
    }

    public Double getTemporalScore() {
        return temporalScore;
    }

    public void setTemporalScore(Double temporalScore) {
        this.temporalScore = temporalScore;
    }

    public CvssV30 .SeverityType getTemporalSeverity() {
        return temporalSeverity;
    }

    public void setTemporalSeverity(CvssV30 .SeverityType temporalSeverity) {
        this.temporalSeverity = temporalSeverity;
    }

    public CvssV30 .CiaRequirementType getConfidentialityRequirement() {
        return confidentialityRequirement;
    }

    public void setConfidentialityRequirement(CvssV30 .CiaRequirementType confidentialityRequirement) {
        this.confidentialityRequirement = confidentialityRequirement;
    }

    public CvssV30 .CiaRequirementType getIntegrityRequirement() {
        return integrityRequirement;
    }

    public void setIntegrityRequirement(CvssV30 .CiaRequirementType integrityRequirement) {
        this.integrityRequirement = integrityRequirement;
    }

    public CvssV30 .CiaRequirementType getAvailabilityRequirement() {
        return availabilityRequirement;
    }

    public void setAvailabilityRequirement(CvssV30 .CiaRequirementType availabilityRequirement) {
        this.availabilityRequirement = availabilityRequirement;
    }

    public CvssV30 .ModifiedAttackVectorType getModifiedAttackVector() {
        return modifiedAttackVector;
    }

    public void setModifiedAttackVector(CvssV30 .ModifiedAttackVectorType modifiedAttackVector) {
        this.modifiedAttackVector = modifiedAttackVector;
    }

    public CvssV30 .ModifiedAttackComplexityType getModifiedAttackComplexity() {
        return modifiedAttackComplexity;
    }

    public void setModifiedAttackComplexity(CvssV30 .ModifiedAttackComplexityType modifiedAttackComplexity) {
        this.modifiedAttackComplexity = modifiedAttackComplexity;
    }

    public CvssV30 .ModifiedPrivilegesRequiredType getModifiedPrivilegesRequired() {
        return modifiedPrivilegesRequired;
    }

    public void setModifiedPrivilegesRequired(CvssV30 .ModifiedPrivilegesRequiredType modifiedPrivilegesRequired) {
        this.modifiedPrivilegesRequired = modifiedPrivilegesRequired;
    }

    public CvssV30 .ModifiedUserInteractionType getModifiedUserInteraction() {
        return modifiedUserInteraction;
    }

    public void setModifiedUserInteraction(CvssV30 .ModifiedUserInteractionType modifiedUserInteraction) {
        this.modifiedUserInteraction = modifiedUserInteraction;
    }

    public CvssV30 .ModifiedScopeType getModifiedScope() {
        return modifiedScope;
    }

    public void setModifiedScope(CvssV30 .ModifiedScopeType modifiedScope) {
        this.modifiedScope = modifiedScope;
    }

    public CvssV30 .ModifiedCiaType getModifiedConfidentialityImpact() {
        return modifiedConfidentialityImpact;
    }

    public void setModifiedConfidentialityImpact(CvssV30 .ModifiedCiaType modifiedConfidentialityImpact) {
        this.modifiedConfidentialityImpact = modifiedConfidentialityImpact;
    }

    public CvssV30 .ModifiedCiaType getModifiedIntegrityImpact() {
        return modifiedIntegrityImpact;
    }

    public void setModifiedIntegrityImpact(CvssV30 .ModifiedCiaType modifiedIntegrityImpact) {
        this.modifiedIntegrityImpact = modifiedIntegrityImpact;
    }

    public CvssV30 .ModifiedCiaType getModifiedAvailabilityImpact() {
        return modifiedAvailabilityImpact;
    }

    public void setModifiedAvailabilityImpact(CvssV30 .ModifiedCiaType modifiedAvailabilityImpact) {
        this.modifiedAvailabilityImpact = modifiedAvailabilityImpact;
    }

    public Double getEnvironmentalScore() {
        return environmentalScore;
    }

    public void setEnvironmentalScore(Double environmentalScore) {
        this.environmentalScore = environmentalScore;
    }

    public CvssV30 .SeverityType getEnvironmentalSeverity() {
        return environmentalSeverity;
    }

    public void setEnvironmentalSeverity(CvssV30 .SeverityType environmentalSeverity) {
        this.environmentalSeverity = environmentalSeverity;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CvssV30 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("version");
        sb.append('=');
        sb.append(((this.version == null)?"<null>":this.version));
        sb.append(',');
        sb.append("vectorString");
        sb.append('=');
        sb.append(((this.vectorString == null)?"<null>":this.vectorString));
        sb.append(',');
        sb.append("attackVector");
        sb.append('=');
        sb.append(((this.attackVector == null)?"<null>":this.attackVector));
        sb.append(',');
        sb.append("attackComplexity");
        sb.append('=');
        sb.append(((this.attackComplexity == null)?"<null>":this.attackComplexity));
        sb.append(',');
        sb.append("privilegesRequired");
        sb.append('=');
        sb.append(((this.privilegesRequired == null)?"<null>":this.privilegesRequired));
        sb.append(',');
        sb.append("userInteraction");
        sb.append('=');
        sb.append(((this.userInteraction == null)?"<null>":this.userInteraction));
        sb.append(',');
        sb.append("scope");
        sb.append('=');
        sb.append(((this.scope == null)?"<null>":this.scope));
        sb.append(',');
        sb.append("confidentialityImpact");
        sb.append('=');
        sb.append(((this.confidentialityImpact == null)?"<null>":this.confidentialityImpact));
        sb.append(',');
        sb.append("integrityImpact");
        sb.append('=');
        sb.append(((this.integrityImpact == null)?"<null>":this.integrityImpact));
        sb.append(',');
        sb.append("availabilityImpact");
        sb.append('=');
        sb.append(((this.availabilityImpact == null)?"<null>":this.availabilityImpact));
        sb.append(',');
        sb.append("baseScore");
        sb.append('=');
        sb.append(((this.baseScore == null)?"<null>":this.baseScore));
        sb.append(',');
        sb.append("baseSeverity");
        sb.append('=');
        sb.append(((this.baseSeverity == null)?"<null>":this.baseSeverity));
        sb.append(',');
        sb.append("exploitCodeMaturity");
        sb.append('=');
        sb.append(((this.exploitCodeMaturity == null)?"<null>":this.exploitCodeMaturity));
        sb.append(',');
        sb.append("remediationLevel");
        sb.append('=');
        sb.append(((this.remediationLevel == null)?"<null>":this.remediationLevel));
        sb.append(',');
        sb.append("reportConfidence");
        sb.append('=');
        sb.append(((this.reportConfidence == null)?"<null>":this.reportConfidence));
        sb.append(',');
        sb.append("temporalScore");
        sb.append('=');
        sb.append(((this.temporalScore == null)?"<null>":this.temporalScore));
        sb.append(',');
        sb.append("temporalSeverity");
        sb.append('=');
        sb.append(((this.temporalSeverity == null)?"<null>":this.temporalSeverity));
        sb.append(',');
        sb.append("confidentialityRequirement");
        sb.append('=');
        sb.append(((this.confidentialityRequirement == null)?"<null>":this.confidentialityRequirement));
        sb.append(',');
        sb.append("integrityRequirement");
        sb.append('=');
        sb.append(((this.integrityRequirement == null)?"<null>":this.integrityRequirement));
        sb.append(',');
        sb.append("availabilityRequirement");
        sb.append('=');
        sb.append(((this.availabilityRequirement == null)?"<null>":this.availabilityRequirement));
        sb.append(',');
        sb.append("modifiedAttackVector");
        sb.append('=');
        sb.append(((this.modifiedAttackVector == null)?"<null>":this.modifiedAttackVector));
        sb.append(',');
        sb.append("modifiedAttackComplexity");
        sb.append('=');
        sb.append(((this.modifiedAttackComplexity == null)?"<null>":this.modifiedAttackComplexity));
        sb.append(',');
        sb.append("modifiedPrivilegesRequired");
        sb.append('=');
        sb.append(((this.modifiedPrivilegesRequired == null)?"<null>":this.modifiedPrivilegesRequired));
        sb.append(',');
        sb.append("modifiedUserInteraction");
        sb.append('=');
        sb.append(((this.modifiedUserInteraction == null)?"<null>":this.modifiedUserInteraction));
        sb.append(',');
        sb.append("modifiedScope");
        sb.append('=');
        sb.append(((this.modifiedScope == null)?"<null>":this.modifiedScope));
        sb.append(',');
        sb.append("modifiedConfidentialityImpact");
        sb.append('=');
        sb.append(((this.modifiedConfidentialityImpact == null)?"<null>":this.modifiedConfidentialityImpact));
        sb.append(',');
        sb.append("modifiedIntegrityImpact");
        sb.append('=');
        sb.append(((this.modifiedIntegrityImpact == null)?"<null>":this.modifiedIntegrityImpact));
        sb.append(',');
        sb.append("modifiedAvailabilityImpact");
        sb.append('=');
        sb.append(((this.modifiedAvailabilityImpact == null)?"<null>":this.modifiedAvailabilityImpact));
        sb.append(',');
        sb.append("environmentalScore");
        sb.append('=');
        sb.append(((this.environmentalScore == null)?"<null>":this.environmentalScore));
        sb.append(',');
        sb.append("environmentalSeverity");
        sb.append('=');
        sb.append(((this.environmentalSeverity == null)?"<null>":this.environmentalSeverity));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
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

    public enum CiaRequirementType {

        @SerializedName("LOW")
        LOW("LOW"),
        @SerializedName("MEDIUM")
        MEDIUM("MEDIUM"),
        @SerializedName("HIGH")
        HIGH("HIGH"),
        @SerializedName("NOT_DEFINED")
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

    public enum ConfidenceType {

        @SerializedName("UNKNOWN")
        UNKNOWN("UNKNOWN"),
        @SerializedName("REASONABLE")
        REASONABLE("REASONABLE"),
        @SerializedName("CONFIRMED")
        CONFIRMED("CONFIRMED"),
        @SerializedName("NOT_DEFINED")
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

        @SerializedName("UNPROVEN")
        UNPROVEN("UNPROVEN"),
        @SerializedName("PROOF_OF_CONCEPT")
        PROOF_OF_CONCEPT("PROOF_OF_CONCEPT"),
        @SerializedName("FUNCTIONAL")
        FUNCTIONAL("FUNCTIONAL"),
        @SerializedName("HIGH")
        HIGH("HIGH"),
        @SerializedName("NOT_DEFINED")
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

        @SerializedName("HIGH")
        HIGH("HIGH"),
        @SerializedName("LOW")
        LOW("LOW"),
        @SerializedName("NOT_DEFINED")
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

        @SerializedName("NETWORK")
        NETWORK("NETWORK"),
        @SerializedName("ADJACENT_NETWORK")
        ADJACENT_NETWORK("ADJACENT_NETWORK"),
        @SerializedName("LOCAL")
        LOCAL("LOCAL"),
        @SerializedName("PHYSICAL")
        PHYSICAL("PHYSICAL"),
        @SerializedName("NOT_DEFINED")
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

        @SerializedName("NONE")
        NONE("NONE"),
        @SerializedName("LOW")
        LOW("LOW"),
        @SerializedName("HIGH")
        HIGH("HIGH"),
        @SerializedName("NOT_DEFINED")
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

        @SerializedName("HIGH")
        HIGH("HIGH"),
        @SerializedName("LOW")
        LOW("LOW"),
        @SerializedName("NONE")
        NONE("NONE"),
        @SerializedName("NOT_DEFINED")
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

        @SerializedName("UNCHANGED")
        UNCHANGED("UNCHANGED"),
        @SerializedName("CHANGED")
        CHANGED("CHANGED"),
        @SerializedName("NOT_DEFINED")
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

        @SerializedName("NONE")
        NONE("NONE"),
        @SerializedName("REQUIRED")
        REQUIRED("REQUIRED"),
        @SerializedName("NOT_DEFINED")
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

    public enum RemediationLevelType {

        @SerializedName("OFFICIAL_FIX")
        OFFICIAL_FIX("OFFICIAL_FIX"),
        @SerializedName("TEMPORARY_FIX")
        TEMPORARY_FIX("TEMPORARY_FIX"),
        @SerializedName("WORKAROUND")
        WORKAROUND("WORKAROUND"),
        @SerializedName("UNAVAILABLE")
        UNAVAILABLE("UNAVAILABLE"),
        @SerializedName("NOT_DEFINED")
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

    public enum Version {

        @SerializedName("3.0")
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
