package com.eydosentertainment.worldflagsguesser;

import android.content.Context;
import android.content.SharedPreferences;

import com.google.gson.Gson;

public class DataStorage {
    private static final String PREFS_NAME = "app_prefs";
    private static final String USER_KEY = "user_key";
    private SharedPreferences sharedPreferences;
    private Gson gson;

    public DataStorage(Context context)
    {
        this.sharedPreferences = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
        this.gson = new Gson();
    }

    public void setUserData(UserData userData)
    {
        String jsonFile = gson.toJson(userData);
        this.sharedPreferences.edit().putString(USER_KEY, jsonFile).apply();
        System.out.println("The current score is now saved inside Data = " + jsonFile);
    }

    public UserData getUserData()
    {
        String jsonFile = this.sharedPreferences.getString(USER_KEY, null);
        if (jsonFile != null) {
            return gson.fromJson(jsonFile, UserData.class);
        }
        return new UserData();
    }


}
