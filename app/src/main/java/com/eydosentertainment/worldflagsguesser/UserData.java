package com.eydosentertainment.worldflagsguesser;

import android.content.Context;
import android.content.SharedPreferences;

import com.google.gson.Gson;

public class UserData {

    private int highScore;
    private int timeHighScore;
    private int currentScore;
    private int numberOfCountriesChosen;
    private int currentTime;

    public int getNumberOfCountriesChosen()
    {
        return numberOfCountriesChosen;
    }
    public void setNumberOfCountriesChosen(int numberOfCountriesChosen)
    {
        this.numberOfCountriesChosen = numberOfCountriesChosen;
    }

    public void setCurrentScore(int currentScore)
    {
        this.currentScore = currentScore;
        if(this.currentScore > this.highScore)
        {
            this.highScore = this.currentScore;
        }
    }

    public int getCurrentScore()
    {
        return currentScore;
    }

    public int getHighScore() {
        return highScore;
    }

    public int getCurrentTime() {
        return currentTime;
    }

    public void setCurrentTime(int currentTime) {
        this.currentTime = currentTime;
        if(this.currentTime > this.timeHighScore)
        {
            this.timeHighScore = this.currentTime;
        }
    }
}
