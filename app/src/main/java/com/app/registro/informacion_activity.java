package com.app.registro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

public class informacion_activity extends AppCompatActivity {

    EditText txtNombre, txtCorreo, txtEdad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informacion);

        txtNombre = (EditText) findViewById(R.id.txtNombreCompl);
        txtCorreo = (EditText) findViewById(R.id.txtCorreoInf);
        txtEdad = (EditText) findViewById(R.id.txtEdadInf);

        txtNombre.setText(getIntent().getExtras().getString("nombre")+" "+getIntent().getExtras().getString("apellidos"));
        txtCorreo.setText(getIntent().getExtras().getString("correo"));
        txtEdad.setText(getIntent().getExtras().getString("edad"));
    }


}