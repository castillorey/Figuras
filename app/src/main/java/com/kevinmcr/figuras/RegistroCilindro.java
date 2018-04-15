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

public class RegistroCilindro extends AppCompatActivity {
    private EditText txtRadio,txtAltura;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_cilindro);
        txtRadio = findViewById(R.id.txtRadio);
        txtAltura = findViewById(R.id.txtAltura);
    }

    public void guardar (View v){
        String _radio = txtRadio.getText().toString(),_altura = txtAltura.getText().toString(),
        regEx = "^[0-9]+([.][0-9]+)?$"; //Para validar que no ingresen: ( .0) (0. ) ( . )
        Double resultado;

        Pattern r = Pattern.compile(regEx);
        Matcher mRadio = r.matcher(_radio), mAltura = r.matcher(_altura);

        if(_radio.isEmpty()){
            txtRadio.requestFocus();
            txtRadio.setError( this.getResources().getString(R.string.error_cantidad_vacio));

        }else
        if(_altura.isEmpty()){
            txtAltura.requestFocus();
            txtAltura.setError( this.getResources().getString(R.string.error_cantidad_vacio));

        }else
        if(!mRadio.find()){
            txtRadio.requestFocus();
            txtRadio.setError( this.getResources().getString(R.string.error_formato));

        }else
        if(!mAltura.find()){
            txtAltura.requestFocus();
            txtAltura.setError( this.getResources().getString(R.string.error_formato));

        }else
        if(Double.parseDouble(_radio) == 0){
            txtRadio.requestFocus();
            txtRadio.setError(this.getResources().getString(R.string.error_cantidad_cero));

        }else
        if(Double.parseDouble(_altura) == 0){
            txtAltura.requestFocus();
            txtAltura.setError(this.getResources().getString(R.string.error_cantidad_cero));

        }else{

            resultado = Metodos.operacionVolumenCilindro(_radio,_altura);

            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
            alertDialogBuilder.setMessage("Resultado: "+resultado+" m3");
            alertDialogBuilder.setPositiveButton("Ok",
                    new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface arg0, int arg1) {
                            Toast.makeText(RegistroCilindro.this,getResources().getString(R.string.mensaje_guardado),Toast.LENGTH_LONG).show();
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
