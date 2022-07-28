package com.example.rparcas.androidejmplos;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.app.PictureInPictureParams;
import android.content.Intent;
import android.graphics.Point;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.util.Rational;
import android.view.Display;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void onClickIrPIP(View view) {
        startActivity(new Intent(this,PIPActivity.class));
    }

    public void onClickIrModoOscuro(View view) {
        startActivity(new Intent(this,ModoOscuro.class));
    }

    public void onClickIrValorarApp(View view) {
        startActivity(new Intent(this,ValorarAplicacionActivity.class));
    }

    /*public void onClickIrPIP(View view) {
        startActivity(new Intent(this,PIPActivity.class));
    }*/
}