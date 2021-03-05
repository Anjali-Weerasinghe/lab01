package com.example.mobileappproject02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import javax.security.auth.login.LoginException;

public class MadTutorial02 extends AppCompatActivity {
    private static final String  TAG = "MadTutorial";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mad_tutorial02);

        Log.i(TAG, "onCreate: involved");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart: involved");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResume: involved");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "onRestart: involved");
    }
}
