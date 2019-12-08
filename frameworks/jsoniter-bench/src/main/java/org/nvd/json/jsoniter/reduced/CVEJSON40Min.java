
package org.nvd.json.jsoniter.reduced;

import org.nvd.json.jsoniter.reduced.CVEDataMeta;
import org.nvd.json.jsoniter.reduced.Description;
import org.nvd.json.jsoniter.reduced.Problemtype;
import org.nvd.json.jsoniter.reduced.References;

import com.jsoniter.annotation.JsonProperty;
public class CVEJSON40Min {

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

}
