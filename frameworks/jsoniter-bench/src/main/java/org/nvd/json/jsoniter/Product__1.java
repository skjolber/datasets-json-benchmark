
package org.nvd.json.jsoniter;

import java.util.HashMap;
import java.util.Map;
import com.jsoniter.annotation.JsonProperty;



public class Product__1 {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("product_name")
    private String productName;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("version")
    private Version version;

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("product_name")
    public String getProductName() {
        return productName;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("product_name")
    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("version")
    public Version getVersion() {
        return version;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("version")
    public void setVersion(Version version) {
        this.version = version;
    }

}
