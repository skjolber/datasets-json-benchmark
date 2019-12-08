
package org.nvd.json.gson;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Product__1 {

    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("product_name")
    @Expose
    private String productName;
    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("version")
    @Expose
    private Version version;

    /**
     * 
     * (Required)
     * 
     */
    public String getProductName() {
        return productName;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * 
     * (Required)
     * 
     */
    public Version getVersion() {
        return version;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setVersion(Version version) {
        this.version = version;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Product__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("productName");
        sb.append('=');
        sb.append(((this.productName == null)?"<null>":this.productName));
        sb.append(',');
        sb.append("version");
        sb.append('=');
        sb.append(((this.version == null)?"<null>":this.version));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
