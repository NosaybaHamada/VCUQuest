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

public class SeventhPage extends AppCompatActivity {

    Button nextPage;
    TextView objectiveText;
    TextView vcuQuestion;
    TextView percentage;
    ProgressBar progress;
    ImageButton mapButton;
    TextView Correct;
    TextView Incorrect;
    CheckBox checkOne, checkTwo, checkThree, checkFour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seventh_page);

        nextPage = (Button) findViewById(R.id.nextButton);
        objectiveText = (TextView) findViewById(R.id.objectiveText);
        vcuQuestion = (TextView) findViewById(R.id.vcusign);
        percentage = (TextView) findViewById(R.id.percent);
        progress  = (ProgressBar) findViewById(R.id.progressBar);
        mapButton = (ImageButton) findViewById(R.id.mapButton);
        Correct = (TextView) findViewById(R.id.CorrectText);
        Incorrect = (TextView) findViewById(R.id.IncorrectText);
        checkOne = (CheckBox) findViewById(R.id.checkBoxOne);
        checkTwo = (CheckBox) findViewById(R.id.checkBoxTwo);
        checkThree = (CheckBox) findViewById(R.id.checkBoxThree);
        checkFour = (CheckBox) findViewById(R.id.checkBoxFour);

        nextPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkOne.isChecked() && checkTwo.isChecked() && checkThree.isChecked() && checkFour.isChecked())
                {
                    String output = "Incorrect!";
                    Correct.setText("");
                    Incorrect.setText(output);
                    //openActivityFive();
                }
                else if (checkOne.isChecked() && checkFour.isChecked())
                {
                    String output = "Correct!";
                    Correct.setText(output);
                    Incorrect.setText("");
                    openActivityEight();
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

    private void openActivityEight()
    {
        Intent intent = new Intent(this, EighthPage.class);
        startActivity(intent);
    }

    private void goToMapActivity()
    {
        Intent intent = new Intent(this, MapPage.class);
        startActivity(intent);
    }
}

