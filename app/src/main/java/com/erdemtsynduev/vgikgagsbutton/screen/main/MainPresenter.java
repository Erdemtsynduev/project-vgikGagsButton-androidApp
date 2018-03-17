package com.erdemtsynduev.vgikgagsbutton.screen.main;

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
        mMainView.setSelectedButton();
    }

    @Override
    public void playSound(TypeSound typeSound) {
        soundController.playSound(typeSound);
        mMainView.setSelectedButton();
    }

    @Override
    public void pauseAllSound() {
        soundController.pauseAllSound();
    }

    @Override
    public void resumeAllSound() {
        soundController.resumeAllSound();
    }
}