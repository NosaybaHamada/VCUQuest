package com.example.vcuquest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Objective3 extends AppCompatActivity {

    //private Object view;

    Button SubmitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_objective3);

        EditText Submition = findViewById(R.id.Submition_ID);
        TextView correctOutput = findViewById(R.id.correct_ID);
        TextView falseOutput = findViewById(R.id.false_id);
        String submition = Submition.getText().toString();
        String CorrectAnswer = "THE TRUSTEES";
        String output;

        SubmitButton.setOnClickListener(new view.onClickListener){


            @Override
            public void onClick(View v){

                if (submition == CorrectAnswer) {
                    output = "Correct";
                    correctOutput.setText(output);
                } else {
                    output = "False";
                    falseOutput.setText(output);
                }

            }



        });




    }
}
