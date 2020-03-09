package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button btnSend;
    private Button btnSave;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSend = (Button) findViewById(R.id.btnSend);

        btnSave = (Button)findViewById(R.id.btnSave);
        btnSend.setOnClickListener(this);
        btnSave.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        if(v.getId() == R.id.btnSend){
            Toast.makeText(this,"Clickou enviar",Toast.LENGTH_SHORT).show(); // mMostra um toast na tela
            Intent it = new Intent(MainActivity.this,CalcActivity.class);
            it.putExtra("param1","Eu passei ..."); // Esta enviando parametros com a activity
            startActivity(it);

        }
        if(v.getId() == R.id.btnSave){
            Toast.makeText(this,"Clicou save",Toast.LENGTH_SHORT).show();
        }
    }
}
