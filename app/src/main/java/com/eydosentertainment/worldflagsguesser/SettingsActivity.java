package com.eydosentertainment.worldflagsguesser;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class SettingsActivity extends AppCompatActivity {

    private RadioButton fourFlagsButton;
    private RadioButton tenFlagsButton;
    private FloatingActionButton settingsReturn;
    private int numbersOfCountriesChosen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
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

        switch (user.getNumberOfCountriesChosen())
        {
            case 4: fourFlagsButton.setChecked(true);
            case 10: tenFlagsButton.setChecked(true);
        }

        settingsReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(fourFlagsButton.isChecked() == true)
                {
                    numbersOfCountriesChosen = 4;
                }
                else if(tenFlagsButton.isChecked() == true) {
                    numbersOfCountriesChosen = 10;
                }
                else {
                    numbersOfCountriesChosen = 4;
                }


                user.setNumberOfCountriesChosen(numbersOfCountriesChosen);
                data.setUserData(user);

                Intent intent = new Intent(SettingsActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });


    }

    public void assignViews(){
        fourFlagsButton = findViewById(R.id.FourRadioBtn);
        tenFlagsButton = findViewById(R.id.TenRadioBtn);
        settingsReturn = findViewById(R.id.SettingsReturn);
    }
}