package com.ssru.mrsmile.bowcakeuserhistory.member.add;

import com.ssru.mrsmile.bowcakeuserhistory.mvp.NextzyPresenter;

/**
 * Created by Mr.Smile on 9/29/2016.
 */

public class AddMemberPresenter extends NextzyPresenter<AddMemberContractor.View> implements AddMemberContractor.Presenter {
    protected AddMemberPresenter(AddMemberContractor.View view) {
        super(view);
    }

    public static AddMemberPresenter createPresenter(AddMemberContractor.View view) {
        return new AddMemberPresenter(view);
    }

    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }
}
