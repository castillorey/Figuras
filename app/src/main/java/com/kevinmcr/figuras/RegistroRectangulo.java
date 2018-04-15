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

public class RegistroRectangulo extends AppCompatActivity {
    private EditText txtBase, txtAltura;
    private Resources recursos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_rectangulo);
        txtBase = findViewById(R.id.txtBase);
        txtAltura = findViewById(R.id.txtAltura);
        recursos = this.getResources();
    }

    public void guardar (View v){
        String _base = txtBase.getText().toString(),_altura = txtAltura.getText().toString(),
        regEx = "^[0-9]+([.][0-9]+)?$"; //Para validar que no ingresen: ( .0) (0. ) ( . )
        Double resultado;

        Pattern r = Pattern.compile(regEx);
        Matcher mBase = r.matcher(_base), mAltura = r.matcher(_altura);

        if(_base.isEmpty()){
            txtBase.requestFocus();
            txtBase.setError( this.getResources().getString(R.string.error_cantidad_vacio));

        }else
        if(_altura.isEmpty()){
            txtAltura.requestFocus();
            txtAltura.setError( this.getResources().getString(R.string.error_cantidad_vacio));
        }else
        if(!mBase.find()){
            txtBase.requestFocus();
            txtBase.setError( this.getResources().getString(R.string.error_formato));

        }else
        if(!mAltura.find()){
            txtAltura.requestFocus();
            txtAltura.setError( this.getResources().getString(R.string.error_formato));

        }else
        if(Double.parseDouble(_base) == 0){
            txtBase.requestFocus();
            txtBase.setError(this.getResources().getString(R.string.error_cantidad_cero));

        }else
        if(Double.parseDouble(_altura) == 0){
            txtAltura.requestFocus();
            txtAltura.setError(this.getResources().getString(R.string.error_cantidad_cero));

        }else{

            resultado = Metodos.operacionAreaRectangulo(_base,_altura,recursos);

            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
            alertDialogBuilder.setMessage("Resultado: "+resultado+" m2");
            alertDialogBuilder.setPositiveButton("Ok",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface arg0, int arg1) {
                        Toast.makeText(RegistroRectangulo.this,getResources().getString(R.string.mensaje_guardado),Toast.LENGTH_LONG).show();
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
        txtBase.setText("");
        txtAltura.setText("");
    }
}
