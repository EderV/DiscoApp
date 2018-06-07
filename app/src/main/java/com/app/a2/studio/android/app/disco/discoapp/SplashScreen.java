package com.app.a2.studio.android.app.disco.discoapp;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashScreen extends AppCompatActivity {

    private static final int TIME_SPLASH = 4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(SplashScreen.this, MainScreen.class);
                startActivity(i);

                SplashScreen.this.finish();
            }
        }, TIME_SPLASH);

    }

    @Override
    public void onBackPressed() {
        //super.onBackPressed();
    }

}
