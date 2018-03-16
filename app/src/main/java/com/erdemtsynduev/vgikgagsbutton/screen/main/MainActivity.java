package com.erdemtsynduev.vgikgagsbutton.screen.main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.erdemtsynduev.vgikgagsbutton.R;
import com.erdemtsynduev.vgikgagsbutton.controller.SoundController;
import com.erdemtsynduev.vgikgagsbutton.utils.ActivityUtils;

import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    private static final String CURRENT_FILTERING_KEY = "CURRENT_FILTERING_KEY";

    private SoundController soundController;
    private MainPresenter mMainPresenter;

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
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onDestroy() {
        soundController.clear();
        super.onDestroy();
    }

    @Override
    public void onBackPressed() {
        soundController.clear();
        finish();
    }
}
