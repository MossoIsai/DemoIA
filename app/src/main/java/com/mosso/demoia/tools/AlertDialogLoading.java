package com.mosso.demoia.tools;

import android.app.ProgressDialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.Window;

import com.mosso.demoia.R;

/**
 * Created by isaigarciamoso on 20/12/17.
 */

public class AlertDialogLoading {

    private Context context;
    private ProgressDialog progressDialog;

    public AlertDialogLoading(Context context) {
        this.context = context;
    }

    //messageDialog
    public void messageDialog() {

        progressDialog = new ProgressDialog(context);
        progressDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
        progressDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        progressDialog.setCancelable(false);
        progressDialog.show();
        progressDialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
        progressDialog.setContentView(R.layout.loanding_layout);
    }

    // cerrar mensaje
    public void closeMessage() {
        progressDialog.dismiss();
    }
}