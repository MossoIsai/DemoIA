package com.mosso.demoia.http;

import com.mosso.demoia.models.response.PerfilModel;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.Query;

/**
 * Created by isaigarciamoso on 21/12/17.
 */

public interface HttpProfile {

    @GET("/v1/members/profile")
    @Headers({"Accept: application/json",
            "api_key: 199e2ce46ac525fddf"
    })
    Call<PerfilModel> obtenerPerfil(@Query("country_code") String countryCode, @HeaderMap Map<String, String> headers);
}
