package com.kevinmcr.figuras;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegistroEsfera extends AppCompatActivity {
    private EditText txtRadio;
    private Resources recursos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_esfera);
        txtRadio = findViewById(R.id.txtRadio);
        recursos = this.getResources();
    }

    public void guardar (View v){
        String _radio = txtRadio.getText().toString(),
        regEx = "^[0-9]+([.][0-9]+)?$"; //Para validar que no ingresen: ( .0) (0. ) ( . )
        Double resultado;

        Pattern r = Pattern.compile(regEx);
        Matcher mRadio = r.matcher(_radio);

        if(_radio.isEmpty()){
            txtRadio.requestFocus();
            txtRadio.setError( this.getResources().getString(R.string.error_cantidad_vacio));

        }else
        if(!mRadio.find()){
            txtRadio.requestFocus();
            txtRadio.setError( this.getResources().getString(R.string.error_formato));

        }else
        if(Double.parseDouble(_radio) == 0){
            txtRadio.requestFocus();
            txtRadio.setError(this.getResources().getString(R.string.error_cantidad_cero));

        }else{

            resultado = Metodos.operacionVolumenEsfera(_radio, recursos);

            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
            alertDialogBuilder.setMessage("Resultado: "+resultado+" m3");
            alertDialogBuilder.setPositiveButton("Ok",
                    new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface arg0, int arg1) {
                            Toast.makeText(RegistroEsfera.this,getResources().getString(R.string.mensaje_guardado),Toast.LENGTH_LONG).show();
                        }
                    }
            );

            AlertDialog alertDialog = alertDialogBuilder.create();
            alertDialog.show();
        }

    }

    public void limpiar (View v){
        borrar();
    }

    public void borrar(){
        txtRadio.setText("");
    }
}
