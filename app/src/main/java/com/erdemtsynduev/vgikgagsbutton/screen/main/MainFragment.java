package com.erdemtsynduev.vgikgagsbutton.screen.main;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.erdemtsynduev.vgikgagsbutton.R;

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
        mPresenter.playSound(TypeSound.CSKA_SOUND, getContext());
    }

    @OnClick(R.id.btn_penalti)
    public void clickPenlti() {
        mPresenter.playSound(TypeSound.PENALTI_SOUND, getContext());
    }

    @OnClick(R.id.btn_shut_up)
    public void clickShutUp() {
        mPresenter.playSound(TypeSound.GAZEEV_SOUND, getContext());
    }

    @OnClick(R.id.btn_pasha)
    public void clickPasha() {
        mPresenter.playSound(TypeSound.PASHA_SOUND, getContext());
    }

    @OnClick(R.id.btn_redWhite_days)
    public void clickRedWhiteDays() {
        mPresenter.playSound(TypeSound.DAYS_SOUND, getContext());
    }

    @Override
    public void showPressButton(String text, Color color) {

    }
}