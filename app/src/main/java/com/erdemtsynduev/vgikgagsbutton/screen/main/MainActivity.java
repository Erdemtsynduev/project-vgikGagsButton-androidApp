package com.erdemtsynduev.vgikgagsbutton.screen.main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.erdemtsynduev.vgikgagsbutton.R;
import com.erdemtsynduev.vgikgagsbutton.controller.SoundController;
import com.erdemtsynduev.vgikgagsbutton.utils.ActivityUtils;
import com.google.android.gms.ads.MobileAds;

import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    private SoundController soundController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        MainFragment mainFragment = (MainFragment) getSupportFragmentManager()
                .findFragmentById(R.id.contentFrame);

        if (mainFragment == null) {
            mainFragment = MainFragment.newInstance();
            ActivityUtils.addFragmentToActivity(getSupportFragmentManager(),
                    mainFragment, R.id.contentFrame);
        }

        soundController = SoundController.getInstance();
        soundController.initController(this);

        new MainPresenter(mainFragment);

        MobileAds.initialize(getBaseContext(), "ca-app-pub-6483320460779580~9627661281");
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
    }

    @Override
    public void onBackPressed() {
        soundController.clear();
        finish();
    }
}
