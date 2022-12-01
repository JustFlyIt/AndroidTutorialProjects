package com.example.servicedemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public Button startButton;
    public Button stopButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startButton = (Button)findViewById(R.id.startService);
        stopButton = (Button)findViewById((R.id.stopService));
    }

    //onClick methods of both buttons point to this or....
    public void controlServiceMethod(View view) {
        if (view == startButton) {
            startService(new Intent( this, ServiceDemo.class));
        } else if ( view == stopButton){
            stopService(new Intent( this, ServiceDemo.class));
        }
    }

    //The startService button's onClick method points to this
    public void startServiceProcessing (View view) {
        startService(new Intent( this, ServiceDemo.class));
    }

    //The stopService button's onClick method points to this
    public void stopServiceProcessing (View view) {
        stopService(new Intent( this, ServiceDemo.class));
    }
}