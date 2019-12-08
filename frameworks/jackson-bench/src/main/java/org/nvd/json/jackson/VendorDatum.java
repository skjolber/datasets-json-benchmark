
package org.nvd.json.jackson;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "vendor_name",
    "product"
})
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
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
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
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
