package com.mosso.demoia.models.response;

import com.google.gson.annotations.SerializedName;

/**
 * Created by isaigarciamoso on 20/12/17.
 */

public class SizeModel {

    @SerializedName("large")
    private String large;
    @SerializedName("medium")
    private String medium;
    @SerializedName("small")
    private String small;


    public SizeModel(String large, String medium, String small) {
        this.large = large;
        this.medium = medium;
        this.small = small;
    }

    public String getLarge() {
        return large;
    }

    public void setLarge(String large) {
        this.large = large;
    }

    public String getMedium() {
        return medium;
    }

    public void setMedium(String medium) {
        this.medium = medium;
    }

    public String getSmall() {
        return small;
    }

    public void setSmall(String small) {
        this.small = small;
    }
}
