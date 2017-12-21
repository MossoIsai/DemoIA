package com.mosso.demoia.controller.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.mosso.demoia.R;
import com.mosso.demoia.http.HttpProfile;
import com.mosso.demoia.http.RetrofitClient;
import com.mosso.demoia.models.response.PerfilModel;
import com.mosso.demoia.tools.Constantes;

import java.util.HashMap;
import java.util.Map;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by isaigarciamoso on 20/12/17.
 */

public class PerfilFragment extends Fragment {
    @BindView(R.id.username)
    TextView lblUsuario;
    @BindView(R.id.cardNumber) TextView lblTarjeta;
    private String accesToken;
    private String tokenType;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle savedInstanceState) {
         View rootView =  inflater.inflate(R.layout.perfil_layout,viewGroup,false);
         ButterKnife.bind(this,rootView);
         accesToken = Constantes.recuperarTokenAccess(getActivity());
         tokenType = Constantes.recuperarTokenType(getActivity());
         webServiceObtenerPerfil(tokenType,accesToken);
         return  rootView;
    }

    public void webServiceObtenerPerfil(String tokenType, String accesToken){
        HttpProfile httpProfile = RetrofitClient.getSharedInstance().create(HttpProfile.class);
        Map<String, String> map = new HashMap<>();

        map.put("Authorization", tokenType+" "+accesToken);
        Call<PerfilModel> perfilModelCall = httpProfile.obtenerPerfil("MX",map);
        perfilModelCall.enqueue(new Callback<PerfilModel>() {
            @Override
            public void onResponse(Call<PerfilModel> call, Response<PerfilModel> response) {
                if(response.code() == 200){
                Log.i("Correcto",response.body().getCardNumber());
                    lblUsuario.setText(response.body().getCardNumber());
                    lblTarjeta.setText(response.body().getEmail());
                }else{
                    Log.i("Error 1","Ocurrio un error:");

                }
            }
            @Override
            public void onFailure(Call<PerfilModel> call, Throwable t) {
                Log.i("Error 2","Ocurrio un error:" +t.getMessage());


            }
        });
    }





}
