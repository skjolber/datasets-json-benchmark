
package org.nvd.json.jsoniter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.jsoniter.annotation.JsonProperty;


public class Vendor {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("vendor_data")
    private List<VendorDatum> vendorData = new ArrayList<VendorDatum>();

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("vendor_data")
    public List<VendorDatum> getVendorData() {
        return vendorData;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("vendor_data")
    public void setVendorData(List<VendorDatum> vendorData) {
        this.vendorData = vendorData;
    }

}
