package com.example.rparcas.androidejmplos;

import androidx.appcompat.app.AppCompatActivity;

import android.app.PictureInPictureParams;
import android.graphics.Point;
import android.os.Build;
import android.os.Bundle;
import android.util.Rational;
import android.view.Display;
import android.view.View;

public class PIPActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pip);
    }


    public void onClickOnPipMode(View view) {

        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){
            // Primero, obtendremos el tamaño de la pantalla usando getWindowManager().
            Display d = getWindowManager()
                    .getDefaultDisplay();
            Point p = new Point();
            d.getSize(p);
            int width = p.x;
            int height = p.y;
            // Después de eso, use la función enterPictureInPictureMode() que debe proporcionarse
            // con un parámetro PictureInPictureParams.Builder.
            Rational ratio
                    = new Rational(width, height);
            PictureInPictureParams.Builder
                    pip_Builder
                    = new PictureInPictureParams
                    .Builder();
            pip_Builder.setAspectRatio(ratio).build();
            enterPictureInPictureMode(pip_Builder.build());
        }

    }
}