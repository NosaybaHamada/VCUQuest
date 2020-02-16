package com.example.vcuquest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.TextView;

import org.w3c.dom.Text;

public class NextPage extends AppCompatActivity {

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


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next_page);

        nextPage = (Button) findViewById(R.id.nextButton);
        objectiveText = (TextView) findViewById(R.id.objectiveText);
        vcuQuestion = (TextView) findViewById(R.id.vcusign);
        percentage = (TextView) findViewById(R.id.percent);
        progress  = (ProgressBar) findViewById(R.id.progressBar);
        mapButton = (ImageButton) findViewById(R.id.mapButton);
        answer = (EditText) findViewById(R.id.answer);
        Correct = (TextView) findViewById(R.id.correctText);
        Incorrect = (TextView) findViewById(R.id.IncorrectText);

        nextPage.setVisibility(View.INVISIBLE);

        answer.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if (answer.getText().toString().equalsIgnoreCase("three"))
                {

                    String output = "Correct!";
                    Correct.setText(output);
                   Incorrect.setText("");
                    nextPage.setVisibility(View.VISIBLE);
                }
                else
                {
                    String output = "Inorrect!";
                   Incorrect.setText(output);
                    Correct.setText("");
                    //System.out.println("That's incorrect! Try again! (Hint: 'Ten' = 10");
                    nextPage.setVisibility(View.INVISIBLE);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        nextPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityThree();
            }
        });

        mapButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToMapActivity();

            }
        });
    }

    private void openActivityThree()
    {
        Intent intent = new Intent(this, ThirdPage.class);
        startActivity(intent);
    }

    private void goToMapActivity()
    {
        Intent intent = new Intent(this, MapPage.class);
        startActivity(intent);
    }
}
