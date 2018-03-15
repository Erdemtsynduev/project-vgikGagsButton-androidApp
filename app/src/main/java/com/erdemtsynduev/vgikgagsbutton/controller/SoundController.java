package com.erdemtsynduev.vgikgagsbutton.controller;

import android.content.Context;
import android.media.MediaPlayer;

import com.erdemtsynduev.vgikgagsbutton.R;
import com.erdemtsynduev.vgikgagsbutton.screen.main.TypeSound;

public class SoundController {

    private MediaPlayer mediaPlayerCska, mediaPlayerPenalti, mediaPlayerGazeev,
            mediaPlayerPasha, mediaPlayerDays;

    private Context context;

    private static SoundController ourInstance = new SoundController();

    public static SoundController getInstance() {
        return ourInstance;
    }

    private SoundController() {

    }

    public void initController(Context context) {
        this.context = context;
    }

    public void playSound(TypeSound typeSound) {
        switch (typeSound) {
            case CSKA_SOUND:
                playingSoundCska();
                break;
            case PENALTI_SOUND:
                playingSoundPenalti();
                break;
            case GAZEEV_SOUND:
                playingSoundGazeev();
                break;
            case PASHA_SOUND:
                playingSoundPasha();
                break;
            case DAYS_SOUND:
                playingSoundDays();
                break;
        }
    }

    private void playingSoundCska() {
        if (mediaPlayerCska == null) {
            mediaPlayerCska = MediaPlayer.create(context, R.raw.feduk_cska);
            mediaPlayerCska.setLooping(true);
            mediaPlayerCska.start();
        } else {
            mediaPlayerCska.stop();
            mediaPlayerCska.reset();
            mediaPlayerCska.release();
            mediaPlayerCska = null;
        }
    }

    private void playingSoundPenalti() {
        if (mediaPlayerPenalti == null) {
            mediaPlayerPenalti = MediaPlayer.create(context, R.raw.this_penalti);
            mediaPlayerPenalti.setLooping(true);
            mediaPlayerPenalti.start();
        } else {
            mediaPlayerPenalti.stop();
            mediaPlayerPenalti.reset();
            mediaPlayerPenalti.release();
            mediaPlayerPenalti = null;
        }
    }

    private void playingSoundGazeev() {
        if (mediaPlayerGazeev == null) {
            mediaPlayerGazeev = MediaPlayer.create(context, R.raw.gazzaev_ebalniki);
            mediaPlayerGazeev.setLooping(true);
            mediaPlayerGazeev.start();
        } else {
            mediaPlayerGazeev.stop();
            mediaPlayerGazeev.reset();
            mediaPlayerGazeev.release();
            mediaPlayerGazeev = null;
        }
    }

    private void playingSoundPasha() {
        if (mediaPlayerPasha == null) {
            mediaPlayerPasha = MediaPlayer.create(context, R.raw.pasha);
            mediaPlayerPasha.setLooping(true);
            mediaPlayerPasha.start();
        } else {
            mediaPlayerPasha.stop();
            mediaPlayerPasha.reset();
            mediaPlayerPasha.release();
            mediaPlayerPasha = null;
        }
    }

    private void playingSoundDays() {
        if (mediaPlayerDays == null) {
            mediaPlayerDays = MediaPlayer.create(context, R.raw.red_white_days);
            mediaPlayerDays.setLooping(true);
            mediaPlayerDays.start();
        } else {
            mediaPlayerDays.stop();
            mediaPlayerDays.reset();
            mediaPlayerDays.release();
            mediaPlayerDays = null;
        }
    }

    public void clear() {
        mediaPlayerCska.stop();
        mediaPlayerCska.release();
        mediaPlayerCska = null;
        mediaPlayerPenalti.stop();
        mediaPlayerPenalti.release();
        mediaPlayerPenalti = null;
        mediaPlayerGazeev.stop();
        mediaPlayerGazeev.release();
        mediaPlayerGazeev = null;
        mediaPlayerPasha.stop();
        mediaPlayerPasha.release();
        mediaPlayerPasha = null;
        mediaPlayerDays.stop();
        mediaPlayerDays.release();
        mediaPlayerDays = null;
    }
}
