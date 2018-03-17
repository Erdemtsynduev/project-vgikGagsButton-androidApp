package com.erdemtsynduev.vgikgagsbutton.screen.main;

import com.erdemtsynduev.vgikgagsbutton.BasePresenter;
import com.erdemtsynduev.vgikgagsbutton.BaseView;

public interface MainContract {

    interface View extends BaseView<MainContract.Presenter> {

        void setSelectedButton();

    }

    interface Presenter extends BasePresenter {

        void playSound(TypeSound typeSound);

        void pauseAllSound();

        void resumeAllSound();

    }
}
