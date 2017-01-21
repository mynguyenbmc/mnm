package com.mnm.rockink.buttontest;

import android.app.Application;

/**
 * Created by rockink on 1/21/17.
 */

public class MyApp extends Application {


    @Override
    public void onCreate() {
        super.onCreate();
        if (BuildConfig.DEBUG) {
            com.usebutton.sdk.Button.enableDebugLogging();
        }
        com.usebutton.sdk.Button.getButton(this).start();
    }
}
