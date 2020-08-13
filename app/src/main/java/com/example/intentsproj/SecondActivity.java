package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    String takeExtra1,takeExtra2;
    TextView result,num1,num2;
    float txtnum1,txtnum2;


    Button addition,subtraction,multiplication,division;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        result = findViewById(R.id.txtAnswer);
        num1 = findViewById((R.id.text1));
        num2 = findViewById(R.id.text2);

        addition = findViewById(R.id.btnAdd);
        subtraction = findViewById(R.id.btnsub);
        multiplication = findViewById(R.id.btnmultiply);
        division = findViewById(R.id.btndivi);

        Intent intent = getIntent();
        takeExtra1 = intent.getStringExtra("Extra1");
        takeExtra2 = intent.getStringExtra("Extra2");

        num1.setText(takeExtra1);
        num2.setText(takeExtra2);

        txtnum1 = Float.parseFloat(takeExtra1);
        txtnum2 = Float.parseFloat(takeExtra2);
    }



    @Override
    protected void onResume() {
        super.onResume();

        addition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                result.setText(takeExtra1 + " + " + takeExtra2 + " = " + String.valueOf(txtnum1 + txtnum2));

            }
        });

        subtraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(takeExtra1 + " - " + takeExtra2 + " = " + String.valueOf(txtnum1 - txtnum2));
            }
        });

        multiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(takeExtra1 + " X " + takeExtra2 + " = " + String.valueOf(txtnum1 * txtnum2));
            }
        });

        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(takeExtra1 + " / " + takeExtra2 + " = " + String.valueOf(txtnum1 / txtnum2));
            }
        });


    }
}