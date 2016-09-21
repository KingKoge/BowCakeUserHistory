package com.ssru.mrsmile.bowcakeuserhistory.main;

import android.os.Bundle;

import com.ssru.mrsmile.bowcakeuserhistory.R;
import com.ssru.mrsmile.bowcakeuserhistory.mvp.NextzyMvpActivity;

public class MainActivity extends NextzyMvpActivity<MainContractor.Presenter> implements MainContractor.View {

    @Override
    public int getLayoutView() {
        return R.layout.activity_main;
    }

    @Override
    protected void createPresenter() {
        MainPresenter.createPresenter(this);
    }

    @Override
    public void bindView() {

    }

    @Override
    public void setupView() {

    }

    @Override
    public void restoreArgument(Bundle bundle) {

    }

    @Override
    public void initialize() {

    }

    @Override
    public void restoreInstanceState(Bundle savedInstanceState) {

    }

    @Override
    public void restoreView() {

    }

    @Override
    public void saveInstanceState(Bundle outState) {

    }

    @Override
    public void setPresenter(MainContractor.Presenter presenter) {

    }
}
