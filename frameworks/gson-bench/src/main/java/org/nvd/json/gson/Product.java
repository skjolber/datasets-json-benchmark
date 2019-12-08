
package org.nvd.json.gson;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Product {

    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("product_data")
    @Expose
    private List<Product__1> productData = new ArrayList<Product__1>();

    /**
     * 
     * (Required)
     * 
     */
    public List<Product__1> getProductData() {
        return productData;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setProductData(List<Product__1> productData) {
        this.productData = productData;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Product.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("productData");
        sb.append('=');
        sb.append(((this.productData == null)?"<null>":this.productData));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
