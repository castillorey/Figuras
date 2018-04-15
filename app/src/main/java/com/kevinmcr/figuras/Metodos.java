package com.kevinmcr.figuras;

import android.content.res.Resources;
import android.graphics.Path;

import org.w3c.dom.DOMError;

import java.text.DecimalFormat;

/**
 * Created by Castilloreyes on 14/04/18.
 */

public class Metodos {

    public static Double operacionAreaCuadrado(String _lado, Resources r){

        Double resultado, lado;
        lado = Double.parseDouble(_lado);
        resultado = Math.pow(lado,2);

        Operacion o = new Operacion(r.getString(R.string.area_cuadrado),r.getString(R.string.lado_)+": "+lado,String.format("%.2f",resultado)+" m2");
        o.guardar();

        return resultado;
    }

    public static Double operacionAreaRectangulo(String _base,String _altura, Resources r){
        Double resultado, base, altura;
        base = Double.parseDouble(_base);
        altura = Double.parseDouble(_altura);
        resultado = base * altura;

        Operacion o = new Operacion(r.getString(R.string.area_rectangulo),r.getString(R.string.base)+": "+base+"\n"+": "+altura,String.format("%.2f",resultado)+" m2");
        o.guardar();
        return resultado;
    }

    public static Double operacionAreaTriangulo(String _base,String _altura, Resources r){
        Double resultado, base, altura;
        base = Double.parseDouble(_base);
        altura = Double.parseDouble(_altura);
        resultado = (base * altura)/2;

        Operacion o = new Operacion(r.getString(R.string.area_trinagulo),r.getString(R.string.base)+": "+base+"\n"+r.getString(R.string.altura)+": "+altura,String.format("%.2f",resultado)+" m2");
        o.guardar();
        return resultado;
    }

    public static Double operacionAreaCirculo(String _radio, Resources r){
        Double resultado, radio;
        radio = Double.parseDouble(_radio);
        resultado = 3.14159265359 * Math.pow(radio,2);

        Operacion o = new Operacion(r.getString(R.string.area_circulo),r.getString(R.string.radio)+": "+radio,String.format("%.2f",resultado)+" m2");
        o.guardar();

        return resultado;
    }

    public static Double operacionVolumenEsfera(String _radio, Resources r){
        Double resultado, radio;
        radio = Double.parseDouble(_radio);
        resultado = (1.33333333333) * 3.14159265359 * Math.pow(radio,3);

        Operacion o = new Operacion(r.getString(R.string.volumen_esfera),r.getString(R.string.radio)+": "+radio,String.format("%.2f",resultado)+" m3");
        o.guardar();

        return resultado;
    }

    public static Double operacionVolumenCilindro(String _radio,String _altura, Resources r){
        Double resultado, radio, altura;
        radio = Double.parseDouble(_radio);
        altura = Double.parseDouble(_altura);
        resultado = 3.14159265359 * Math.pow(radio,2) * altura;

        Operacion o = new Operacion(r.getString(R.string.volumen_cilindro),r.getString(R.string.radio)+": "+radio+ "\n"+r.getString(R.string.altura)+": "+altura,String.format("%.2f",resultado)+" m3");
        o.guardar();

        return  resultado;
    }

    public static Double operacionVolumenCono(String _radio, String _altura, Resources r){
        Double resultado, radio, altura;
        radio = Double.parseDouble(_radio);
        altura = Double.parseDouble(_altura);
        resultado = (0.3333333333 * 3.14159265359) * (Math.pow(radio,2) * altura);

        Operacion o = new Operacion(r.getString(R.string.volumen_cono),r.getString(R.string.radio)+": "+radio+ "\n"+r.getString(R.string.altura)+": "+altura,String.format("%.2f",resultado)+" m3");
        o.guardar();

        return resultado;
    }

    public static Double operacionVolumenCubo(String _lado, Resources r){
        Double resultado, lado;
        lado = Double.parseDouble(_lado);
        resultado = Math.pow(lado,3);

        Operacion o = new Operacion(r.getString(R.string.volumen_cono),r.getString(R.string.lado_)+": "+lado,String.format("%.2f",resultado)+" m3");
        o.guardar();

        return resultado;
    }

}
