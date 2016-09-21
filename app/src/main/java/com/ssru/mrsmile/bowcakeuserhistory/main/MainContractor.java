package com.ssru.mrsmile.bowcakeuserhistory.main;

import com.ssru.mrsmile.bowcakeuserhistory.mvp.NextzyContractorPresenter;
import com.ssru.mrsmile.bowcakeuserhistory.mvp.NextzyContractorView;

/**
 * Created by Mr.Smile on 8/26/2016.
 */
public class MainContractor {

    interface Presenter extends NextzyContractorPresenter{

    }

    interface View extends NextzyContractorView<Presenter> {

    }
}
