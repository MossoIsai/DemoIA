package com.mosso.demoia.http;

import com.mosso.demoia.models.response.UsuarioModel;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Headers;
import retrofit2.http.POST;

/**
 * Created by isaigarciamoso on 20/12/17.
 */

public interface HttpLogin {

    @FormUrlEncoded
    @POST("v2/oauth/token")
    @Headers({"Accept: application/json",
     "api_key: 199e2ce46ac525fddf"
    })
    Call<UsuarioModel> login(@Field("country_code") String  countryCode,@Field("username") String username,
                             @Field("password") String password,@Field("grant_type") String grandType,
                             @Field("client_id") String clientId,@Field("client_secret") String clientSecret);
}
