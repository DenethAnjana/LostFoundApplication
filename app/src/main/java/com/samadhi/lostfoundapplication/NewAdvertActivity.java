package com.samadhi.lostfoundapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class NewAdvertActivity extends AppCompatActivity {

    RadioButton lost, found;
    EditText name,phone,description,date, location;
    Button save;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_advert);

        lost = findViewById(R.id.radiolost);
        found = findViewById(R.id.radioFound);
    }
}