package com.example.bai_tap.appmusic.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.bai_tap.appmusic.Adapter.MainViewPager;
import com.example.bai_tap.appmusic.Fragment.Fagment_tim_kiem;
import com.example.bai_tap.appmusic.Fragment.Fagment_trang_chu;
import com.example.bai_tap.appmusic.R;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager viewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        anhxa();
        init();

    }

    private void init() {
        MainViewPager mainViewPagerAdapter = new MainViewPager(getSupportFragmentManager());
        mainViewPagerAdapter.addFragment(new Fagment_trang_chu(), "Trang chu");
        mainViewPagerAdapter.addFragment(new Fagment_tim_kiem(), "Tim kiem");

        viewPager.setAdapter(mainViewPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.getTabAt(0).setIcon(R.drawable.icontrangchu);
        tabLayout.getTabAt(1).setIcon(R.drawable.iconsearch);

    }

    private void anhxa() {
        tabLayout = findViewById(R.id.myTabLayout);
        viewPager = findViewById(R.id.myViewpager);
    }
}
