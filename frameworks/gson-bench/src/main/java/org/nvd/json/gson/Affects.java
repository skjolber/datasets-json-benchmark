
package org.nvd.json.gson;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Affects {

    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("vendor")
    @Expose
    private Vendor vendor;

    /**
     * 
     * (Required)
     * 
     */
    public Vendor getVendor() {
        return vendor;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setVendor(Vendor vendor) {
        this.vendor = vendor;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Affects.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("vendor");
        sb.append('=');
        sb.append(((this.vendor == null)?"<null>":this.vendor));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
