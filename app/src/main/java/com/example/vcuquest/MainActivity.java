package com.example.vcuquest;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.text.Editable;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.EditText;
import android.text.TextWatcher;

import org.w3c.dom.Text;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

public class MainActivity extends AppCompatActivity {
    Button button;
    EditText answer;
    ImageButton mapButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.nextButton);
        mapButton = (ImageButton)findViewById(R.id.mapButton);
        answer = (EditText) findViewById(R.id.answer0);

        button.setVisibility(View.INVISIBLE);

        answer.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if (answer.getText().toString().equalsIgnoreCase("commons"))
                {
                    button.setVisibility(View.VISIBLE);
                }
                else
                {
                    System.out.println("That's incorrect! Try again! (Hint: it's only one word)");
                    button.setVisibility(View.INVISIBLE);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToSecondActvity();

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

        Intent intent = new Intent(this, MapPage.class );

        startActivity(intent);

    }

}