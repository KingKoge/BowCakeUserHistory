package com.ssru.mrsmile.bowcakeuserhistory.utility;

import android.content.Context;

/**
 * Created by Mr.Smile on 8/4/2016.
 */
public class Contextor {
    private static Contextor instance;

    private Contextor() {

    }

    public static Contextor getInstance() {
        if (instance == null) {
            instance = new Contextor();
        }
        return instance;
    }

    private Context context;

    public void setContext(Context context){
        this.context = context.getApplicationContext();
    }

    public Context getContext() {
        return context;
    }
}
