package com.ssru.mrsmile.bowcakeuserhistory.main;

import com.ssru.mrsmile.bowcakeuserhistory.mvp.NextzyPresenter;

/**
 * Created by Mr.Smile on 8/26/2016.
 */
public class MainPresenter extends NextzyPresenter<MainContractor.View> implements MainContractor.Presenter {

    protected MainPresenter(MainContractor.View view) {
        super(view);
    }

    public static MainPresenter createPresenter(MainContractor.View view) {
        return new MainPresenter(view);
    }

    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }
}
