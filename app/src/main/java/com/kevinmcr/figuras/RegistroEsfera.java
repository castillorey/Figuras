package com.kevinmcr.figuras;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class RegistroEsfera extends AppCompatActivity {
    private EditText txtRadio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_esfera);
        txtRadio = findViewById(R.id.txtRadio);
    }

    public void guardar (View v){

        Double resultado, radio;
        radio = Double.parseDouble(txtRadio.getText().toString());
        resultado = (4/3) * 3.14159265359 * Math.pow(radio,3);

        Operacion o = new Operacion("Volúmen de la esfera","Radio: "+radio,resultado+" m3");
        o.guardar();
        Toast.makeText(this,getResources().getString(R.string.mensaje_guardado),Toast.LENGTH_SHORT).show();

    }

    public void limpiar (View v){
        borrar();
    }

    public void borrar(){
        txtRadio.setText("");
    }
}
