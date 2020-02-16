package com.example.vcuquest;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.nextButton);
        ImageButton mapButton = (ImageButton)findViewById(R.id.mapButton);
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