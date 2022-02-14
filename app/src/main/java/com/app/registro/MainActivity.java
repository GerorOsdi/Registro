package com.app.registro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText txtNombres, txtApellidos, txtEdad, txtCorreo;
    Button btnEnviarInf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNombres = (EditText) findViewById(R.id.txtNombres);
        txtApellidos = (EditText) findViewById(R.id.txtApellidos);
        txtEdad = (EditText) findViewById(R.id.txtEdad);
        txtCorreo = (EditText) findViewById(R.id.txtCorreo);
        btnEnviarInf = (Button) findViewById(R.id.btnEnviar);

        btnEnviarInf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                enviarInformación();
            }
        });
    }

    public void enviarInformación(){
        Intent info = new Intent(this,informacion_activity.class);

        info.putExtra("nombre",txtNombres.getText().toString());
        info.putExtra("apellidos",txtApellidos.getText().toString());
        info.putExtra("edad",txtEdad.getText().toString());
        info.putExtra("correo",txtCorreo.getText().toString());

        startActivity(info);

        limpiar();

    }

    public void limpiar(){
        txtNombres.setText("");
        txtApellidos.setText("");
        txtCorreo.setText("");
        txtEdad.setText("");
    }
}