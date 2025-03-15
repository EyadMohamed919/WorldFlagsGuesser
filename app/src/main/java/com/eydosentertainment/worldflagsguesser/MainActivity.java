package com.eydosentertainment.worldflagsguesser;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
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
    private MediaPlayer mediaPlayer;


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

        Intent serviceIntent = new Intent(this, AudioService.class);
        startService(serviceIntent);

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

    protected void onPause() {
        super.onPause();
        Intent pauseIntent = new Intent(this, AudioService.class);
        pauseIntent.setAction("PAUSE");
        startService(pauseIntent);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Intent resumeIntent = new Intent(this, AudioService.class);
        resumeIntent.setAction("RESUME");
        startService(resumeIntent);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            mediaPlayer.release();
        }
    }
}