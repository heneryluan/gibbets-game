package com.game.heneryluan.gibbets_game.presenter;

import com.game.heneryluan.gibbets_game.interfaces.IHomePresenter;
import com.game.heneryluan.gibbets_game.interfaces.IHomeView;

/**
 * HomePresenter class presenter
 *
 * @author heneryluan
 */
public class HomePresenter implements IHomePresenter {

    private IHomeView view;

    /**
     * HomePresenter constructor method
     *
     * @param view
     */
    public HomePresenter(IHomeView view) {
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
    public void onHomeButtonClicked() {
        view.startGameActivity();
    }
}
