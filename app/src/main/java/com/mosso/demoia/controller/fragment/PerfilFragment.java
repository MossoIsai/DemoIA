package com.mosso.demoia.controller.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mosso.demoia.R;

/**
 * Created by isaigarciamoso on 20/12/17.
 */

public class PerfilFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle savedInstanceState) {

         View rootView =  inflater.inflate(R.layout.perfil_layout,viewGroup,false);
         return  rootView;
    }
}
