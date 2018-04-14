package com.kevinmcr.figuras;

import android.widget.EditText;

import java.util.ArrayList;

/**
 * Created by Android on 09/04/2018.
 */

public class Datos {
    private static ArrayList<Operacion> operaciones = new ArrayList();

    public static void guardar(Operacion o) {
        operaciones.add(o);
    }

    public static ArrayList<Operacion> obtener(){
        return operaciones;
    }

    public static Boolean validar(EditText campo){

        if(campo.getText().toString().isEmpty()){
            campo.requestFocus();
            return false;
        }

        if(Integer.parseInt(campo.getText().toString()) == 0){
            campo.requestFocus();
            return false;
        }

        return true;
    }
}
