package com.kevinmcr.figuras;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegistroCubo extends AppCompatActivity {
    private EditText txtLado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_cubo);
        txtLado = findViewById(R.id.txtLado);
    }

    public void guardar (View v){
        Boolean valid = true;
        String _lado = txtLado.getText().toString(),
                regEx = "^[0-9]+([,][0-9]+)?$"; //Para validar que no ingresen: ( ,0) (0, ) ( , )
        Pattern r = Pattern.compile(regEx);
        Matcher mLado = r.matcher(_lado);

        if(_lado.isEmpty()){
            txtLado.requestFocus();
            txtLado.setError( this.getResources().getString(R.string.error_cantidad_vacio));
            valid = false;
        }
        if(Integer.parseInt(_lado) == 0){
            txtLado.requestFocus();
            txtLado.setError(this.getResources().getString(R.string.error_cantidad_cero));
            valid = false;
        }
        if(mLado.find()){
            txtLado.requestFocus();
            txtLado.setError( this.getResources().getString(R.string.error_formato));
            valid = false;
        }
        if(valid){
            Double resultado, lado;
            lado = Double.parseDouble(txtLado.getText().toString());
            resultado = Math.pow(lado,lado);

            Operacion o = new Operacion("Volúmen del cubo","Lado: "+lado,resultado+" m3");
            o.guardar();
            Toast.makeText(this,getResources().getString(R.string.mensaje_guardado),Toast.LENGTH_SHORT).show();
        }

    }

    public void limpiar (View v){
        borrar();
    }

    public void borrar(){
        txtLado.setText("");
    }
}
