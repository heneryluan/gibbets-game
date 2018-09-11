package com.game.heneryluan.gibbets_game.mvp;

/**
 * Interface contract for HomeMVP
 *
 * @author heneryluan
 */
public interface HomeMVP {

    /**
     * Interface contract for HomePresenter
     */
    interface PresenterImpl {
        /**
         * Sets onCreate event method on presenter
         */
        void onCreate();

        /**
         * Sets onHomeButtonClicked event method on presenter
         */
        void onHomePlayButtonClicked();
    }

    /**
     * Interface contract for HomeActivity
     */
    interface ViewImpl {

        String KEYWORD_KEY = "keyword";

        /**
         * Notifies to bind all views
         */
        void bindAllViews();

        /**
         * Notifies to set all listeners
         */
        void setAllListeners();

        /**
         * Notifies to start the game activity
         */
        void startGameActivity();
    }

}
