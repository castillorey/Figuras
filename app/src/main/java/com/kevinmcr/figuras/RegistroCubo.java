package com.kevinmcr.figuras;

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

public class RegistroCubo extends AppCompatActivity {
    private EditText txtLado;
    private Resources recursos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_cubo);
        txtLado = findViewById(R.id.txtLado);
        recursos = this.getResources();
    }

    public void guardar (View v){
        String _lado = txtLado.getText().toString(),
        regEx = "^[0-9]+([.][0-9]+)?$"; //Para validar que no ingresen: ( .0) (0. ) ( . )
        Double resultado;

        Pattern r = Pattern.compile(regEx);
        Matcher mLado = r.matcher(_lado);

        if(_lado.isEmpty()){
            txtLado.requestFocus();
            txtLado.setError( this.getResources().getString(R.string.error_cantidad_vacio));

        }else
        if(!mLado.find()){
            txtLado.requestFocus();
            txtLado.setError( this.getResources().getString(R.string.error_formato));

        }else
        if(Double.parseDouble(_lado) == 0){
            txtLado.requestFocus();
            txtLado.setError(this.getResources().getString(R.string.error_cantidad_cero));

        }else{

            resultado = Metodos.operacionVolumenCubo(_lado, recursos);

            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
            alertDialogBuilder.setMessage("Resultado: "+resultado+" m3");
            alertDialogBuilder.setPositiveButton("Ok",
                    new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface arg0, int arg1) {
                            Toast.makeText(RegistroCubo.this,getResources().getString(R.string.mensaje_guardado),Toast.LENGTH_LONG).show();
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
        txtLado.setText("");
    }
}
