package com.mosso.demoia.controller.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mosso.demoia.R;
import com.mosso.demoia.http.HttpCartelera;
import com.mosso.demoia.http.RetrofitClient;
import com.mosso.demoia.models.response.MovieMain;
import com.mosso.demoia.models.response.MovieModel;
import com.mosso.demoia.tools.AlertDialogLoading;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by isaigarciamoso on 21/12/17.
 */

public class CarteleraFragment extends Fragment {
    private AlertDialogLoading  alertDialogLoading;
    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup viewGroup,  Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.cartelera_layout,viewGroup,false);
        webServiceObtenerCartelera("MX","32");
        return  rootView;
    }
    //Servicio obtener Cartelera
    public void webServiceObtenerCartelera(String countryCode,String cinemas){
        alertDialogLoading = new AlertDialogLoading(getActivity());
        alertDialogLoading.messageDialog();

        HttpCartelera httpCartelera = RetrofitClient.getSharedInstance().create(HttpCartelera.class);
        Call<MovieMain> movieModelCall = httpCartelera.obtenerCartelera(countryCode,cinemas);
        movieModelCall.enqueue(new Callback<MovieMain>() {
            @Override
            public void onResponse(Call<MovieMain> call, Response<MovieMain> response) {
                if(response.code() == 200) {
                    //Log.i("CORRECTO",""+response.body().toString());
                    Log.i("CORRECTO",""+response.body().getMovieModelList().get(0).getCode());
                    alertDialogLoading.closeMessage();

                }else{
                    Log.i("ERROR 1","Error");
                    alertDialogLoading.closeMessage();

                }
            }

            @Override
            public void onFailure(Call<MovieMain> call, Throwable t) {
                Log.i("ERROR 2","Error: "+t.getMessage());
                alertDialogLoading.closeMessage();
            }
        });
    }
}
