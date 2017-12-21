package com.mosso.demoia.models.response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by isaigarciamoso on 21/12/17.
 */

public class CastModel {
    @SerializedName("label")
    private String label;
    @SerializedName("value")
    private List<String> valueList;


    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public List<String> getValueList() {
        return valueList;
    }

    public void setValueList(List<String> valueList) {
        this.valueList = valueList;
    }
}
