
package org.nvd.json.gson;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CVEDataMeta {

    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("ID")
    @Expose
    private String id;
    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("ASSIGNER")
    @Expose
    private String assigner;
    @SerializedName("STATE")
    @Expose
    private String state;

    /**
     * 
     * (Required)
     * 
     */
    public String getId() {
        return id;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 
     * (Required)
     * 
     */
    public String getAssigner() {
        return assigner;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setAssigner(String assigner) {
        this.assigner = assigner;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CVEDataMeta.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("assigner");
        sb.append('=');
        sb.append(((this.assigner == null)?"<null>":this.assigner));
        sb.append(',');
        sb.append("state");
        sb.append('=');
        sb.append(((this.state == null)?"<null>":this.state));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
