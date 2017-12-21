package com.mosso.demoia.tools;

import android.app.Activity;
import android.content.SharedPreferences;

/**
 * Created by isaigarciamoso on 19/12/17.
 */

public class Constantes {
   public static final String  BASE_URL =  "http://api-stage.cinepolis.com";
   public static final String PREFERENCIAS =  "mis_preferencias";
   public static final int MODE_PRIVATE  =  0;


   public static String recuperarTokenAccess(Activity activity){
      SharedPreferences sharedPreferences  =  activity.getSharedPreferences(PREFERENCIAS,MODE_PRIVATE);
      return sharedPreferences.getString("ACCESS_TOKEN","SIN_TOKEN");
   }
   public static String recuperarTokenType(Activity activity){
      SharedPreferences sharedPreferences  =  activity.getSharedPreferences(PREFERENCIAS,MODE_PRIVATE);
      return sharedPreferences.getString("TOKEN_TYPE","SIN_TOKEN");
   }

}
