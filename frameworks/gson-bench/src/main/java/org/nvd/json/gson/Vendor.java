
package org.nvd.json.gson;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Vendor {

    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("vendor_data")
    @Expose
    private List<VendorDatum> vendorData = new ArrayList<VendorDatum>();

    /**
     * 
     * (Required)
     * 
     */
    public List<VendorDatum> getVendorData() {
        return vendorData;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setVendorData(List<VendorDatum> vendorData) {
        this.vendorData = vendorData;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Vendor.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("vendorData");
        sb.append('=');
        sb.append(((this.vendorData == null)?"<null>":this.vendorData));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
