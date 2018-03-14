package com.erdemtsynduev.vgikgagsbutton.screen.main;

import android.media.MediaPlayer;
import android.support.annotation.NonNull;

import static com.erdemtsynduev.vgikgagsbutton.utils.Utils.checkNotNull;

public class MainPresenter implements MainContract.Presenter {

    private MediaPlayer mediaPlayer;

    private final MainContract.View mMainView;

    public MainPresenter(@NonNull MainContract.View tasksView) {
        mMainView = checkNotNull(tasksView);
        mMainView.setPresenter(this);
    }

    @Override
    public void start() {

    }

    @Override
    public void playSound(TypeSound typeSound) {
        switch (typeSound) {
            case CSKA_SOUND:
                mediaPlayer = MediaPlayer.create(context, R.raw.sound);
                break;
            case PENALTI_SOUND:
                mPresenter.setFiltering(MovieFilterType.TOP_RATED_MOVIES);
                break;
            case GAZEEV_SOUND:
                mPresenter.setFiltering(MovieFilterType.TOP_RATED_MOVIES);
                break;
            case PASHA_SOUND:
                mPresenter.setFiltering(MovieFilterType.TOP_RATED_MOVIES);
                break;
            case DAYS_SOUND:
                mPresenter.setFiltering(MovieFilterType.TOP_RATED_MOVIES);
                break;
        }
    }
}