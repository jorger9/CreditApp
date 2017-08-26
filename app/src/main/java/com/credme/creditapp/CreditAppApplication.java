package com.credme.creditapp;

import android.app.Application;
import android.util.Log;

/**
 * Created by jorger9 on 8/25/17.
 */

public class CreditAppApplication extends Application {
    private static final String TAG = "CreditAppApplication";
    @Override
    public void onCreate() {
        super.onCreate();

        Log.d(TAG,"Inicializando variables");
    }
}
