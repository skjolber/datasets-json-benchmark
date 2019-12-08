
package org.nvd.json.gson.reduced;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CVEJSON40Min {

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

}
