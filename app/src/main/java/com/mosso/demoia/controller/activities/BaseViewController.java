package com.mosso.demoia.controller.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.widget.FrameLayout;

import com.aurelhubert.ahbottomnavigation.AHBottomNavigation;
import com.aurelhubert.ahbottomnavigation.AHBottomNavigationItem;
import com.mosso.demoia.R;
import com.mosso.demoia.controller.fragment.CarteleraFragment;
import com.mosso.demoia.controller.fragment.PerfilFragment;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by isaigarciamoso on 20/12/17.
 */

public class BaseViewController extends AppCompatActivity {
    @BindView(R.id.bottom_navigation) AHBottomNavigation ahBottomNavigation;
    @BindView(R.id.myFragemnt) FrameLayout frameLayout;
    private int currentPosition = 0 ;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.base_layout);
        ButterKnife.bind(this);
        initViews();

    }


    public void initViews(){

        AHBottomNavigationItem itemCartelera = new AHBottomNavigationItem(getString(R.string.item_perfil),R.drawable.item_perfil);
        AHBottomNavigationItem itemPeliculas = new AHBottomNavigationItem(getString(R.string.item_cartelera),R.drawable.palomas);
        AHBottomNavigationItem itemUbicacion = new AHBottomNavigationItem(getString(R.string.item_ubicacion),R.drawable.gps);

        ahBottomNavigation.addItem(itemCartelera);
        ahBottomNavigation.addItem(itemPeliculas);
        ahBottomNavigation.addItem(itemUbicacion);

        ahBottomNavigation.setTitleState(AHBottomNavigation.TitleState.ALWAYS_SHOW);
        ahBottomNavigation.setTitleState(AHBottomNavigation.TitleState.ALWAYS_SHOW);
        ahBottomNavigation.setTitleState(AHBottomNavigation.TitleState.ALWAYS_SHOW);
        ahBottomNavigation.setCurrentItem(0);

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        PerfilFragment perfilFragment = new PerfilFragment();
        fragmentTransaction.add(R.id.myFragemnt, perfilFragment);
        fragmentTransaction.replace(R.id.myFragemnt, perfilFragment);
        fragmentTransaction.commit();


        //Listener ahBottomNavigationView
        ahBottomNavigation.setOnTabSelectedListener(new AHBottomNavigation.OnTabSelectedListener() {
            @Override
            public boolean onTabSelected(int position, boolean wasSelected) {


                if (currentPosition == position) {

                } else {
                    switch (position) {
                        case 0:
                            currentPosition = position;
                            System.out.println("POSICION ACTUAL: " + currentPosition);
                            FragmentManager fragmentManager = getSupportFragmentManager();
                            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                            PerfilFragment perfilFragment = new PerfilFragment();
                            /**menuViewController.setArguments(bundle);**/
                            fragmentTransaction.add(R.id.myFragemnt, perfilFragment);
                            fragmentTransaction.replace(R.id.myFragemnt, perfilFragment);
                            fragmentTransaction.commit();
                            return true;
                        case 1:
                            currentPosition = position;
                            System.out.println("POSICION ACTUAL: " + currentPosition);
                            FragmentManager fragmentManager2 = getSupportFragmentManager();
                            FragmentTransaction fragmentTransaction2 = fragmentManager2.beginTransaction();
                            CarteleraFragment carteleraFragment = new CarteleraFragment();
                            /**menuViewController.setArguments(bundle);**/
                            fragmentTransaction2.add(R.id.myFragemnt, carteleraFragment);
                            fragmentTransaction2.replace(R.id.myFragemnt, carteleraFragment);
                            fragmentTransaction2.commit();
                            return  true;
                        case 2:
                            currentPosition = position;
                            System.out.println("POSICION ACTUAL: " + currentPosition);
                            FragmentManager fragmentManager3 = getSupportFragmentManager();
                            FragmentTransaction fragmentTransaction3 = fragmentManager3.beginTransaction();
                            PerfilFragment perfilFragment3 = new PerfilFragment();
                            /**menuViewController.setArguments(bundle);**/
                            fragmentTransaction3.add(R.id.myFragemnt, perfilFragment3);
                            fragmentTransaction3.replace(R.id.myFragemnt, perfilFragment3);
                            fragmentTransaction3.commit();
                            return  true;

                    }
                    return true;
                }
                return true;
            }
        });
    }
}
