
package org.nvd.json.jackson.reduced;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "lang",
    "value"
})
public class LangString {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("lang")
    private String lang;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("value")
    private String value;

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("lang")
    public String getLang() {
        return lang;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("lang")
    public void setLang(String lang) {
        this.lang = lang;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("value")
    public String getValue() {
        return value;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("value")
    public void setValue(String value) {
        this.value = value;
    }

}
