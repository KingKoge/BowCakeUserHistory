package com.ssru.mrsmile.bowcakeuserhistory.member.edit;

import com.ssru.mrsmile.bowcakeuserhistory.mvp.NextzyPresenter;

/**
 * Created by Mr.Smile on 9/29/2016.
 */

public class EditMemberPresenter extends NextzyPresenter<EditMemberContractor.View> implements EditMemberContractor.Presenter {
    protected EditMemberPresenter(EditMemberContractor.View view) {
        super(view);
    }

    public static EditMemberPresenter createPresenter(EditMemberContractor.View view) {
        return new EditMemberPresenter(view);
    }

    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }


}
