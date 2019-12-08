
package org.nvd.json.jsoniter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.jsoniter.annotation.JsonProperty;


public class Product {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("product_data")
    private List<Product__1> productData = new ArrayList<Product__1>();

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("product_data")
    public List<Product__1> getProductData() {
        return productData;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("product_data")
    public void setProductData(List<Product__1> productData) {
        this.productData = productData;
    }

}
