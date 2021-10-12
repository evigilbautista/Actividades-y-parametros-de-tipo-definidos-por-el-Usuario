package com.efrenvigilb.miventanalogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }


    //metodo para el boton registrar
    public void registrar (View view){
        Intent registro= new Intent(this, registro.class);
        startActivity(registro);
    }
}