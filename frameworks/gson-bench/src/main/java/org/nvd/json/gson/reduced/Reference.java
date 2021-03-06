
package org.nvd.json.gson.reduced;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Reference {

    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("refsource")
    @Expose
    private String refsource;

    /**
     * 
     * (Required)
     * 
     */
    public String getUrl() {
        return url;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setUrl(String url) {
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRefsource() {
        return refsource;
    }

    public void setRefsource(String refsource) {
        this.refsource = refsource;
    }

}
