package com.example.rparcas.androidejmplos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.tapadoo.alerter.Alerter;
import com.tapadoo.alerter.OnHideAlertListener;
import com.tapadoo.alerter.OnShowAlertListener;

public class PopUpMessagesActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pop_up_messages);

    }

    public void showAlerter(View v)
    {
        Alerter.create(this)
                .enableSwipeToDismiss()
                .setTitle("Alert Title")
                .setText("Alert Text")
                .setIcon(
                        R.drawable.ic_launcher_foreground)
                .setBackgroundColorRes(
                        R.color.purple_500)
                .setDuration(3000)
                .setOnClickListener(
                        new View.OnClickListener() {

                            @Override
                            public void onClick(View v)
                            {
                                // do something when
                                // Alerter message was clicked
                            }
                        })

                .setOnShowListener(
                        new OnShowAlertListener() {

                            @Override
                            public void onShow()
                            {
                                // do something when
                                // Alerter message shows
                            }
                        })

                .setOnHideListener(
                        new OnHideAlertListener() {

                            @Override
                            public void onHide()
                            {
                                // do something when
                                // Alerter message hides
                            }
                        })
                .show();
    }

    public void showToast(View view) {
        Toast.makeText(this,"TOAST",Toast.LENGTH_LONG).show();
    }
}