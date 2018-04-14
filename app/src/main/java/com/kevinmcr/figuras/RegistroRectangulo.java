package com.kevinmcr.figuras;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class RegistroRectangulo extends AppCompatActivity {
    private EditText txtBase, txtAltura;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_rectangulo);
        txtBase = findViewById(R.id.txtBase);
        txtAltura = findViewById(R.id.txtAltura);
    }

    public void guardar (View v){

        Double resultado, base, altura;
        base = Double.parseDouble(txtBase.getText().toString());
        altura = Double.parseDouble(txtAltura.getText().toString());
        resultado = base * altura;

        Operacion o = new Operacion("Área del rectangulo","Base: "+base+"\nAltura: "+altura,resultado+" m2");
        o.guardar();
        Toast.makeText(this,getResources().getString(R.string.mensaje_guardado),Toast.LENGTH_SHORT).show();

    }

    public void limpiar (View v){
        borrar();
    }

    public void borrar(){
        txtBase.setText("");
        txtAltura.setText("");
    }
}
