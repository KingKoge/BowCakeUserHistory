package com.ssru.mrsmile.bowcakeuserhistory.mvp.base;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;

import com.akexorcist.localizationactivity.LocalizationDelegate;
import com.akexorcist.localizationactivity.OnLocaleChangedListener;
import com.jeremyfeinstein.slidingmenu.lib.SlidingMenu;
import com.jeremyfeinstein.slidingmenu.lib.app.SlidingFragmentActivity;

import java.util.Locale;

/**
 * Created by Akexorcist on 8/1/16 AD.
 */
public abstract class BaseMvpSlidingMenuActivity<CP extends BaseMvpContractorPresenter> extends SlidingFragmentActivity implements BaseMvpContractorView<CP>, OnLocaleChangedListener {
    private CP presenter;
    private LocalizationDelegate localizationDelegate = new LocalizationDelegate(this);

    @Override
    public void onCreate(Bundle savedInstanceState) {
        localizationDelegate.addOnLocaleChengedListener(this);
        localizationDelegate.onCreate(savedInstanceState);
        super.onCreate(savedInstanceState);
        setContentView(getLayoutView());
        setBehindContentView(getBehindLayoutView());
        createPresenter();
        bindView();
        setupView();
        setupSlidingMenuFragment(savedInstanceState);
        setupSlidingMenuView(getSlidingMenu());

        if (savedInstanceState == null) {
            Intent intent = getIntent();
            if (intent != null) {
                restoreArgument(intent.getExtras());
            }
            initialize();
        }
    }

    private void setupSlidingMenuFragment(Bundle savedInstanceState) {
        if (savedInstanceState == null) {
            FragmentTransaction fragmentTransaction = this.getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(getSlidingMenuLayoutContainer(), getSlidingMenuFragment());
            fragmentTransaction.commit();
        }
    }

    public abstract int getLayoutView();

    public abstract int getBehindLayoutView();

    protected abstract void createPresenter();

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    public abstract void bindView();

    public abstract void setupView();

    public abstract void setupSlidingMenuView(SlidingMenu slidingMenu);

    protected abstract Fragment getSlidingMenuFragment();

    protected abstract int getSlidingMenuLayoutContainer();

    public abstract void restoreArgument(Bundle bundle);

    public abstract void initialize();

    public abstract void restoreInstanceState(Bundle savedInstanceState);

    public abstract void restoreView();

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

    public CP getPresenter() {
        return presenter;
    }

    @Override
    public void setPresenter(CP presenter) {
        this.presenter = presenter;
    }

    @Override
    public void onResume() {
        super.onResume();
        localizationDelegate.onResume();
    }

    public final void setLanguage(String language) {
        localizationDelegate.setLanguage(language);
    }

    public final void setLanguage(Locale locale) {
        localizationDelegate.setLanguage(locale);
    }

    public final void setDefaultLanguage(String language) {
        localizationDelegate.setDefaultLanguage(language);
    }

    public final void setDefaultLanguage(Locale locale) {
        localizationDelegate.setDefaultLanguage(locale);
    }

    public final String getLanguage() {
        return localizationDelegate.getLanguage();
    }

    public final Locale getLocale() {
        return localizationDelegate.getLocale();
    }

    // Just override method locale change event
    @Override
    public void onBeforeLocaleChanged() {
    }

    @Override
    public void onAfterLocaleChanged() {
    }

    public void openSideMenu() {
        showMenu();
    }
}
