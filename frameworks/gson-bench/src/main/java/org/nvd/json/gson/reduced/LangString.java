
package org.nvd.json.gson.reduced;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LangString {

    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("lang")
    @Expose
    private String lang;
    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("value")
    @Expose
    private String value;

    /**
     * 
     * (Required)
     * 
     */
    public String getLang() {
        return lang;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setLang(String lang) {
        this.lang = lang;
    }

    /**
     * 
     * (Required)
     * 
     */
    public String getValue() {
        return value;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setValue(String value) {
        this.value = value;
    }

}
