package com.erdemtsynduev.vgikgagsbutton.screen.main;

import android.graphics.Color;

import com.erdemtsynduev.vgikgagsbutton.BasePresenter;
import com.erdemtsynduev.vgikgagsbutton.BaseView;

public interface MainContract {

    interface View extends BaseView<MainContract.Presenter> {

        void showPressButton(String text, Color color);

    }

    interface Presenter extends BasePresenter {

        void playSound (TypeSound typeSound);

    }
}
