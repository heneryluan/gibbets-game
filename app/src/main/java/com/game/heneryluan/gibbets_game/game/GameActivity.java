package com.game.heneryluan.gibbets_game.game;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.game.heneryluan.gibbets_game.R;
import com.game.heneryluan.gibbets_game.mvp.GameMVP;
import com.game.heneryluan.gibbets_game.mvp.HomeMVP;

/**
 * GameActivity class view
 *
 * @author heneryluan
 */
public class GameActivity extends AppCompatActivity implements GameMVP.ViewImpl {

    private TextView gameText;

    private GameMVP.PresenterImpl presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        presenter = new GamePresenter(this);
        presenter.onCreate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void bindAllViews() {
        gameText = findViewById(R.id.game_text);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setGameText(String keyword) {
        gameText.setText(keyword);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getKeywordFromIntent() {
        return getIntent().getExtras().getString(HomeMVP.ViewImpl.KEYWORD_KEY, "none");
    }
}
