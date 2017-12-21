package com.mosso.demoia.models.request;

import com.google.gson.annotations.SerializedName;


/**
 * Created by isaigarciamoso on 20/12/17.
 */

public class LoginRequestModel {

    @SerializedName("country_code")
    private String countryCode;
    @SerializedName("username")
    private String username;
    @SerializedName("password")
    private String password;
    @SerializedName("grant_type")
    private String grantType;
    @SerializedName("client_id")
    private String clientId;
    @SerializedName("client_secret")
    private String clientSecret;

    public LoginRequestModel(String countryCode, String username, String password, String grantType, String clientId, String clientSecret) {
        this.countryCode = countryCode;
        this.username = username;
        this.password = password;
        this.grantType = grantType;
        this.clientId = clientId;
        this.clientSecret = clientSecret;
    }
}
