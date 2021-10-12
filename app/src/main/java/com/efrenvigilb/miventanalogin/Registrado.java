package com.efrenvigilb.miventanalogin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Registrado extends AppCompatActivity {
private TextView text;
    private TextView text2;
    private TextView text3;
    private TextView text4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrado);
        text4= (TextView)findViewById(R.id.nombre);
        text3= (TextView)findViewById(R.id.Telefono);
        text2= (TextView)findViewById(R.id.correo);
        text= (TextView)findViewById(R.id.contraseña);

        String nom= getIntent().getStringExtra("nom");
        text4.setText(nom);

        String tel= getIntent().getStringExtra("tel");
        text3.setText(tel);

        String email= getIntent().getStringExtra("email");
        text2.setText(email);

        String contra= getIntent().getStringExtra("contra");
        text.setText(contra);
    }
}