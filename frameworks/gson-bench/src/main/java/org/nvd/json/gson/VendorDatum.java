
package org.nvd.json.gson;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class VendorDatum {

    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("vendor_name")
    @Expose
    private String vendorName;
    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("product")
    @Expose
    private Product product;

    /**
     * 
     * (Required)
     * 
     */
    public String getVendorName() {
        return vendorName;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    /**
     * 
     * (Required)
     * 
     */
    public Product getProduct() {
        return product;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(VendorDatum.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("vendorName");
        sb.append('=');
        sb.append(((this.vendorName == null)?"<null>":this.vendorName));
        sb.append(',');
        sb.append("product");
        sb.append('=');
        sb.append(((this.product == null)?"<null>":this.product));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
