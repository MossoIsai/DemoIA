package com.mosso.demoia.controller.activities;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.mosso.demoia.R;
import com.mosso.demoia.http.HttpLogin;
import com.mosso.demoia.http.RetrofitClient;
import com.mosso.demoia.models.response.UsuarioModel;
import com.mosso.demoia.tools.AlertDialogLoading;
import com.mosso.demoia.tools.Constantes;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginViewController extends AppCompatActivity {

    @BindView(R.id.btnInciarSesion) Button btnIniciarSesion;
    @BindView(R.id.txtOlvidarPassword)
    TextView labelOlvidarPassword;
    @BindView(R.id.btnRegistrar) Button btnRegistrar;
    @BindView(R.id.txtUsuario) EditText txtUsario;
    @BindView(R.id.txtPassword) EditText txtPassword;
    private AlertDialogLoading alertDialogLoading;


    @OnClick(R.id.btnInciarSesion) void btnClickInicarSesion(){
        String usuario = txtUsario.getText().toString().trim();
        String password  = txtPassword.getText().toString().trim();

        webServiceLogin(usuario,password);
       // Intent intent = new Intent(this,PerfilViewController.class);
        //startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);
        ButterKnife.bind(this);
        initViews();
    }

    public void initViews(){

        Typeface typefaceBold = Typeface.createFromAsset(getAssets(),"fonts/SF-UI-Display-Bold.otf");
        Typeface typefaceRegular = Typeface.createFromAsset(getAssets(),"fonts/SF-UI-Display-Regular.otf");
        Typeface typefaceSemiBold = Typeface.createFromAsset(getAssets(),"fonts/SF-UI-Display-Semibold.otf");

        btnRegistrar.setTypeface(typefaceBold);
        btnRegistrar.setTypeface(typefaceBold);
        labelOlvidarPassword.setTypeface(typefaceRegular);
        txtUsario.setTypeface(typefaceSemiBold);
        txtPassword.setTypeface(typefaceSemiBold);

        txtUsario.setText("pruebas_beto_ia@yahoo.com");
        txtPassword.setText("Pruebas01");

    }

    public void webServiceLogin(String  usuario, String password){

        alertDialogLoading = new AlertDialogLoading(LoginViewController.this);
        alertDialogLoading.messageDialog();

        HttpLogin httpLogin = RetrofitClient.getSharedInstance().create(HttpLogin.class);
        Call<UsuarioModel> usuarioModelCall =  httpLogin.login("MX",usuario,password,"password","IATestCandidate","c840457e777b4fee9b510fbcd4985b68");
        usuarioModelCall.enqueue(new Callback<UsuarioModel>() {
            @Override
            public void onResponse(Call<UsuarioModel> call, Response<UsuarioModel> response) {
                if(response.code() == 200){
                    //Datos correctos
                    alertDialogLoading.closeMessage();
                    saveDataSharedPreferences(response.body().getTokenType(),response.body().getAccessToken());
                    Intent  intent = new Intent(LoginViewController.this,BaseViewController.class);
                    startActivity(intent);
                }else{
                    //Datos No coiciden
                    alertDialogLoading.closeMessage();
                    System.out.println("ERROR");
                    System.out.println(response.message());
                }
            }
            @Override
            public void onFailure(Call<UsuarioModel> call, Throwable t) {
                alertDialogLoading.closeMessage();
                System.out.println("ERROR: ->"+t.getMessage());
            }
        });
    }
    public void saveDataSharedPreferences(String tokenType,String access_token ){
        SharedPreferences.Editor editor = getSharedPreferences(Constantes.PREFERENCIAS, Constantes.MODE_PRIVATE).edit();
        editor.putString("TOKEN_TYPE", tokenType);
        editor.putString("ACCESS_TOKEN", access_token);
        editor.commit();
    }

}
