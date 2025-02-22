package com.eydosentertainment.worldflagsguesser;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class GuessingActivity extends AppCompatActivity{

    private ImageView flagViewer;
    private Button choiceButton1;
    private Button choiceButton2;
    private Button choiceButton3;
    private Button choiceButton4;
    private Button nextButton;

    private TextView progressTextView;

    private int countriesNum = 3; // defines how many countries the user choose to play
    private int countriesDone; // how many countries the user did


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guessing);
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

        countriesNum = user.getNumberOfCountriesChosen();

        CountryRetriever retriever = new CountryRetriever();
        progressTextView.setText(countriesDone + "/" + countriesNum);

        retriever.randomCountry(choiceButton1, choiceButton2, choiceButton3, choiceButton4, nextButton, flagViewer);

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(retriever.getIsButtonPressed() == true)
                {
                    if(countriesDone >= countriesNum-1) // if user finished all the countries, go to score screen
                    {
                        System.out.println("From the Retriever the no is " + retriever.getCorrectCountries());
                        user.setCurrentScore(retriever.getCorrectCountries());
                        data.setUserData(user);

                        System.out.println("Countries Finished!");
                        Intent intent = new Intent(GuessingActivity.this, WinningActivity.class);
                        startActivity(intent);
                        return;
                    }
                    countriesDone++;

                    // update the ProgressView
                    progressTextView.setText(countriesDone + "/" + countriesNum);
                    // restore buttons original text size
                    choiceButton1.setTextSize(30);
                    choiceButton2.setTextSize(30);
                    choiceButton3.setTextSize(30);
                    choiceButton4.setTextSize(30);
                    // restore buttons to original style
                    choiceButton1.setBackgroundResource(R.drawable.normal_button_background);
                    choiceButton2.setBackgroundResource(R.drawable.normal_button_background);
                    choiceButton3.setBackgroundResource(R.drawable.normal_button_background);
                    choiceButton4.setBackgroundResource(R.drawable.normal_button_background);
                    nextButton.setBackgroundResource(R.drawable.next_button_disabled_background);
                    retriever.randomCountry(choiceButton1, choiceButton2, choiceButton3, choiceButton4, nextButton, flagViewer);
                }

            }
        });




    }

    public void assignViews()
    {
        flagViewer = findViewById(R.id.FlagViewer);
        choiceButton1 = findViewById(R.id.ChoiceBtn1);
        choiceButton2 = findViewById(R.id.ChoiceBtn2);
        choiceButton3 = findViewById(R.id.ChoiceBtn3);
        choiceButton4 = findViewById(R.id.ChoiceBtn4);
        nextButton = findViewById(R.id.nextBtn);
        progressTextView = findViewById(R.id.ProgressTextView);
    }
}
