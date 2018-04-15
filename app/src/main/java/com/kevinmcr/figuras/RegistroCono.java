package com.kevinmcr.figuras;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
        Boolean valid = true;
        String _radio = txtRadio.getText().toString(),_altura = txtAltura.getText().toString(),
        regEx = "^[0-9]+([,][0-9]+)?$"; //Para validar que no ingresen: ( ,0) (0, ) ( , )
        Pattern r = Pattern.compile(regEx);
        Matcher mRadio = r.matcher(_radio), mAltura = r.matcher(_altura);

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
        if(_altura.isEmpty()){
            txtAltura.requestFocus();
            txtAltura.setError( this.getResources().getString(R.string.error_cantidad_vacio));
            valid = false;
        }
        if(Integer.parseInt(_altura) == 0){
            txtAltura.requestFocus();
            txtAltura.setError(this.getResources().getString(R.string.error_cantidad_cero));
            valid = false;
        }
        if(mAltura.find()){
            txtAltura.requestFocus();
            txtAltura.setError( this.getResources().getString(R.string.error_formato));
            valid = false;
        }
        if(valid){

            Operacion o = Metodos.operacionVolumenCono(_radio,_altura);
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
