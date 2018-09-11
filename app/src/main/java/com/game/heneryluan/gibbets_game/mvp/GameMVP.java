package com.game.heneryluan.gibbets_game.mvp;

/**
 * Interface contract for GameMVP
 *
 * @author heneryluan
 */
public interface GameMVP {
    /**
     * Interface contract for GamePresenter
     */
    interface PresenterImpl {
        /**
         * Sets onCreate event method on presenter
         */
        void onCreate();
    }

    /**
     * Interface contract for HomeActivity
     */
    interface ViewImpl {
        /**
         * Notifies to bind all views
         */
        void bindAllViews();

        /**
         * Notifies to set game text
         *
         * @param keyword
         */
        void setGameText(String keyword);

        /**
         * Gets keyord from intent extra
         *
         * @return keyword
         */
        String getKeywordFromIntent();
    }
}
