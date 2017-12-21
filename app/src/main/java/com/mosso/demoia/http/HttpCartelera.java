package com.mosso.demoia.http;

import com.mosso.demoia.models.response.PerfilModel;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;

/**
 * Created by isaigarciamoso on 20/12/17.
 */

public interface HttpCartelera {

    @GET("v2/movies")
    @Headers("Accept: application/json")
    Call<PerfilModel> obtenerCartelera(@Query("country_code") String contryCode,@Query("cinemas") String cinemas);


}
