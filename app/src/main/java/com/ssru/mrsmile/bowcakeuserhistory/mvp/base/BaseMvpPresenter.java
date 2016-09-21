package com.ssru.mrsmile.bowcakeuserhistory.mvp.base;

/**
 * Created by Akexorcist on 8/1/16 AD.
 */
public abstract class BaseMvpPresenter<CV extends BaseMvpContractorView> implements BaseMvpContractorPresenter {
    private CV view;

    protected BaseMvpPresenter(CV view) {
        this.view = view;
        view.setPresenter(this);
    }

    public CV getView() {
        return view;
    }

    /**
     *put the register here e.g.
     * @see com.hwangjr.rxbus.Bus#register(Object)
     * make sure that you call getPresenter().start() inside your {@link BaseMvpContractorView}
     */
    @Override
    public abstract void start();

    /**
     *put the register here e.g.
     * @see com.hwangjr.rxbus.Bus#unregister(Object)
     * make sure that you call getPresenter().stop() inside your {@link BaseMvpContractorView}
     */
    @Override
    public abstract void stop();
}
