package com.ssru.mrsmile.bowcakeuserhistory.main;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.view.View;

import com.ssru.mrsmile.bowcakeuserhistory.R;
import com.ssru.mrsmile.bowcakeuserhistory.member.add.AddMemberActivity;
import com.ssru.mrsmile.bowcakeuserhistory.mvp.NextzyMvpActivity;

public class MainActivity extends NextzyMvpActivity<MainContractor.Presenter> implements MainContractor.View, View.OnClickListener {
    private FloatingActionButton fabAddMember;

    @Override
    public int getLayoutView() {
        return R.layout.activity_main;
    }

    @Override
    protected void createPresenter() {
        MainPresenter.createPresenter(this);
    }

    @Override
    public void bindView() {
        fabAddMember = (FloatingActionButton) findViewById(R.id.main_fab_add_member);
    }

    @Override
    public void setupView() {
        fabAddMember.setOnClickListener(this);
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

    @Override
    public void setPresenter(MainContractor.Presenter presenter) {

    }

    @Override
    public void onClick(View v) {
        if (v == fabAddMember) {
            addMember();
        }
    }

    private void addMember() {
        onOpenActivity(AddMemberActivity.class);
    }

    private void onOpenActivity(Class cls) {
        Intent intent = new Intent(this, cls);
        startActivity(intent);
    }
}
