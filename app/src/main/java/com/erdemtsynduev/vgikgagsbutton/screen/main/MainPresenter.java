package com.erdemtsynduev.vgikgagsbutton.screen.main;

import android.content.Context;
import android.media.MediaPlayer;
import android.support.annotation.NonNull;

import com.erdemtsynduev.vgikgagsbutton.R;

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
    public void playSound(TypeSound typeSound, Context context) {
        switch (typeSound) {
            case CSKA_SOUND:
                playingSound(context, R.raw.feduk_cska);
                break;
            case PENALTI_SOUND:
                playingSound(context, R.raw.this_penalti);
                break;
            case GAZEEV_SOUND:
                playingSound(context, R.raw.gazzaev_ebalniki);
                break;
            case PASHA_SOUND:
                playingSound(context, R.raw.pasha);
                break;
            case DAYS_SOUND:
                playingSound(context, R.raw.red_white_days);
                break;
        }
    }

    private void playingSound(Context context, int resid) {
        try {
            if (mediaPlayer == null) {
                mediaPlayer = MediaPlayer.create(context, resid);
                mediaPlayer.setLooping(true);
                mediaPlayer.start();
            } else {
                mediaPlayer.stop();
                mediaPlayer.reset();
                mediaPlayer.release();
                mediaPlayer = null;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}