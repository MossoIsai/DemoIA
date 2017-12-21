package com.mosso.demoia.http;

import com.mosso.demoia.models.response.DetalleComplejo;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;

/**
 * Created by isaigarciamoso on 20/12/17.
 */

public interface HttpDetalleComplejo {

    @GET("v2/locations/cinemas/69")
    @Headers({"Accept: application/json",
            "api_key: 199e2ce46ac525fddf"
    })

    Call<DetalleComplejo> obtenerDetalleCompler(@Query("country_code") String countryCode);

}
