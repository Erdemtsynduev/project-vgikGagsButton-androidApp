package com.erdemtsynduev.vgikgagsbutton.screen.main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.erdemtsynduev.vgikgagsbutton.R;
import com.erdemtsynduev.vgikgagsbutton.controller.SoundController;
import com.erdemtsynduev.vgikgagsbutton.utils.ActivityUtils;

import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

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

        SoundController.getInstance().initController(this);

        new MainPresenter(mainFragment);
    }
}
