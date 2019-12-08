
package org.nvd.json.jsoniter;

import com.jsoniter.annotation.JsonProperty;


public class Affects {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("vendor")
    private Vendor vendor;

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("vendor")
    public Vendor getVendor() {
        return vendor;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("vendor")
    public void setVendor(Vendor vendor) {
        this.vendor = vendor;
    }



}
