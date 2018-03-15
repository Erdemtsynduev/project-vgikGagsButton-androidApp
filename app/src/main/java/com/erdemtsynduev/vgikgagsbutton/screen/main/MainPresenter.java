package com.erdemtsynduev.vgikgagsbutton.screen.main;

import android.content.Context;
import android.support.annotation.NonNull;

import com.erdemtsynduev.vgikgagsbutton.controller.SoundController;

import static com.erdemtsynduev.vgikgagsbutton.utils.Utils.checkNotNull;

public class MainPresenter implements MainContract.Presenter {

    private final MainContract.View mMainView;
    private SoundController soundController = SoundController.getInstance();

    public MainPresenter(@NonNull MainContract.View tasksView) {
        mMainView = checkNotNull(tasksView);
        mMainView.setPresenter(this);
    }

    @Override
    public void start() {

    }

    @Override
    public void playSound(TypeSound typeSound, Context context) {
        soundController.playSound(typeSound);
    }
}