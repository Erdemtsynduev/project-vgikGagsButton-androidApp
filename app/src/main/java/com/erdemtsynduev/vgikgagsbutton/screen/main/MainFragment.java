package com.erdemtsynduev.vgikgagsbutton.screen.main;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.erdemtsynduev.vgikgagsbutton.R;
import com.erdemtsynduev.vgikgagsbutton.controller.SoundController;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

import static com.erdemtsynduev.vgikgagsbutton.utils.Utils.checkNotNull;

public class MainFragment extends Fragment implements MainContract.View {

    @BindView(R.id.btn_cska)
    Button mCskaButton;

    @BindView(R.id.btn_penalti)
    Button mPenaltyButton;

    @BindView(R.id.btn_shut_up)
    Button mShutUpButton;

    @BindView(R.id.btn_pasha)
    Button mPashaButton;

    @BindView(R.id.btn_redWhite_days)
    Button mRedWhitesDaysButton;

    private SoundController soundController;
    private MainContract.Presenter mPresenter;
    private Unbinder unbinder;

    @NonNull
    public static MainFragment newInstance() {
        return new MainFragment();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onResume() {
        super.onResume();
        mPresenter.start();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);
        unbinder = ButterKnife.bind(this, view);
        soundController = SoundController.getInstance();
        return view;
    }


    @Override
    public void setPresenter(@NonNull MainContract.Presenter presenter) {
        mPresenter = checkNotNull(presenter);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }

    @OnClick(R.id.btn_cska)
    public void clickCska() {
        mPresenter.playSound(TypeSound.CSKA_SOUND);
    }

    @OnClick(R.id.btn_penalti)
    public void clickPenalti() {
        mPresenter.playSound(TypeSound.PENALTI_SOUND);
    }

    @OnClick(R.id.btn_shut_up)
    public void clickShutUp() {
        mPresenter.playSound(TypeSound.GAZEEV_SOUND);
    }

    @OnClick(R.id.btn_pasha)
    public void clickPasha() {
        mPresenter.playSound(TypeSound.PASHA_SOUND);
    }

    @OnClick(R.id.btn_redWhite_days)
    public void clickRedWhiteDays() {
        mPresenter.playSound(TypeSound.DAYS_SOUND);
    }

    @Override
    public void setSelectedButton() {
        if (soundController.getMediaPlayerCska() != null) {
            mCskaButton.setSelected(true);
        } else {
            mCskaButton.setSelected(false);
        }
        if (soundController.getMediaPlayerPenalti() != null) {
            mPenaltyButton.setSelected(true);
        } else {
            mPenaltyButton.setSelected(false);
        }
        if (soundController.getMediaPlayerGazeev() != null) {
            mShutUpButton.setSelected(true);
        } else {
            mShutUpButton.setSelected(false);
        }
        if (soundController.getMediaPlayerPasha() != null) {
            mPashaButton.setSelected(true);
        } else {
            mPashaButton.setSelected(false);
        }
        if (soundController.getMediaPlayerDays() != null) {
            mRedWhitesDaysButton.setSelected(true);
        } else {
            mRedWhitesDaysButton.setSelected(false);
        }
    }
}