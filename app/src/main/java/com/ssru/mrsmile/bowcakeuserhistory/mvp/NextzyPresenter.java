package com.ssru.mrsmile.bowcakeuserhistory.mvp;

import com.ssru.mrsmile.bowcakeuserhistory.mvp.base.BaseMvpContractorPresenter;
import com.ssru.mrsmile.bowcakeuserhistory.mvp.base.BaseMvpContractorView;
import com.ssru.mrsmile.bowcakeuserhistory.mvp.base.BaseMvpPresenter;

/**
 * Created by Akexorcist on 8/5/16 AD.
 */
public abstract class NextzyPresenter<CV extends BaseMvpContractorView> extends BaseMvpPresenter<CV> implements BaseMvpContractorPresenter {
    protected NextzyPresenter(CV view) {
        super(view);
    }
}
