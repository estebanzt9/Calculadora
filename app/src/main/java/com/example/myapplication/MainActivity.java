package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button Sum;
    Button random;
    TextView Texto1;
    TextView Texto2;
    TextView Texto3;
    TextView txt;




    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Texto1 = findViewById(R.id.t1);
        Texto2 = findViewById(R.id.t2);
        Texto3 = findViewById(R.id.t3);
        Sum = findViewById(R.id.boton_sum);
        txt = findViewById(R.id.textView);
        random = findViewById(R.id.boton_aleatrorio);


        random.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random random = new Random();
                int val = random.nextInt(  100 );
                txt.setText(Integer.toString(val));



            }
        });

        Sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int sum1, sum2, sum3,resul ;
                sum1 = Integer.parseInt(txt.getText().toString());
                sum2 = Integer.parseInt(txt.getText().toString());
                sum3 = Integer.parseInt(txt.getText().toString());

                resul = sum1 + sum2 + sum3;
                Texto1.setText(Integer.toString(resul));
                Texto2.setText(Integer.toString(resul));
                Texto3.setText(Integer.toString(resul));


            }
        });
















    }
}