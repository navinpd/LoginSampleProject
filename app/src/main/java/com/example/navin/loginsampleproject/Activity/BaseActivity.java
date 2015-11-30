package com.example.navin.loginsampleproject.Activity;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;

import com.facebook.appevents.AppEventsLogger;

/**
 * Created by Navin on 29/11/15.
 */
public class BaseActivity extends AppCompatActivity {

    @Override
    protected void onResume() {
        super.onResume();
        // Logs 'install' and 'app activate' App Events.
        AppEventsLogger.activateApp(this);
    }

    @Override
    protected void onPause() {
        super.onPause();

        // Logs 'app deactivate' App Event.
        AppEventsLogger.deactivateApp(this);
    }
}
