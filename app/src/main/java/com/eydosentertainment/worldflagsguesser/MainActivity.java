package com.eydosentertainment.worldflagsguesser;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    private ImageButton playButton;
    private FloatingActionButton settingsButton;
    private TextView highscoreText;
    private ImageButton timeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        assignViews();

        UserData user;
        DataStorage data = new DataStorage(this);
        if(data.getUserData() == null)
        {
            user = new UserData();
        }
        else
        {
            user = data.getUserData();
        }

        highscoreText.setText("Highscore: " + user.getHighScore());


        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, GuessingActivity.class);
                startActivity(intent);
            }
        });


        settingsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SettingsActivity.class);
                startActivity(intent);
            }
        });

        timeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TimeAttack.class);
                startActivity(intent);
            }
        });

    }

    public void assignViews(){
        playButton = findViewById(R.id.PlayBtn);
        settingsButton = findViewById(R.id.SettingsButton);
        highscoreText = findViewById(R.id.HighScoreText);
        timeButton = findViewById(R.id.TimeBtn);
    }
}