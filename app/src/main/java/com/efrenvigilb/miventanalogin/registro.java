package com.efrenvigilb.miventanalogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class registro extends AppCompatActivity {


  private EditText nombre;
  private EditText telefono;
  private EditText email;
  private EditText contra;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
        nombre= (EditText) findViewById(R.id.Nombretxt);
        telefono= (EditText) findViewById(R.id.Telefonotxt);
        email= (EditText) findViewById(R.id.Emailtxt);
        contra= (EditText) findViewById(R.id.Contratxt);
    }

    //metodo para cancelar
    public void cancelar (View view){
        Intent cancelar= new Intent(this, MainActivity.class);
        startActivity(cancelar);
    }
    // metodo guardar

    public void guardar (View view){
        Intent guardar= new Intent(this, MainActivity.class);
        startActivity(guardar);
        Intent i = new Intent(this,Registrado.class);
        i.putExtra("nom", nombre.getText().toString());
        i.putExtra("tel", telefono.getText().toString());
        i.putExtra("email", email.getText().toString());
        i.putExtra("contra", contra.getText().toString());

        startActivity(i);


    }
}



