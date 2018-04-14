package com.kevinmcr.figuras;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class RegistroCono extends AppCompatActivity {
    private EditText txtRadio,txtAltura;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_cono);
        txtRadio = findViewById(R.id.txtRadio);
        txtAltura = findViewById(R.id.txtAltura);
    }

    public void guardar (View v){

        Double resultado, radio, altura;
        radio = Double.parseDouble(txtRadio.getText().toString());
        altura = Double.parseDouble(txtAltura.getText().toString());
        resultado = (1/3) * 3.14159265359 * Math.pow(radio,2) * altura;

        Operacion o = new Operacion("Volúmen del cono","Radio: "+radio+ "\nAltura: "+altura,resultado+" m3");
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
