
package org.nvd.json.gson;

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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(LangString.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("lang");
        sb.append('=');
        sb.append(((this.lang == null)?"<null>":this.lang));
        sb.append(',');
        sb.append("value");
        sb.append('=');
        sb.append(((this.value == null)?"<null>":this.value));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
