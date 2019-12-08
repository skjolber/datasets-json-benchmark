
package org.nvd.json.jsoniter.reduced;

import com.jsoniter.annotation.JsonProperty;

public class Reference {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("url")
    private String url;
    @JsonProperty("name")
    private String name;
    @JsonProperty("refsource")
    private String refsource;

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("refsource")
    public String getRefsource() {
        return refsource;
    }

    @JsonProperty("refsource")
    public void setRefsource(String refsource) {
        this.refsource = refsource;
    }

}
