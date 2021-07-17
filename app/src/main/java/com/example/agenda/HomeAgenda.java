package com.example.agenda;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.OnBackPressedCallback;
import androidx.appcompat.app.AppCompatActivity;

public class HomeAgenda extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_agenda);
        OnBackPressedCallback callback = new OnBackPressedCallback(true /* enabled by default */) {
            @Override
            public void handleOnBackPressed() {
                alertDialogReturn();
            }
        };
        getOnBackPressedDispatcher().addCallback(this, callback);
    }

    public void onClickHome(View view) {

    }
    public AlertDialog alertDialogReturn() {
        return new AlertDialog.Builder(this)
                .setMessage("¿Desea salir de la aplicacion?")
                .setNegativeButton("no", null)
                .setPositiveButton("si", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                        finish();
                    }
                })
                .show();
    }
}