package com.example.vcuquest;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.text.Editable;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.EditText;
import android.text.TextWatcher;
import android.widget.TextView;

import org.w3c.dom.Text;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

public class MainActivity extends AppCompatActivity {
    Button button;
    EditText answer;
    ImageButton mapButton;
    TextView Correct;
    TextView Incorrect;
    CheckBox checkOne, checkTwo, checkThree, checkFour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SharedPreferences prefs = getSharedPreferences("prefs", MODE_PRIVATE);
        boolean firstStart = prefs.getBoolean("firstStart", true);

        if (firstStart == true)
        {
            showStartDialog();
        }


        button = (Button) findViewById(R.id.nextButton);
        mapButton = (ImageButton)findViewById(R.id.mapButton);
        //answer = (EditText) findViewById(R.id.answer0);
        Correct = (TextView) findViewById(R.id.CorrectText);
        Incorrect = (TextView) findViewById(R.id.incorrectText);
        checkOne = (CheckBox) findViewById(R.id.correctCheckOne);
        checkTwo = (CheckBox) findViewById(R.id.correctCheckTwo);
        checkThree = (CheckBox) findViewById(R.id.correctCheckThree);
        checkFour = (CheckBox) findViewById(R.id.correctCheckFour);

        button.setVisibility(View.VISIBLE);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkOne.isChecked() && checkTwo.isChecked() && checkThree.isChecked() && checkFour.isChecked())
                {
                    String output = "Incorrect!";
                    Correct.setText("");
                    Incorrect.setText(output);
                    //openActivityFive();
                }
                else if (checkTwo.isChecked() && !checkOne.isChecked() && !checkThree.isChecked() && !checkFour.isChecked())
                {
                    String output = "Correct!";
                    Correct.setText(output);
                    Incorrect.setText("");
                    goToSecondActvity();
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

    private void goToSecondActvity() {

        Intent intent = new Intent(this, NextPage.class );

        startActivity(intent);

    }
    private void goToMapActivity() {
        Intent intent = new Intent(this, GoogleMaps.class );
        int num = 1;
        Intent myIntent = new Intent(MainActivity.this, GoogleMaps.class);
        myIntent.putExtra("mapcounter", num);
        startActivity(myIntent);


    }

    private void showStartDialog() {
        new AlertDialog.Builder(this)
            .setTitle("This is the beginning screen for QUEST @ VCU!")
                .setMessage("This app allows an individual new to VCU and its campus to explore in a fun and education way!")
                .setPositiveButton("OKAY!", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                })
                .create().show();

        SharedPreferences prefs = getSharedPreferences("prefs", MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putBoolean("firstStart", false);
        editor.apply();
    }

}