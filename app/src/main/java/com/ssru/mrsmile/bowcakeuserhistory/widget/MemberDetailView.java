package com.ssru.mrsmile.bowcakeuserhistory.widget;

import android.content.Context;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import com.ssru.mrsmile.bowcakeuserhistory.R;

/**
 * Created by Mr.Smile on 10/11/2016.
 */
public class MemberDetailView extends FrameLayout {
    private TextView tvMemberName;
    private TextView tvMemberAddress;
    private TextView tvMemberTel;

    private ImageView ivMemberImage;

    public MemberDetailView(Context context) {
        super(context);
        setUp();
    }

    public MemberDetailView(Context context, AttributeSet attrs) {
        super(context, attrs);
        setUp();
    }

    public MemberDetailView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setUp();
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public MemberDetailView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        setUp();
    }

    private void setUp() {
        inflate(getContext(), R.layout.member_detail_view, this);

        tvMemberName = (TextView) findViewById(R.id.member_detail_view_tv_member_name);
        tvMemberAddress = (TextView) findViewById(R.id.member_detail_view_tv_member_address);
        tvMemberTel = (TextView) findViewById(R.id.member_detail_view_tv_member_tel);

        ivMemberImage = (ImageView) findViewById(R.id.member_detail_view_iv_member_image);
    }

    public void setMemberImage(int resId) {
        ivMemberImage.setImageResource(resId);
    }

    public void setMemberName(String name) {
        tvMemberName.setText(name);
    }

    public void setMemberAddress(String address) {
        tvMemberAddress.setText(address);
    }

    public void setMemberTel(String tel) {
        tvMemberTel.setText(tel);
    }
}
