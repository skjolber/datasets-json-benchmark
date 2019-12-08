
package org.nvd.json.jsoniter;

import java.util.HashMap;
import java.util.Map;

import com.jsoniter.annotation.JsonCreator;
import com.jsoniter.annotation.JsonProperty;



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
    @JsonProperty("version")
    private CvssV20 .Version version;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("vectorString")
    private String vectorString;
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
    @JsonProperty("exploitability")
    private CvssV20 .ExploitabilityType exploitability;
    @JsonProperty("remediationLevel")
    private CvssV20 .RemediationLevelType remediationLevel;
    @JsonProperty("reportConfidence")
    private CvssV20 .ReportConfidenceType reportConfidence;
    @JsonProperty("temporalScore")
    private Double temporalScore;
    @JsonProperty("collateralDamagePotential")
    private CvssV20 .CollateralDamagePotentialType collateralDamagePotential;
    @JsonProperty("targetDistribution")
    private CvssV20 .TargetDistributionType targetDistribution;
    @JsonProperty("confidentialityRequirement")
    private CvssV20 .CiaRequirementType confidentialityRequirement;
    @JsonProperty("integrityRequirement")
    private CvssV20 .CiaRequirementType integrityRequirement;
    @JsonProperty("availabilityRequirement")
    private CvssV20 .CiaRequirementType availabilityRequirement;
    @JsonProperty("environmentalScore")
    private Double environmentalScore;

    /**
     * CVSS Version
     * (Required)
     * 
     */
    @JsonProperty("version")
    public CvssV20 .Version getVersion() {
        return version;
    }

    /**
     * CVSS Version
     * (Required)
     * 
     */
    @JsonProperty("version")
    public void setVersion(CvssV20 .Version version) {
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

    @JsonProperty("exploitability")
    public CvssV20 .ExploitabilityType getExploitability() {
        return exploitability;
    }

    @JsonProperty("exploitability")
    public void setExploitability(CvssV20 .ExploitabilityType exploitability) {
        this.exploitability = exploitability;
    }

    @JsonProperty("remediationLevel")
    public CvssV20 .RemediationLevelType getRemediationLevel() {
        return remediationLevel;
    }

    @JsonProperty("remediationLevel")
    public void setRemediationLevel(CvssV20 .RemediationLevelType remediationLevel) {
        this.remediationLevel = remediationLevel;
    }

    @JsonProperty("reportConfidence")
    public CvssV20 .ReportConfidenceType getReportConfidence() {
        return reportConfidence;
    }

    @JsonProperty("reportConfidence")
    public void setReportConfidence(CvssV20 .ReportConfidenceType reportConfidence) {
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

    @JsonProperty("collateralDamagePotential")
    public CvssV20 .CollateralDamagePotentialType getCollateralDamagePotential() {
        return collateralDamagePotential;
    }

    @JsonProperty("collateralDamagePotential")
    public void setCollateralDamagePotential(CvssV20 .CollateralDamagePotentialType collateralDamagePotential) {
        this.collateralDamagePotential = collateralDamagePotential;
    }

    @JsonProperty("targetDistribution")
    public CvssV20 .TargetDistributionType getTargetDistribution() {
        return targetDistribution;
    }

    @JsonProperty("targetDistribution")
    public void setTargetDistribution(CvssV20 .TargetDistributionType targetDistribution) {
        this.targetDistribution = targetDistribution;
    }

    @JsonProperty("confidentialityRequirement")
    public CvssV20 .CiaRequirementType getConfidentialityRequirement() {
        return confidentialityRequirement;
    }

    @JsonProperty("confidentialityRequirement")
    public void setConfidentialityRequirement(CvssV20 .CiaRequirementType confidentialityRequirement) {
        this.confidentialityRequirement = confidentialityRequirement;
    }

    @JsonProperty("integrityRequirement")
    public CvssV20 .CiaRequirementType getIntegrityRequirement() {
        return integrityRequirement;
    }

    @JsonProperty("integrityRequirement")
    public void setIntegrityRequirement(CvssV20 .CiaRequirementType integrityRequirement) {
        this.integrityRequirement = integrityRequirement;
    }

    @JsonProperty("availabilityRequirement")
    public CvssV20 .CiaRequirementType getAvailabilityRequirement() {
        return availabilityRequirement;
    }

    @JsonProperty("availabilityRequirement")
    public void setAvailabilityRequirement(CvssV20 .CiaRequirementType availabilityRequirement) {
        this.availabilityRequirement = availabilityRequirement;
    }

    @JsonProperty("environmentalScore")
    public Double getEnvironmentalScore() {
        return environmentalScore;
    }

    @JsonProperty("environmentalScore")
    public void setEnvironmentalScore(Double environmentalScore) {
        this.environmentalScore = environmentalScore;
    }

    public enum AccessComplexityType {

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

    public enum AccessVectorType {

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

    public enum AuthenticationType {

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

    public enum CiaRequirementType {

        LOW("LOW"),
        MEDIUM("MEDIUM"),
        HIGH("HIGH"),
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

        @JsonCreator
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

    public enum CollateralDamagePotentialType {

        NONE("NONE"),
        LOW("LOW"),
        LOW_MEDIUM("LOW_MEDIUM"),
        MEDIUM_HIGH("MEDIUM_HIGH"),
        HIGH("HIGH"),
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

        @JsonCreator
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

        UNPROVEN("UNPROVEN"),
        PROOF_OF_CONCEPT("PROOF_OF_CONCEPT"),
        FUNCTIONAL("FUNCTIONAL"),
        HIGH("HIGH"),
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

        @JsonCreator
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

        OFFICIAL_FIX("OFFICIAL_FIX"),
        TEMPORARY_FIX("TEMPORARY_FIX"),
        WORKAROUND("WORKAROUND"),
        UNAVAILABLE("UNAVAILABLE"),
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

        @JsonCreator
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

        UNCONFIRMED("UNCONFIRMED"),
        UNCORROBORATED("UNCORROBORATED"),
        CONFIRMED("CONFIRMED"),
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

        @JsonCreator
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

        NONE("NONE"),
        LOW("LOW"),
        MEDIUM("MEDIUM"),
        HIGH("HIGH"),
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

        @JsonCreator
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

        @JsonCreator
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
