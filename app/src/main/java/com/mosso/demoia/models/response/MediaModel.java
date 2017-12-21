package com.mosso.demoia.models.response;

import com.google.gson.annotations.SerializedName;

/**
 * Created by isaigarciamoso on 20/12/17.
 */

public class MediaModel {

    @SerializedName("type")
    private String type;
    @SerializedName("code")
    private String code;
    @SerializedName("resource")
    private String resource;


    public MediaModel(String type, String code, String resource) {
        this.type = type;
        this.code = code;
        this.resource = resource;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getResource() {
        return resource;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }
}
