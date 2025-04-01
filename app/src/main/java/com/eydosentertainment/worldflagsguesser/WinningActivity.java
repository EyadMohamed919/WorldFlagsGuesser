package com.eydosentertainment.worldflagsguesser;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class WinningActivity extends AppCompatActivity{

    private TextView scorePercentText;
    private TextView scoreText;
    private Button playAgainButton;
    private Button homeButton;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_winning);
        assignViews();
        System.out.println("Inside the Winning Activity");
        DataStorage data = new DataStorage(this);
        UserData user = data.getUserData();

        scoreText.setText(user.getCurrentScore() + "/" + (user.getNumberOfCountriesChosen()));
        int score = (int) ((user.getCurrentScore()*1.0/user.getNumberOfCountriesChosen()) * 100);
        scorePercentText.setText(score + "%");

        playAgainButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WinningActivity.this, GuessingActivity.class);
                startActivity(intent);
                finish();
                return;
            }
        });

        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WinningActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
                return;
            }
        });

    }

    public void assignViews()
    {
        scorePercentText = findViewById(R.id.ScorePercentage);
        scoreText = findViewById(R.id.ScoreOutOf);
        playAgainButton = findViewById(R.id.PlayAgainButton);
        homeButton = findViewById(R.id.HomeButton);
    }
}
