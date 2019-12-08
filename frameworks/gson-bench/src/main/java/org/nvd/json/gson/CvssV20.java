
package org.nvd.json.gson;

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

    /**
     * CVSS Version
     * (Required)
     * 
     */
    @SerializedName("version")
    @Expose
    private CvssV20 .Version version;
    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("vectorString")
    @Expose
    private String vectorString;
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
    @SerializedName("exploitability")
    @Expose
    private CvssV20 .ExploitabilityType exploitability;
    @SerializedName("remediationLevel")
    @Expose
    private CvssV20 .RemediationLevelType remediationLevel;
    @SerializedName("reportConfidence")
    @Expose
    private CvssV20 .ReportConfidenceType reportConfidence;
    @SerializedName("temporalScore")
    @Expose
    private Double temporalScore;
    @SerializedName("collateralDamagePotential")
    @Expose
    private CvssV20 .CollateralDamagePotentialType collateralDamagePotential;
    @SerializedName("targetDistribution")
    @Expose
    private CvssV20 .TargetDistributionType targetDistribution;
    @SerializedName("confidentialityRequirement")
    @Expose
    private CvssV20 .CiaRequirementType confidentialityRequirement;
    @SerializedName("integrityRequirement")
    @Expose
    private CvssV20 .CiaRequirementType integrityRequirement;
    @SerializedName("availabilityRequirement")
    @Expose
    private CvssV20 .CiaRequirementType availabilityRequirement;
    @SerializedName("environmentalScore")
    @Expose
    private Double environmentalScore;

    /**
     * CVSS Version
     * (Required)
     * 
     */
    public CvssV20 .Version getVersion() {
        return version;
    }

    /**
     * CVSS Version
     * (Required)
     * 
     */
    public void setVersion(CvssV20 .Version version) {
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

    public CvssV20 .ExploitabilityType getExploitability() {
        return exploitability;
    }

    public void setExploitability(CvssV20 .ExploitabilityType exploitability) {
        this.exploitability = exploitability;
    }

    public CvssV20 .RemediationLevelType getRemediationLevel() {
        return remediationLevel;
    }

    public void setRemediationLevel(CvssV20 .RemediationLevelType remediationLevel) {
        this.remediationLevel = remediationLevel;
    }

    public CvssV20 .ReportConfidenceType getReportConfidence() {
        return reportConfidence;
    }

    public void setReportConfidence(CvssV20 .ReportConfidenceType reportConfidence) {
        this.reportConfidence = reportConfidence;
    }

    public Double getTemporalScore() {
        return temporalScore;
    }

    public void setTemporalScore(Double temporalScore) {
        this.temporalScore = temporalScore;
    }

    public CvssV20 .CollateralDamagePotentialType getCollateralDamagePotential() {
        return collateralDamagePotential;
    }

    public void setCollateralDamagePotential(CvssV20 .CollateralDamagePotentialType collateralDamagePotential) {
        this.collateralDamagePotential = collateralDamagePotential;
    }

    public CvssV20 .TargetDistributionType getTargetDistribution() {
        return targetDistribution;
    }

    public void setTargetDistribution(CvssV20 .TargetDistributionType targetDistribution) {
        this.targetDistribution = targetDistribution;
    }

    public CvssV20 .CiaRequirementType getConfidentialityRequirement() {
        return confidentialityRequirement;
    }

    public void setConfidentialityRequirement(CvssV20 .CiaRequirementType confidentialityRequirement) {
        this.confidentialityRequirement = confidentialityRequirement;
    }

    public CvssV20 .CiaRequirementType getIntegrityRequirement() {
        return integrityRequirement;
    }

    public void setIntegrityRequirement(CvssV20 .CiaRequirementType integrityRequirement) {
        this.integrityRequirement = integrityRequirement;
    }

    public CvssV20 .CiaRequirementType getAvailabilityRequirement() {
        return availabilityRequirement;
    }

    public void setAvailabilityRequirement(CvssV20 .CiaRequirementType availabilityRequirement) {
        this.availabilityRequirement = availabilityRequirement;
    }

    public Double getEnvironmentalScore() {
        return environmentalScore;
    }

    public void setEnvironmentalScore(Double environmentalScore) {
        this.environmentalScore = environmentalScore;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CvssV20 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("version");
        sb.append('=');
        sb.append(((this.version == null)?"<null>":this.version));
        sb.append(',');
        sb.append("vectorString");
        sb.append('=');
        sb.append(((this.vectorString == null)?"<null>":this.vectorString));
        sb.append(',');
        sb.append("accessVector");
        sb.append('=');
        sb.append(((this.accessVector == null)?"<null>":this.accessVector));
        sb.append(',');
        sb.append("accessComplexity");
        sb.append('=');
        sb.append(((this.accessComplexity == null)?"<null>":this.accessComplexity));
        sb.append(',');
        sb.append("authentication");
        sb.append('=');
        sb.append(((this.authentication == null)?"<null>":this.authentication));
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
        sb.append("exploitability");
        sb.append('=');
        sb.append(((this.exploitability == null)?"<null>":this.exploitability));
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
        sb.append("collateralDamagePotential");
        sb.append('=');
        sb.append(((this.collateralDamagePotential == null)?"<null>":this.collateralDamagePotential));
        sb.append(',');
        sb.append("targetDistribution");
        sb.append('=');
        sb.append(((this.targetDistribution == null)?"<null>":this.targetDistribution));
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
        sb.append("environmentalScore");
        sb.append('=');
        sb.append(((this.environmentalScore == null)?"<null>":this.environmentalScore));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
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
        private final static Map<String, CvssV20 .CiaRequirementType> CONSTANTS = new HashMap<String, CvssV20 .CiaRequirementType>();

        static {
            for (CvssV20 .CiaRequirementType c: values()) {
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

        public static CvssV20 .CiaRequirementType fromValue(String value) {
            CvssV20 .CiaRequirementType constant = CONSTANTS.get(value);
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

    public enum CollateralDamagePotentialType {

        @SerializedName("NONE")
        NONE("NONE"),
        @SerializedName("LOW")
        LOW("LOW"),
        @SerializedName("LOW_MEDIUM")
        LOW_MEDIUM("LOW_MEDIUM"),
        @SerializedName("MEDIUM_HIGH")
        MEDIUM_HIGH("MEDIUM_HIGH"),
        @SerializedName("HIGH")
        HIGH("HIGH"),
        @SerializedName("NOT_DEFINED")
        NOT_DEFINED("NOT_DEFINED");
        private final String value;
        private final static Map<String, CvssV20 .CollateralDamagePotentialType> CONSTANTS = new HashMap<String, CvssV20 .CollateralDamagePotentialType>();

        static {
            for (CvssV20 .CollateralDamagePotentialType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private CollateralDamagePotentialType(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        public String value() {
            return this.value;
        }

        public static CvssV20 .CollateralDamagePotentialType fromValue(String value) {
            CvssV20 .CollateralDamagePotentialType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum ExploitabilityType {

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
        private final static Map<String, CvssV20 .ExploitabilityType> CONSTANTS = new HashMap<String, CvssV20 .ExploitabilityType>();

        static {
            for (CvssV20 .ExploitabilityType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private ExploitabilityType(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        public String value() {
            return this.value;
        }

        public static CvssV20 .ExploitabilityType fromValue(String value) {
            CvssV20 .ExploitabilityType constant = CONSTANTS.get(value);
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
        private final static Map<String, CvssV20 .RemediationLevelType> CONSTANTS = new HashMap<String, CvssV20 .RemediationLevelType>();

        static {
            for (CvssV20 .RemediationLevelType c: values()) {
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

        public static CvssV20 .RemediationLevelType fromValue(String value) {
            CvssV20 .RemediationLevelType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum ReportConfidenceType {

        @SerializedName("UNCONFIRMED")
        UNCONFIRMED("UNCONFIRMED"),
        @SerializedName("UNCORROBORATED")
        UNCORROBORATED("UNCORROBORATED"),
        @SerializedName("CONFIRMED")
        CONFIRMED("CONFIRMED"),
        @SerializedName("NOT_DEFINED")
        NOT_DEFINED("NOT_DEFINED");
        private final String value;
        private final static Map<String, CvssV20 .ReportConfidenceType> CONSTANTS = new HashMap<String, CvssV20 .ReportConfidenceType>();

        static {
            for (CvssV20 .ReportConfidenceType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private ReportConfidenceType(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        public String value() {
            return this.value;
        }

        public static CvssV20 .ReportConfidenceType fromValue(String value) {
            CvssV20 .ReportConfidenceType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum TargetDistributionType {

        @SerializedName("NONE")
        NONE("NONE"),
        @SerializedName("LOW")
        LOW("LOW"),
        @SerializedName("MEDIUM")
        MEDIUM("MEDIUM"),
        @SerializedName("HIGH")
        HIGH("HIGH"),
        @SerializedName("NOT_DEFINED")
        NOT_DEFINED("NOT_DEFINED");
        private final String value;
        private final static Map<String, CvssV20 .TargetDistributionType> CONSTANTS = new HashMap<String, CvssV20 .TargetDistributionType>();

        static {
            for (CvssV20 .TargetDistributionType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private TargetDistributionType(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        public String value() {
            return this.value;
        }

        public static CvssV20 .TargetDistributionType fromValue(String value) {
            CvssV20 .TargetDistributionType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum Version {

        @SerializedName("2.0")
        _2_0("2.0");
        private final String value;
        private final static Map<String, CvssV20 .Version> CONSTANTS = new HashMap<String, CvssV20 .Version>();

        static {
            for (CvssV20 .Version c: values()) {
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

        public static CvssV20 .Version fromValue(String value) {
            CvssV20 .Version constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
