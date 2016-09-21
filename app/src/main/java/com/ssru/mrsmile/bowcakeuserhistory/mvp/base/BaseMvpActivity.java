package com.ssru.mrsmile.bowcakeuserhistory.mvp.base;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.View;

import com.akexorcist.localizationactivity.LocalizationActivity;

/**
 * Created by Akexorcist on 8/1/16 AD.
 */
public abstract class BaseMvpActivity<CP extends BaseMvpContractorPresenter> extends LocalizationActivity implements BaseMvpContractorView<CP> {
    private CP presenter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutView());
        createPresenter();
        bindView();
        setupView();

        if (savedInstanceState == null) {
            Intent intent = getIntent();
            if (intent != null) {
                restoreArgument(intent.getExtras());
            }
            initialize();
        }
    }

    /**
     * your R.layout.xxx resource
     */
    public abstract int getLayoutView();

    /**
     * required at the child class
     */
    protected abstract void createPresenter();

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    /**
     * your {@link View#findViewById(int)}
     */
    public abstract void bindView();

    /**
     * setting your view e.g. {@link View#setOnClickListener(View.OnClickListener)}  }
     */
    public abstract void setupView();

    /**
     * For Fragment {@link Fragment#getArguments()}
     * For Activity {@link Activity#getIntent()}
     *
     * @param bundle
     */
    public abstract void restoreArgument(Bundle bundle);

    /**
     * Put your logic codes that you want them to execute when activity starts
     */
    public abstract void initialize();

    /**
     * restore state when rotating screens or when configs have been changed
     *
     * @param savedInstanceState
     */
    public abstract void restoreInstanceState(Bundle savedInstanceState);

    /**
     * incase there is view to be updated after the restoreInstanceState
     */
    public abstract void restoreView();

    /**
     * put your data here before rotating screens or when configs have been changed
     *
     * @param outState
     */
    public abstract void saveInstanceState(Bundle outState);

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        saveInstanceState(outState);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        restoreInstanceState(savedInstanceState);
        restoreView();
    }

    /**
     * All business's codes must be in presenter. You are required to call getPresenter()
     * and follow by business's logic method
     *
     * @return
     */
    public CP getPresenter() {
        return presenter;
    }

    @Override
    public void setPresenter(CP presenter) {
        this.presenter = presenter;
    }
}
