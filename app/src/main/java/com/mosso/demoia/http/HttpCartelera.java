package com.mosso.demoia.http;

import com.mosso.demoia.models.response.MovieMain;
import com.mosso.demoia.models.response.MovieModel;
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
    @Headers({"Accept: application/json",
            "api_key: 199e2ce46ac525fddf"
    })
    Call<MovieMain> obtenerCartelera(@Query("country_code") String contryCode, @Query("cinemas") String cinemas);


}
