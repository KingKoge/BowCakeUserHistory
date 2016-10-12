package com.ssru.mrsmile.bowcakeuserhistory.member.add;

import android.os.Bundle;

import com.ssru.mrsmile.bowcakeuserhistory.R;
import com.ssru.mrsmile.bowcakeuserhistory.mvp.NextzyMvpActivity;

public class AddMemberActivity extends NextzyMvpActivity<AddMemberContractor.Presenter> implements AddMemberContractor.View {

    @Override
    public int getLayoutView() {
        return R.layout.activity_add_member;
    }

    @Override
    protected void createPresenter() {
        AddMemberPresenter.createPresenter(this);
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
}
