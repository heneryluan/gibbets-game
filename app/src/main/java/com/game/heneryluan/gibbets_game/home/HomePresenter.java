package com.game.heneryluan.gibbets_game.home;

import com.game.heneryluan.gibbets_game.mvp.HomeMVP;

/**
 * HomePresenter class presenter
 *
 * @author heneryluan
 */
public class HomePresenter implements HomeMVP.PresenterImpl {

    private HomeMVP.ViewImpl view;

    /**
     * HomePresenter constructor method
     *
     * @param view
     */
    public HomePresenter(HomeMVP.ViewImpl view) {
        this.view = view;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void onCreate() {
        view.bindAllViews();
        view.setAllListeners();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void onHomePlayButtonClicked() {
        view.startGameActivity();
    }
}
