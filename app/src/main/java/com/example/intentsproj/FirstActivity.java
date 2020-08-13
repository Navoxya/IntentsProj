package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    Button btn;

    TextView txt1,txt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        btn = findViewById(R.id.btnok);
        txt1 = findViewById(R.id.text1);
        txt2 = findViewById(R.id.text2);


    }

    @Override
    protected void onResume() {
        super.onResume();
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String number1,number2;
                number1 = txt1.getText().toString();
                number2 = txt2.getText().toString();

                Intent intent = new Intent(FirstActivity.this,SecondActivity.class);

                intent.putExtra("Extra1", number1);
                intent.putExtra("Extra2", number2);

                startActivity(intent);

                //toast
                Context context = getApplicationContext();

                CharSequence message = "You just clicked the OK button";

                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, message, duration);
                toast.show();

                toast.setGravity(Gravity.BOTTOM|Gravity.CENTER, 0, 0);
            }
        });


    }

}