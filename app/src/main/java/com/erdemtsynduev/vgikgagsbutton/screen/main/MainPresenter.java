package com.erdemtsynduev.vgikgagsbutton.screen.main;

import android.support.annotation.NonNull;

import static com.erdemtsynduev.vgikgagsbutton.utils.Utils.checkNotNull;

public class MainPresenter implements MainContract.Presenter {

    private final MainContract.View mMainView;

    public MainPresenter(@NonNull MainContract.View tasksView) {
        mMainView = checkNotNull(tasksView);
        mMainView.setPresenter(this);
    }

    @Override
    public void start() {

    }
}