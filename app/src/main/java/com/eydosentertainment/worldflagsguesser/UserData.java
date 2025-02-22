package com.eydosentertainment.worldflagsguesser;

import android.content.Context;
import android.content.SharedPreferences;

import com.google.gson.Gson;

public class UserData {
    private int highScore;
    private int currentScore;
    private int numberOfCountriesChosen;

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
        System.out.println("The current score inside User is " + this.currentScore);
    }

    public int getCurrentScore()
    {
        return currentScore;
    }
}
