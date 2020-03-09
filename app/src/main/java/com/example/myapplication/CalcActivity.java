package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CalcActivity extends AppCompatActivity {

    private EditText edText;
    private Button btnBack;
    private Button btnClear;

    private String strPassed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc);

        Intent it = getIntent(); // Pega a intent que veio
        if(it != null) { // Verifica se a Intent não é nula
            Bundle params = it.getExtras(); // Pega as coisas alem das "Screens"(Intents)
            if(params != null){ // Verifica se tem parametros
                strPassed = (String)params.get("param1"); // Pega o parametro com o esta chave
            }
        }

        edText = findViewById(R.id.etText);
        edText.setText(strPassed);


        btnClear = (Button) findViewById(R.id.btnClear);
        btnBack = (Button) findViewById(R.id.btnBack);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(CalcActivity.this, MainActivity.class); // Os paramentros são a "Screen"(Intent) Atual e a "Screen"(Intent) que quero ir

                startActivity(it); // Logo depois inicio a Intenet
            }
        });
    }
}
