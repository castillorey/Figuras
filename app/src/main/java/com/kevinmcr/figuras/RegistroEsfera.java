package com.kevinmcr.figuras;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegistroEsfera extends AppCompatActivity {
    private EditText txtRadio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_esfera);
        txtRadio = findViewById(R.id.txtRadio);
    }

    public void guardar (View v){
        Boolean valid = true;
        String _radio = txtRadio.getText().toString(),
        regEx = "^[0-9]+([,][0-9]+)?$"; //Para validar que no ingresen: ( ,0) (0, ) ( , )
        Pattern r = Pattern.compile(regEx);
        Matcher mRadio = r.matcher(_radio);

        if(_radio.isEmpty()){
            txtRadio.requestFocus();
            txtRadio.setError( this.getResources().getString(R.string.error_cantidad_vacio));
            valid = false;
        }
        if(Integer.parseInt(_radio) == 0){
            txtRadio.requestFocus();
            txtRadio.setError(this.getResources().getString(R.string.error_cantidad_cero));
            valid = false;
        }
        if(mRadio.find()){
            txtRadio.requestFocus();
            txtRadio.setError( this.getResources().getString(R.string.error_formato));
            valid = false;
        }

        if(valid){
            Double resultado, radio;
            radio = Double.parseDouble(txtRadio.getText().toString());
            resultado = (4/3) * 3.14159265359 * Math.pow(radio,3);

            Operacion o = new Operacion("Volúmen de la esfera","Radio: "+radio,resultado+" m3");
            o.guardar();
            Toast.makeText(this,getResources().getString(R.string.mensaje_guardado),Toast.LENGTH_SHORT).show();
        }

    }

    public void limpiar (View v){
        borrar();
    }

    public void borrar(){
        txtRadio.setText("");
    }
}
