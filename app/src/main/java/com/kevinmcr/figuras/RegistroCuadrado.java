package com.kevinmcr.figuras;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class RegistroCuadrado extends AppCompatActivity {
    private EditText txtLado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_cuadrado);
        txtLado = findViewById(R.id.txtLado);
    }

    public void guardar (View v){

        Double resultado, lado;
        lado = Double.parseDouble(txtLado.getText().toString());
        resultado = Math.pow(lado,lado);

        Operacion o = new Operacion("Área del cuadrado","Lado: "+lado,resultado+" m2");
        o.guardar();
        Toast.makeText(this,getResources().getString(R.string.mensaje_guardado),Toast.LENGTH_SHORT).show();

    }

    public void limpiar (View v){
        borrar();
    }

    public void borrar(){
        txtLado.setText("");
    }
}
