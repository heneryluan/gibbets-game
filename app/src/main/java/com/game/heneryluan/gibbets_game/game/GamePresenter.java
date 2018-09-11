package com.game.heneryluan.gibbets_game.game;

import com.game.heneryluan.gibbets_game.mvp.GameMVP;

/**
 * GamePresenter class presenter
 *
 * @author heneryluan
 */
public class GamePresenter implements GameMVP.PresenterImpl {

    private String keyword;

    private GameMVP.ViewImpl view;

    /**
     * GamePresenter constructor method
     *
     * @param view
     */
    public GamePresenter(GameMVP.ViewImpl view) {
        this.view = view;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void onCreate() {
        view.bindAllViews();
        keyword = view.getKeywordFromIntent();
        view.setGameText(keyword);
    }
}
