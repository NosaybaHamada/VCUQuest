package com.example.vcuquest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.TextView;

public class TenthPage extends AppCompatActivity {

    Button nextPage;
    TextView objectiveText;
    TextView vcuQuestion;
    TextView percentage;
    ProgressBar progress;
    ImageButton mapButton;
    TextView Correct;
    TextView Incorrect;
    CheckBox checkOne, checkTwo, checkThree, checkFour, checkFive, checkSix;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tenth_page);
        nextPage = (Button) findViewById(R.id.nextButton);
        objectiveText = (TextView) findViewById(R.id.objectiveText);
        vcuQuestion = (TextView) findViewById(R.id.vcusign);
        percentage = (TextView) findViewById(R.id.percent);
        progress  = (ProgressBar) findViewById(R.id.progressBar);
        mapButton = (ImageButton) findViewById(R.id.mapButton);
        Correct = (TextView) findViewById(R.id.CorrectText);
        Incorrect = (TextView) findViewById(R.id.IncorrectText);
        checkOne = (CheckBox) findViewById(R.id.correctAnswer1);
        checkTwo = (CheckBox) findViewById(R.id.correctAnswer2);
        checkThree = (CheckBox) findViewById(R.id.correctAnswer3);
        //checkFour = (CheckBox) findViewById(R.id.CheckBox5);
        checkFive = (CheckBox) findViewById(R.id.checkBox2);
        //checkSix = (CheckBox) findViewById(R.id.checkBox6);

        nextPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkTwo.isChecked() && (!checkFive.isChecked()) && (!checkThree.isChecked()) && (!checkOne.isChecked()))
                {
                    String output = "Correct!";
                    Correct.setText(output);
                    Incorrect.setText("");
                    openFinalPage();
                }
                else
                {
                    String output = "Incorrect!";
                    Incorrect.setText(output);
                    Correct.setText("");
                }

            }
        });

        mapButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToMapActivity();

            }
        });
    }
    private void openFinalPage()
    {
        Intent intent = new Intent(this, FinalPage.class);
        startActivity(intent);
    }

    private void goToMapActivity()
    {
        Intent intent = new Intent(this, GoogleMaps.class );
        int num = 10;
        Intent myIntent = new Intent(TenthPage.this, GoogleMaps.class);
        myIntent.putExtra("mapcounter", num);
        startActivity(myIntent);
    }
}
