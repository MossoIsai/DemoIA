package com.mosso.demoia.controller.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.FrameLayout;

import com.aurelhubert.ahbottomnavigation.AHBottomNavigation;
import com.aurelhubert.ahbottomnavigation.AHBottomNavigationItem;
import com.mosso.demoia.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by isaigarciamoso on 20/12/17.
 */

public class BaseViewController extends AppCompatActivity {
    @BindView(R.id.bottom_navigation) AHBottomNavigation ahBottomNavigation;
    @BindView(R.id.myFragemnt) FrameLayout frameLayout;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.base_layout);
        ButterKnife.bind(this);
        initViews();
    }


    public void initViews(){

        AHBottomNavigationItem itemCartelera = new AHBottomNavigationItem(getString(R.string.item_perfil),R.drawable.item_perfil);
        AHBottomNavigationItem itemPeliculas = new AHBottomNavigationItem(getString(R.string.item_peliculas),R.drawable.ic_insta_icon);
        AHBottomNavigationItem itemUbicacion = new AHBottomNavigationItem(getString(R.string.item_ubicacion),R.drawable.ic_insta_icon);
        AHBottomNavigationItem itemPerfil = new AHBottomNavigationItem(getString(R.string.item_perfil),R.drawable.ic_insta_icon);

        ahBottomNavigation.addItem(itemCartelera);
        ahBottomNavigation.addItem(itemPeliculas);
        ahBottomNavigation.addItem(itemUbicacion);
        ahBottomNavigation.addItem(itemPerfil);

        ahBottomNavigation.setTitleState(AHBottomNavigation.TitleState.ALWAYS_SHOW);
        ahBottomNavigation.setTitleState(AHBottomNavigation.TitleState.ALWAYS_SHOW);
        ahBottomNavigation.setTitleState(AHBottomNavigation.TitleState.ALWAYS_SHOW);
        ahBottomNavigation.setTitleState(AHBottomNavigation.TitleState.ALWAYS_SHOW);
    }
}
