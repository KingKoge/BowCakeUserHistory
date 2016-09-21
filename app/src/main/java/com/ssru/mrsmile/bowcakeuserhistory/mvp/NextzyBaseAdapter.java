package com.ssru.mrsmile.bowcakeuserhistory.mvp;

import android.support.v4.app.FragmentManager;

import com.ssru.mrsmile.bowcakeuserhistory.mvp.base.BaseMvpBaseAdapter;
import com.ssru.mrsmile.bowcakeuserhistory.mvp.base.BaseMvpContractorPresenter;

/**
 * Created by Akexorcist on 8/5/16 AD.
 */
public abstract class NextzyBaseAdapter<CP extends BaseMvpContractorPresenter> extends BaseMvpBaseAdapter<CP> {
    public NextzyBaseAdapter(FragmentManager fm) {
        super(fm);
    }
}
