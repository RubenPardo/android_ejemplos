package com.example.rparcas.androidejmplos;

import androidx.appcompat.app.AppCompatActivity;
import hotchemi.android.rate.AppRate;

import android.os.Bundle;

public class ValorarAplicacionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_valorar_aplicacion);

        // Here 0 means
        // the installation date.
        AppRate.with(this)

                // default 10
                .setInstallDays(0)

                // default 10
                .setLaunchTimes(3)

                // default 1
                .setRemindInterval(1)
                .monitor();

        // Show a dialogue
        // if meets conditions
        AppRate
                .showRateDialogIfMeetsConditions(
                        this);
    }
}