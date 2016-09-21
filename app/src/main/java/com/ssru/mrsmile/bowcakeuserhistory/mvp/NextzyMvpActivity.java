package com.ssru.mrsmile.bowcakeuserhistory.mvp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.ssru.mrsmile.bowcakeuserhistory.mvp.base.BaseMvpActivity;
import com.ssru.mrsmile.bowcakeuserhistory.mvp.base.BaseMvpContractorPresenter;

/**
 * Created by Akexorcist on 8/4/16 AD.
 */
public abstract class NextzyMvpActivity<CP extends BaseMvpContractorPresenter> extends BaseMvpActivity<CP> {
    public View getRootView() {
        return getWindow().getDecorView().getRootView();
    }

    protected void openActivity(Class<?> cls) {
        openActivity(cls, null, false);
    }

    protected void openActivity(Class<?> cls, boolean finishActivity) {
        openActivity(cls, null, finishActivity);
    }

    protected void openActivity(Class<?> cls, Bundle bundle) {
        openActivity(cls, bundle, false);
    }

    protected void openActivity(Class<?> cls, Bundle bundle, boolean finishActivity) {
        Intent intent = new Intent(this, cls);
        if (bundle != null)
            intent.putExtras(bundle);
        startActivity(intent);
        if (finishActivity)
            finish();
    }
}
