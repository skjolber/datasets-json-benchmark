
package org.nvd.json.gson;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Description {

    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("description_data")
    @Expose
    private List<LangString> descriptionData = new ArrayList<LangString>();

    /**
     * 
     * (Required)
     * 
     */
    public List<LangString> getDescriptionData() {
        return descriptionData;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setDescriptionData(List<LangString> descriptionData) {
        this.descriptionData = descriptionData;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Description.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("descriptionData");
        sb.append('=');
        sb.append(((this.descriptionData == null)?"<null>":this.descriptionData));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
