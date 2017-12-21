package com.mosso.demoia.controller.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

import com.mosso.demoia.R;

import java.util.Timer;
import java.util.TimerTask;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by isaigarciamoso on 19/12/17.
 */

public class SplashViewController extends AppCompatActivity{


    private static final int TIME_SCREEN_SPLASH = 5000;
    @BindView(R.id.img_splash)
    ImageView imgSplas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        dropNavbar();
        setContentView(R.layout.splash_layout);
        ButterKnife.bind(this);
        initViews();
    }

    public void initViews() {
        //tarea despues de terminar  el splahs
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashViewController.this, LoginViewController.class);
                startActivity(intent);
                finish();
            }
        };
        Timer timer = new Timer();
        timer.schedule(task, TIME_SCREEN_SPLASH);

    }
    public void dropNavbar() {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }





}
