package com.eydosentertainment.worldflagsguesser;

import static androidx.core.content.ContentProviderCompat.requireContext;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.lang.Math;
import java.util.ArrayList;

public class CountryRetriever {

    private String[] countriesNamesArray = {
            "Afghanistan",
            "Albania",
            "Algeria",
            "Andorra",
            "Angola",
            "Antigua and Barbuda",
            "Argentina",
            "Armenia",
            "Australia",
            "Austria",
            "Azerbaijan",
            "Bahamas",
            "Bahrain",
            "Bangladesh",
            "Barbados",
            "Belarus",
            "Belgium",
            "Belize",
            "Benin",
            "Bhutan",
            "Bolivia",
            "Bosnia and Herzegovina",
            "Botswana",
            "Brazil",
            "Brunei",
            "Bulgaria",
            "Burkina Faso",
            "Burundi",
            "Cambodia",
            "Cameroon",
            "Canada",
            "Cape Verde",
            "Central African Republic",
            "Chad",
            "Chile",
            "China",
            "Colombia",
            "Comoros",
            "DR Congo",
            "Congo",
            "Costa Rica",
            "Croatia",
            "Cuba",
            "Cyprus",
            "Czech Republic",
            "Denmark",
            "Djibouti",
            "Dominica",
            "Dominican Republic",
            "Ecuador",
            "Egypt",
            "El Salvador",
            "Equatorial Guinea",
            "Eritrea",
            "Estonia",
            "Eswatini",
            "Ethiopia",
            "Fiji",
            "Finland",
            "France",
            "Gabon",
            "Gambia",
            "Georgia",
            "Germany",
            "Ghana",
            "Greece",
            "Grenada",
            "Guatemala",
            "Guinea",
            "Guinea Bissau",
            "Guyana",
            "Haiti",
            "Honduras",
            "Hungary",
            "Iceland",
            "India",
            "Indonesia",
            "Iran",
            "Iraq",
            "Ireland",
            "Italy",
            "Côte d'Ivoire",
            "Jamaica",
            "Japan",
            "Jordan",
            "Kazakhstan",
            "Kenya",
            "Kiribati",
            "Kuwait",
            "Kyrgyzstan",
            "Laos",
            "Latvia",
            "Lebanon",
            "Lesotho",
            "Liberia",
            "Libya",
            "Liechtenstein",
            "Lithuania",
            "Luxembourg",
            "Madagascar",
            "Malawi",
            "Malaysia",
            "Maldives",
            "Mali",
            "Malta",
            "Marshall Islands",
            "Mauritania",
            "Mauritius",
            "Mexico",
            "Micronesia",
            "Moldova",
            "Monaco",
            "Mongolia",
            "Montenegro",
            "Morocco",
            "Mozambique",
            "Myanmar",
            "Namibia",
            "Nauru",
            "Nepal",
            "Netherlands",
            "New Zealand",
            "Nicaragua",
            "Niger",
            "Nigeria",
            "North Korea",
            "North Macedonia",
            "Norway",
            "Oman",
            "Pakistan",
            "Palau",
            "Palestine",
            "Panama",
            "Papua New Guinea",
            "Paraguay",
            "Peru",
            "Philippines",
            "Poland",
            "Portugal",
            "Qatar",
            "Romania",
            "Russia",
            "Rwanda",
            "Saint Kitts and Nevis",
            "Saint Lucia",
            "Saint Vincent and the Grenadines",
            "Samoa",
            "San Marino",
            "São Tomé and Príncipe",
            "Saudi Arabia",
            "Senegal",
            "Serbia",
            "Seychelles",
            "Sierra Leone",
            "Singapore",
            "Slovakia",
            "Slovenia",
            "Solomon Islands",
            "Somalia",
            "South Africa",
            "South Korea",
            "South Sudan",
            "Spain",
            "Sri Lanka",
            "Sudan",
            "Suriname",
            "Sweden",
            "Switzerland",
            "Syria",
            "Tajikistan",
            "Tanzania",
            "Thailand",
            "East Timor",
            "Togo",
            "Tonga",
            "Trinidad and Tobago",
            "Tunisia",
            "Turkey",
            "Turkmenistan",
            "Tuvalu",
            "Uganda",
            "Ukraine",
            "United Arab Emirates",
            "United Kingdom",
            "United States of America",
            "Uruguay",
            "Uzbekistan",
            "Vanuatu",
            "Vatican",
            "Venezuela",
            "Vietnam",
            "Yemen",
            "Zambia",
            "Zimbabwe",
            "Kosovo"
    };
    private int[] countriesFlagsArray = {
            R.drawable.afghanistan,
            R.drawable.albania,
            R.drawable.algeria,
            R.drawable.andorra,
            R.drawable.angola,
            R.drawable.antigua_and_barbuda,
            R.drawable.argentina,
            R.drawable.armenia,
            R.drawable.australia,
            R.drawable.austria,
            R.drawable.azerbaijan,
            R.drawable.bahamas,
            R.drawable.bahrain,
            R.drawable.bangladesh,
            R.drawable.barbados,
            R.drawable.belarus,
            R.drawable.belgium,
            R.drawable.belize,
            R.drawable.benin,
            R.drawable.bhutan,
            R.drawable.bolivia,
            R.drawable.bosnia_and_herzegovina,
            R.drawable.botswana,
            R.drawable.brazil,
            R.drawable.brunei,
            R.drawable.bulgaria,
            R.drawable.burkina_faso,
            R.drawable.burundi,
            R.drawable.cambodia,
            R.drawable.cameroon,
            R.drawable.canada,
            R.drawable.cape_verde,
            R.drawable.central_african_republic,
            R.drawable.chad,
            R.drawable.chile,
            R.drawable.china,
            R.drawable.colombia,
            R.drawable.comoros,
            R.drawable.dr_congo,
            R.drawable.congo,
            R.drawable.costa_rica,
            R.drawable.croatia,
            R.drawable.cuba,
            R.drawable.cyprus,
            R.drawable.czech_republic,
            R.drawable.denmark,
            R.drawable.djibouti,
            R.drawable.dominica,
            R.drawable.dominican_republic,
            R.drawable.ecuador,
            R.drawable.egypt,
            R.drawable.el_salvador,
            R.drawable.equatorial_guinea,
            R.drawable.eritrea,
            R.drawable.estonia,
            R.drawable.eswatini,
            R.drawable.ethiopia,
            R.drawable.fiji,
            R.drawable.finland,
            R.drawable.france,
            R.drawable.gabon,
            R.drawable.gambia,
            R.drawable.georgia,
            R.drawable.germany,
            R.drawable.ghana,
            R.drawable.greece,
            R.drawable.grenada,
            R.drawable.guatemala,
            R.drawable.guinea,
            R.drawable.guinea_bissau,
            R.drawable.guyana,
            R.drawable.haiti,
            R.drawable.honduras,
            R.drawable.hungary,
            R.drawable.iceland,
            R.drawable.india,
            R.drawable.indonesia,
            R.drawable.iran,
            R.drawable.iraq,
            R.drawable.ireland,
            R.drawable.italy,
            R.drawable.cote_divoire,
            R.drawable.jamaica,
            R.drawable.japan,
            R.drawable.jordan,
            R.drawable.kazakhstan,
            R.drawable.kenya,
            R.drawable.kiribati,
            R.drawable.kuwait,
            R.drawable.kyrgyzstan,
            R.drawable.laos,
            R.drawable.latvia,
            R.drawable.lebanon,
            R.drawable.lesotho,
            R.drawable.liberia,
            R.drawable.libya,
            R.drawable.liechtenstein,
            R.drawable.lithuania,
            R.drawable.luxembourg,
            R.drawable.madagascar,
            R.drawable.malawi,
            R.drawable.malaysia,
            R.drawable.maldives,
            R.drawable.mali,
            R.drawable.malta,
            R.drawable.marshall_islands,
            R.drawable.mauritania,
            R.drawable.mauritius,
            R.drawable.mexico,
            R.drawable.micronesia,
            R.drawable.moldova,
            R.drawable.monaco,
            R.drawable.mongolia,
            R.drawable.montenegro,
            R.drawable.morocco,
            R.drawable.mozambique,
            R.drawable.myanmar,
            R.drawable.namibia,
            R.drawable.nauru,
            R.drawable.nepal,
            R.drawable.netherlands,
            R.drawable.new_zealand,
            R.drawable.nicaragua,
            R.drawable.niger,
            R.drawable.nigeria,
            R.drawable.north_korea,
            R.drawable.north_macedonia,
            R.drawable.norway,
            R.drawable.oman,
            R.drawable.pakistan,
            R.drawable.palau,
            R.drawable.palestine,
            R.drawable.panama,
            R.drawable.papua_new_guinea,
            R.drawable.paraguay,
            R.drawable.peru,
            R.drawable.philippines,
            R.drawable.poland,
            R.drawable.portugal,
            R.drawable.qatar,
            R.drawable.romania,
            R.drawable.russia,
            R.drawable.rwanda,
            R.drawable.saint_kitts_and_nevis,
            R.drawable.saint_lucia,
            R.drawable.saint_vincent_and_the_grenadines,
            R.drawable.samoa,
            R.drawable.san_marino,
            R.drawable.sao_tome_and_principe,
            R.drawable.saudi_arabia,
            R.drawable.senegal,
            R.drawable.serbia,
            R.drawable.seychelles,
            R.drawable.sierra_leone,
            R.drawable.singapore,
            R.drawable.slovakia,
            R.drawable.slovenia,
            R.drawable.solomon_islands,
            R.drawable.somalia,
            R.drawable.south_africa,
            R.drawable.south_korea,
            R.drawable.south_sudan,
            R.drawable.spain,
            R.drawable.sri_lanka,
            R.drawable.sudan,
            R.drawable.suriname,
            R.drawable.sweden,
            R.drawable.switzerland,
            R.drawable.syria,
            R.drawable.tajikistan,
            R.drawable.tanzania,
            R.drawable.thailand,
            R.drawable.east_timor,
            R.drawable.togo,
            R.drawable.tonga,
            R.drawable.trinidad_and_tobago,
            R.drawable.tunisia,
            R.drawable.turkey,
            R.drawable.turkmenistan,
            R.drawable.tuvalu,
            R.drawable.uganda,
            R.drawable.ukraine,
            R.drawable.united_arab_emirates,
            R.drawable.united_kingdom,
            R.drawable.united_states_of_america,
            R.drawable.uruguay,
            R.drawable.uzbekistan,
            R.drawable.vanuatu,
            R.drawable.vatican,
            R.drawable.venezuela,
            R.drawable.vietnam,
            R.drawable.yemen,
            R.drawable.zambia,
            R.drawable.zimbabwe,
            R.drawable.kosovo,
    };


    private ArrayList<String> tempCountriesNames = new ArrayList<String>();
    private ArrayList<Integer> tempCountriesFlags = new ArrayList<Integer>();
    private boolean isButtonPressed = false; // check is the user didnt press any button before

    private int correctCountries;

    public CountryRetriever()
    {
        System.out.println("Number of Countries: " + countriesNamesArray.length);
        System.out.println("Number of Flags: " + countriesFlagsArray.length);

        correctCountries = 0;

        for(int i = 0; i < countriesNamesArray.length; i++)
        {
            tempCountriesNames.add(countriesNamesArray[i]);
        }

        for(int i = 0; i < countriesFlagsArray.length; i++)
        {
            tempCountriesFlags.add(countriesFlagsArray[i]);
        }
    }

    public boolean getIsButtonPressed()
    {
        return isButtonPressed;
    }

    public int getCorrectCountries()
    {
        return correctCountries;
    }

    public void randomCountry(Button btn1, Button btn2, Button btn3, Button btn4, Button nextBtn,ImageView img)
    {
        int correctRandomFlag = (int) (Math.random() * tempCountriesFlags.size()); // get a random flag as the correct choice
        String correctCountryName = tempCountriesNames.get(correctRandomFlag); // get the correct country name of the flag choosen randomly for the correct choice
        img.setImageResource(tempCountriesFlags.get(correctRandomFlag)); // set the image to be the correct flag
        int randomIncorrectFlag = 0;
        int randomButton = (int) (Math.random() * 4); // choose a random button for the correct choice

        tempCountriesNames.remove(correctRandomFlag); // To make sure flags dont get repeated
        tempCountriesFlags.remove(correctRandomFlag);

        isButtonPressed = false; // restoring it to the default value


        switch (randomButton){
            case 0:
                btn1.setText(correctCountryName); // Correct Button
                if(correctCountryName.length() > 13) // decrease text size if the word is long
                {
                    btn1.setTextSize(22);
                }

                randomIncorrectFlag = (int) (Math.random() * tempCountriesFlags.size());
                btn2.setText(tempCountriesNames.get(randomIncorrectFlag)); // Incorrect Button
                if(btn2.getText().length() > 13) // decrease text size if the word is long
                {
                    btn2.setTextSize(22);
                }

                randomIncorrectFlag = (int) (Math.random() * tempCountriesFlags.size());
                btn3.setText(tempCountriesNames.get(randomIncorrectFlag)); // Incorrect Button
                if(btn3.getText().length() > 13) // decrease text size if the word is long
                {
                    btn3.setTextSize(22);
                }

                randomIncorrectFlag = (int) (Math.random() * tempCountriesFlags.size());
                btn4.setText(tempCountriesNames.get(randomIncorrectFlag)); // Incorrect Button
                if(btn4.getText().length() > 13) // decrease text size if the word is long
                {
                    btn4.setTextSize(22);
                }
                break;


            case 1:
                randomIncorrectFlag = (int) (Math.random() * tempCountriesFlags.size());
                btn1.setText(tempCountriesNames.get(randomIncorrectFlag)); // Incorrect Button
                if(btn1.getText().length() > 13) // decrease text size if the word is long
                {
                    btn1.setTextSize(22);
                }

                btn2.setText(correctCountryName); // Correct Button
                if(correctCountryName.length() > 13) // decrease text size if the word is long
                {
                    btn2.setTextSize(22);
                }

                randomIncorrectFlag = (int) (Math.random() * tempCountriesFlags.size());
                btn3.setText(tempCountriesNames.get(randomIncorrectFlag)); // Incorrect Button
                if(btn3.getText().length() > 13) // decrease text size if the word is long
                {
                    btn3.setTextSize(22);
                }

                randomIncorrectFlag = (int) (Math.random() * tempCountriesFlags.size());
                btn4.setText(tempCountriesNames.get(randomIncorrectFlag)); // Incorrect Button
                if(btn4.getText().length() > 13) // decrease text size if the word is long
                {
                    btn4.setTextSize(22);
                }
                break;

            case 2:

                randomIncorrectFlag = (int) (Math.random() * tempCountriesFlags.size());
                btn1.setText(tempCountriesNames.get(randomIncorrectFlag)); // Incorrect Button
                if(btn1.getText().length() > 13) // decrease text size if the word is long
                {
                    btn1.setTextSize(22);
                }

                randomIncorrectFlag = (int) (Math.random() * tempCountriesFlags.size());
                btn2.setText(tempCountriesNames.get(randomIncorrectFlag)); // Incorrect Button
                if(btn2.getText().length() > 13) // decrease text size if the word is long
                {
                    btn2.setTextSize(22);
                }


                btn3.setText(correctCountryName); // Correct Button
                if(correctCountryName.length() > 13) // decrease text size if the word is long
                {
                    btn3.setTextSize(22);
                }

                randomIncorrectFlag = (int) (Math.random() * tempCountriesFlags.size());
                btn4.setText(tempCountriesNames.get(randomIncorrectFlag)); // Incorrect Button
                if(btn4.getText().length() > 13) // decrease text size if the word is long
                {
                    btn4.setTextSize(22);
                }

                break;


            case 3:

                randomIncorrectFlag = (int) (Math.random() * tempCountriesFlags.size());
                btn1.setText(tempCountriesNames.get(randomIncorrectFlag)); // Incorrect Button
                if(btn1.getText().length() > 13) // decrease text size if the word is long
                {
                    btn1.setTextSize(22);
                }

                randomIncorrectFlag = (int) (Math.random() * tempCountriesFlags.size());
                btn2.setText(tempCountriesNames.get(randomIncorrectFlag)); // Incorrect Button
                if(btn2.getText().length() > 13) // decrease text size if the word is long
                {
                    btn2.setTextSize(22);
                }

                randomIncorrectFlag = (int) (Math.random() * tempCountriesFlags.size());
                btn3.setText(tempCountriesNames.get(randomIncorrectFlag)); // Incorrect Button
                if(btn3.getText().length() > 13) // decrease text size if the word is long
                {
                    btn3.setTextSize(22);
                }

                btn4.setText(correctCountryName); // Correct Button
                if(correctCountryName.length() > 13) // decrease text size if the word is long
                {
                    btn4.setTextSize(22);
                }
                break;


            default:
                btn1.setText(correctCountryName); // Correct Button
                if(correctCountryName.length() > 13) // decrease text size if the word is long
                {
                    btn1.setTextSize(22);
                }

                randomIncorrectFlag = (int) (Math.random() * tempCountriesFlags.size());
                btn2.setText(tempCountriesNames.get(randomIncorrectFlag)); // Incorrect Button
                if(btn2.getText().length() > 13) // decrease text size if the word is long
                {
                    btn2.setTextSize(22);
                }

                randomIncorrectFlag = (int) (Math.random() * tempCountriesFlags.size());
                btn3.setText(tempCountriesNames.get(randomIncorrectFlag)); // Incorrect Button
                if(btn3.getText().length() > 13) // decrease text size if the word is long
                {
                    btn3.setTextSize(22);
                }

                randomIncorrectFlag = (int) (Math.random() * tempCountriesFlags.size());
                btn4.setText(tempCountriesNames.get(randomIncorrectFlag)); // Incorrect Button
                if(btn4.getText().length() > 13) // decrease text size if the word is long
                {
                    btn4.setTextSize(22);
                }
                break;

        }

//        Check if the user clicked
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isButtonPressed)
                {
                    if(btn1.getText().equals(correctCountryName))
                    {
                        correctCountries++;
                        // Change correct button to green
                        btn1.setBackgroundResource(R.drawable.next_button_enabled_background);
                        // change other buttons to disabled
                        btn2.setBackgroundResource(R.drawable.normal_button_disabled_background);
                        btn3.setBackgroundResource(R.drawable.normal_button_disabled_background);
                        btn4.setBackgroundResource(R.drawable.normal_button_disabled_background);
                        // Set the next button to enabled
                        nextBtn.setBackgroundResource(R.drawable.next_button_enabled_background);
                        isButtonPressed = true;
                    }
                    else // if the button pressed it wrong, turn the button red
                    {
                        // Change pressed button to red
                        btn1.setBackgroundResource(R.drawable.normal_button_incorrect_background);

                        // change other buttons to disabled
                        btn2.setBackgroundResource(R.drawable.normal_button_disabled_background);
                        btn3.setBackgroundResource(R.drawable.normal_button_disabled_background);
                        btn4.setBackgroundResource(R.drawable.normal_button_disabled_background);

                        // Set the next button to enabled
                        nextBtn.setBackgroundResource(R.drawable.next_button_enabled_background);

                        isButtonPressed = true;
                    }
                }
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isButtonPressed)
                {
                    if(btn2.getText().equals(correctCountryName))
                    {
                        correctCountries++;
                        btn2.setBackgroundResource(R.drawable.next_button_enabled_background);

                        // change other buttons to disabled
                        btn1.setBackgroundResource(R.drawable.normal_button_disabled_background);
                        btn3.setBackgroundResource(R.drawable.normal_button_disabled_background);
                        btn4.setBackgroundResource(R.drawable.normal_button_disabled_background);

                        // Set the next button to enabled
                        nextBtn.setBackgroundResource(R.drawable.next_button_enabled_background);
                        isButtonPressed = true;
                    }
                    else // if the button pressed it wrong, turn the button red
                    {
                        // Change pressed button to red
                        btn2.setBackgroundResource(R.drawable.normal_button_incorrect_background);

                        // change other buttons to disabled
                        btn1.setBackgroundResource(R.drawable.normal_button_disabled_background);
                        btn3.setBackgroundResource(R.drawable.normal_button_disabled_background);
                        btn4.setBackgroundResource(R.drawable.normal_button_disabled_background);

                        // Set the next button to enabled
                        nextBtn.setBackgroundResource(R.drawable.next_button_enabled_background);

                        isButtonPressed = true;
                    }
                }
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isButtonPressed)
                {
                    if(btn3.getText().equals(correctCountryName))
                    {
                        correctCountries++;
                        btn3.setBackgroundResource(R.drawable.next_button_enabled_background);

                        btn1.setBackgroundResource(R.drawable.normal_button_disabled_background);
                        btn2.setBackgroundResource(R.drawable.normal_button_disabled_background);
                        btn4.setBackgroundResource(R.drawable.normal_button_disabled_background);

                        // Set the next button to enabled
                        nextBtn.setBackgroundResource(R.drawable.next_button_enabled_background);
                        isButtonPressed = true;
                    }
                    else // if the button pressed it wrong, turn the button red
                    {
                        // Change pressed button to red
                        btn3.setBackgroundResource(R.drawable.normal_button_incorrect_background);

                        btn1.setBackgroundResource(R.drawable.normal_button_disabled_background);
                        btn2.setBackgroundResource(R.drawable.normal_button_disabled_background);
                        btn4.setBackgroundResource(R.drawable.normal_button_disabled_background);

                        // Set the next button to enabled
                        nextBtn.setBackgroundResource(R.drawable.next_button_enabled_background);

                        isButtonPressed = true;
                    }
                }
            }

        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isButtonPressed)
                {
                    if(btn4.getText().equals(correctCountryName))
                    {
                        correctCountries++;
                        btn4.setBackgroundResource(R.drawable.next_button_enabled_background);

                        btn1.setBackgroundResource(R.drawable.normal_button_disabled_background);
                        btn2.setBackgroundResource(R.drawable.normal_button_disabled_background);
                        btn3.setBackgroundResource(R.drawable.normal_button_disabled_background);

                        // Set the next button to enabled
                        nextBtn.setBackgroundResource(R.drawable.next_button_enabled_background);

                        isButtonPressed = true;
                    }
                    else // if the button pressed it wrong, turn the button red
                    {
                        // Change pressed button to red
                        btn4.setBackgroundResource(R.drawable.normal_button_incorrect_background);

                        btn1.setBackgroundResource(R.drawable.normal_button_disabled_background);
                        btn2.setBackgroundResource(R.drawable.normal_button_disabled_background);
                        btn3.setBackgroundResource(R.drawable.normal_button_disabled_background);

                        // Set the next button to enabled
                        nextBtn.setBackgroundResource(R.drawable.next_button_enabled_background);

                        isButtonPressed = true;
                    }
                }
            }
        });
    }
}
