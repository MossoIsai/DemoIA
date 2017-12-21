package com.mosso.demoia.models.response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by isaigarciamoso on 20/12/17.
 */

public class RoutesModel {

    @SerializedName("code")
    private String code;
    @SerializedName("sizes")
    private List<SizeModel> sizeModel;


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<SizeModel> getSizeModel() {
        return sizeModel;
    }

    public void setSizeModel(List<SizeModel> sizeModel) {
        this.sizeModel = sizeModel;
    }
}
