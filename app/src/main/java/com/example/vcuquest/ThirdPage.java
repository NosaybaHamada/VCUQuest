package com.example.vcuquest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.TextView;

public class ThirdPage extends AppCompatActivity {


    Button nextPage;
    Button submit;
    TextView objectiveText;
    TextView vcuQuestion;
    TextView percentage;
    EditText answer;
    ProgressBar progress;
    ImageButton mapButton;
    TextView Correct;
    TextView Incorrect;
    CheckBox checkOne, checkTwo, checkThree, checkFour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_page);

        nextPage = (Button) findViewById(R.id.nextButton);
        objectiveText = (TextView) findViewById(R.id.objectiveText);
        vcuQuestion = (TextView) findViewById(R.id.vcusign);
        percentage = (TextView) findViewById(R.id.percent);
        progress  = (ProgressBar) findViewById(R.id.progressBar);
        mapButton = (ImageButton) findViewById(R.id.mapButton);
        checkOne = (CheckBox) findViewById(R.id.correctCheckOne);
        checkTwo = (CheckBox) findViewById(R.id.correctCheckTwo);
        checkThree = (CheckBox) findViewById(R.id.correctCheckThree);
        checkFour = (CheckBox) findViewById(R.id.correctCheckFour);
        Correct = (TextView) findViewById(R.id.CorrectText);
        Incorrect = (TextView) findViewById(R.id.IncorrectText);

        nextPage.setVisibility(View.VISIBLE);

        nextPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkThree.isChecked() && !checkTwo.isChecked() && !checkOne.isChecked() && !checkFour.isChecked())
                {
                    String output = "Correct!";
                    Correct.setText(output);
                    Incorrect.setText("");
                    openActivityFour();
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

    private void openActivityFour()
    {
        Intent intent = new Intent(this, FourthPage.class);
        startActivity(intent);
    }

    private void goToMapActivity()
    {
        Intent intent = new Intent(this, MapPage.class);
        startActivity(intent);
    }
}


