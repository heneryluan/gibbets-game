package com.game.heneryluan.gibbets_game.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.game.heneryluan.gibbets_game.R;
import com.game.heneryluan.gibbets_game.interfaces.IHomePresenter;
import com.game.heneryluan.gibbets_game.interfaces.IHomeView;
import com.game.heneryluan.gibbets_game.presenter.HomePresenter;

/**
 * HomeActivity class view
 *
 * @author heneryluan
 */
public class HomeActivity extends AppCompatActivity implements IHomeView, View.OnClickListener {

    private EditText editText;
    private Button button;

    private IHomePresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        presenter = new HomePresenter(this);
        presenter.onCreate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void bindAllViews() {
        editText = findViewById(R.id.home_edit_text);
        button = findViewById(R.id.home_button);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setAllListeners() {
        button.setOnClickListener(this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void startGameActivity() {
        //TODO: implement start activity
        Toast.makeText(this, "BUTTON PRESSED", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.home_button:
                presenter.onHomeButtonClicked();
                break;
        }
    }
}
