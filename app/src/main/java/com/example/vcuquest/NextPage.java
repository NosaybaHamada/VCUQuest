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
    ImageButton map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next_page);

        nextPage = (Button) findViewById(R.id.nextButton);
        submit = (Button) findViewById(R.id.submitButton);
        objectiveText = (TextView) findViewById(R.id.objectiveText);
        vcuQuestion = (TextView) findViewById(R.id.vcusign);
        percentage = (TextView) findViewById(R.id.percent);
        progress  = (ProgressBar) findViewById(R.id.progressBar);
        map = (ImageButton) findViewById(R.id.mapButton);
        answer = (EditText) findViewById(R.id.answer);

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
                    nextPage.setVisibility(View.VISIBLE);
                }
                else
                {
                    System.out.println("That's incorrect! Try again! (Hint: 'Ten' = 10");
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
    }

    public void openActivityThree()
    {
        Intent intent = new Intent(this, objective3.class);
    }
}
