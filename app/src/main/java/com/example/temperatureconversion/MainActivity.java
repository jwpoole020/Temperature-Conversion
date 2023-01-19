package com.example.temperatureconversion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText InputCel;
    EditText InputFar;
    Button buttonCel;
    Button buttonFah;
    TextView DisplayNew;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        InputCel = findViewById(R.id.InputCel);
        InputFar = findViewById(R.id.InputFar);
        buttonCel = findViewById(R.id.buttonCel);
        buttonFah = findViewById(R.id.buttonFah);
        DisplayNew = findViewById(R.id.DisplayNew);

        buttonCel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String tempCel = InputCel.getText().toString();
                double tempC = Double.parseDouble(tempCel);
                DisplayNew.setText("Temperature is " + ((1.8*tempC)+32));
            }
        });

        buttonFah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String tempFah = InputFar.getText().toString();
                double tempF = Double.parseDouble(tempFah);
                DisplayNew.setText("Temperature is " + (5.0/9.0*(tempF-32)));
            }
        });


    }
}