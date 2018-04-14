package com.kevinmcr.figuras;

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


}
