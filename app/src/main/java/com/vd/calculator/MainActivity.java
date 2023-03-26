package com.vd.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText n1;
    EditText n2;
    TextView sonuc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        n1 = findViewById(R.id.n1);
        n2 = findViewById(R.id.n2);
        sonuc = findViewById(R.id.sonuc);
    }

    public void topla(View view) {

        if (n1.getText().toString().matches("") || n2.getText().toString().matches("")) {

            sonuc.setText("Boş karakter bırakmayınız!");
        } else {
            float no1 = Integer.parseInt(n1.getText().toString());
            float no2 = Integer.parseInt(n2.getText().toString());
            float result = no1 + no2;
            sonuc.setText("Sonuç: " + result);
        }
    }

    public void cikar(View view) {

        if (n1.getText().toString().matches("") || n2.getText().toString().matches("")) {

            sonuc.setText("Boş karakter bırakmayınız!");
        } else {
            float no1 = Integer.parseInt(n1.getText().toString());
            float no2 = Integer.parseInt(n2.getText().toString());
            float result = no1 - no2;
            sonuc.setText("Sonuç: " + result);
        }
    }

    public void bol(View view) {

        if (n1.getText().toString().matches("") || n2.getText().toString().matches("")) {

            sonuc.setText("Boş karakter bırakmayınız!");
        } else {
            float no1 = Integer.parseInt(n1.getText().toString());
            float no2 = Integer.parseInt(n2.getText().toString());
            float result = no1 / no2;
            sonuc.setText("Sonuç: " + result);
        }
    }

    public void carp(View view) {

        if (n1.getText().toString().matches("") || n2.getText().toString().matches("")) {

            sonuc.setText("Boş karakter bırakmayınız!");
        } else {
            float no1 = Integer.parseInt(n1.getText().toString());
            float no2 = Integer.parseInt(n2.getText().toString());
            float result = no1 * no2;
            sonuc.setText("Sonuç: " + result);
        }
    }
}