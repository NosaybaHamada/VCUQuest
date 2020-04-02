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

public class FinalPage extends AppCompatActivity {

    TextView finalText;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final_page);

        finalText = (TextView) findViewById(R.id.finalPageText);


    }




    private void goToMapActivity()
    {
        Intent intent = new Intent(this, MapPage.class);
        startActivity(intent);
    }
}
