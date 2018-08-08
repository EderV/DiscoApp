package com.app.a2.studio.android.app.disco.discoapp.Screens.SplashScreen;

import android.app.ActionBar;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.app.a2.studio.android.app.disco.discoapp.DeteccionHomeBTN.HomeWatcher;
import com.app.a2.studio.android.app.disco.discoapp.DeteccionHomeBTN.OnHomePressedListener;
import com.app.a2.studio.android.app.disco.discoapp.R;
import com.app.a2.studio.android.app.disco.discoapp.Screens.MainScreen.MainScreen.MainScreen;

public class SplashScreen extends AppCompatActivity {

    private static final int TIME_SPLASH = 2500;
    private boolean homePressed = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        HomeWatcher mHomeWatcher = new HomeWatcher(this);
        mHomeWatcher.setOnHomePressedListener(new OnHomePressedListener() {
            @Override
            public void onHomePressed() {
                homePressed = true;
            }
            @Override
            public void onHomeLongPressed() {
            }
        });
        mHomeWatcher.startWatch();


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if (!homePressed){
                    Intent i = new Intent(SplashScreen.this, MainScreen.class);
                    startActivity(i);
                }
                else {
                    System.exit(0);
                }
                SplashScreen.this.finish();
            }
        }, TIME_SPLASH);

    }

    @Override
    public void onBackPressed() {
        //super.onBackPressed();
    }

}

