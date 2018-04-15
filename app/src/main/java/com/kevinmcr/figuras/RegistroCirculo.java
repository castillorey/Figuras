package com.kevinmcr.figuras;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegistroCirculo extends AppCompatActivity {
    private EditText txtRadio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_circulo);
        txtRadio = findViewById(R.id.txtRadio);
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

            resultado = Metodos.operacionAreaCirculo(_radio);

            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
            alertDialogBuilder.setMessage("Resultado: "+resultado+" m2");
            alertDialogBuilder.setPositiveButton("Ok",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface arg0, int arg1) {
                        Toast.makeText(RegistroCirculo.this,getResources().getString(R.string.mensaje_guardado),Toast.LENGTH_LONG).show();
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
