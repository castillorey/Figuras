package com.kevinmcr.figuras;

/**
 * Created by Android on 09/04/2018.
 */

public class Operacion {
    private String operacion, datos, resultado;

    public Operacion(String operacion, String datos, String resultado) {
        this.operacion = operacion;
        this.datos = datos;
        this.resultado = resultado;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }

    public String getDatos() {
        return datos;
    }

    public void setDatos(String datos) {
        this.datos = datos;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public void guardar(){
        Datos.guardar(this);
    }
}
