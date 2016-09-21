package com.ssru.mrsmile.bowcakeuserhistory;

import android.app.Application;

import com.ssru.mrsmile.bowcakeuserhistory.utility.Contextor;

/**
 * Created by Mr.Smile on 8/4/2016.
 */
public class MVPApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Contextor.getInstance().setContext(getApplicationContext());
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
    }
}
