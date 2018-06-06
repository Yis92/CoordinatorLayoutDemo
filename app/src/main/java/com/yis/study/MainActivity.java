package com.yis.study;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ViewPager mViewPager;
    private TabLayout mTabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mViewPager = findViewById(R.id.view_pager);
        mTabLayout = findViewById(R.id.tab_layout);

//        mTabLayout.setVisibility(View.GONE);

        FragmentManager fragmentManager = getSupportFragmentManager();

        //初始化Fragment
        List<Fragment> fragmentList = new ArrayList<>();
        fragmentList.add(new ContentFragment());
        fragmentList.add(new ContentFragment2());

        List<String> tabName = new ArrayList<>();
        tabName.add("借款");
        tabName.add("信用卡");

        MyViewPagerAdapter adapter = new MyViewPagerAdapter(fragmentManager, fragmentList, tabName);
        mViewPager.setAdapter(adapter);
        mTabLayout.setupWithViewPager(mViewPager);

        //TabLayout监听滑动或点击
        mTabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                mViewPager.setCurrentItem(tab.getPosition(), false);
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }
}
