package com.mosso.demoia.models.response;

import com.google.gson.annotations.SerializedName;

/**
 * Created by isaigarciamoso on 20/12/17.
 */

public class SettingModel {

    @SerializedName("is_special_prices")
    private boolean isSpecialPrice;
    @SerializedName("type_food_sales")
    private String  typeFoodSales;


    public SettingModel(boolean isSpecialPrice, String typeFoodSales) {
        this.isSpecialPrice = isSpecialPrice;
        this.typeFoodSales = typeFoodSales;
    }


    public boolean isSpecialPrice() {
        return isSpecialPrice;
    }

    public void setSpecialPrice(boolean specialPrice) {
        isSpecialPrice = specialPrice;
    }

    public String getTypeFoodSales() {
        return typeFoodSales;
    }

    public void setTypeFoodSales(String typeFoodSales) {
        this.typeFoodSales = typeFoodSales;
    }
}
