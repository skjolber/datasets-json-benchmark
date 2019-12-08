
package org.nvd.json.jsoniter;

import java.util.HashMap;
import java.util.Map;
import com.jsoniter.annotation.JsonProperty;



public class VendorDatum {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("vendor_name")
    private String vendorName;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("product")
    private Product product;

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("vendor_name")
    public String getVendorName() {
        return vendorName;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("vendor_name")
    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("product")
    public Product getProduct() {
        return product;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("product")
    public void setProduct(Product product) {
        this.product = product;
    }

}
