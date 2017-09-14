package com.ahmadrosid.lovelycity;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;

import com.ahmadrosid.lovelycity.boarding.BoardingAdapter;
import com.ahmadrosid.lovelycity.boarding.BoardingIndicator;

public class OnboardingActivity extends AppCompatActivity {

    private ViewPager pagerBoarding;
    private LinearLayout mLinearLayout;
    private BoardingAdapter adapter;
    private BoardingIndicator mIndicator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onboarding);

        pagerBoarding = (ViewPager) findViewById(R.id.pagerBoarding);
        mLinearLayout = (LinearLayout) findViewById(R.id.mLinearLayout);

        adapter = new BoardingAdapter(getSupportFragmentManager());
        pagerBoarding.setAdapter(adapter);
        mIndicator = new BoardingIndicator(this, mLinearLayout, pagerBoarding, R.drawable.indicator_circle);
        mIndicator.setPageCount(3);
        mIndicator.setSize(R.dimen.indicator_dimens);
        mIndicator.show();
    }
}
