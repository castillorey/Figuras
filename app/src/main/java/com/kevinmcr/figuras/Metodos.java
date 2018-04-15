package com.kevinmcr.figuras;

import android.graphics.Path;

import org.w3c.dom.DOMError;

import java.text.DecimalFormat;

/**
 * Created by Castilloreyes on 14/04/18.
 */

public class Metodos {

    public static Double operacionAreaCuadrado(String _lado){
        Double resultado, lado;
        lado = Double.parseDouble(_lado);
        resultado = Math.pow(lado,2);

        Operacion o = new Operacion("Área del cuadrado","Lado: "+lado,String.format("%.2f",resultado)+" m2");
        o.guardar();

        return resultado;
    }

    public static Double operacionAreaRectangulo(String _base,String _altura){
        Double resultado, base, altura;
        base = Double.parseDouble(_base);
        altura = Double.parseDouble(_altura);
        resultado = base * altura;

        Operacion o = new Operacion("Área del rectangulo","Base: "+base+"\nAltura: "+altura,String.format("%.2f",resultado)+" m2");
        o.guardar();
        return resultado;
    }

    public static Double operacionAreaTriangulo(String _base,String _altura){
        Double resultado, base, altura;
        base = Double.parseDouble(_base);
        altura = Double.parseDouble(_altura);
        resultado = (base * altura)/2;

        Operacion o = new Operacion("Área del rectangulo","Base: "+base+"\nAltura: "+altura,String.format("%.2f",resultado)+" m2");
        o.guardar();
        return resultado;
    }

    public static Double operacionAreaCirculo(String _radio){
        Double resultado, radio;
        radio = Double.parseDouble(_radio);
        resultado = 3.14159265359 * Math.pow(radio,2);

        Operacion o = new Operacion("Área del circulo","Radio: "+radio,String.format("%.2f",resultado)+" m2");
        o.guardar();

        return resultado;
    }

    public static Double operacionVolumenEsfera(String _radio){
        Double resultado, radio;
        radio = Double.parseDouble(_radio);
        resultado = (4/3) * 3.14159265359 * Math.pow(radio,3);

        Operacion o = new Operacion("Volúmen de la esfera","Radio: "+radio,String.format("%.2f",resultado)+" m3");
        o.guardar();

        return resultado;
    }

    public static Double operacionVolumenCilindro(String _radio,String _altura){
        Double resultado, radio, altura;
        radio = Double.parseDouble(_radio);
        altura = Double.parseDouble(_altura);
        resultado = 3.14159265359 * Math.pow(radio,2) * altura;

        Operacion o = new Operacion("Volúmen del cilindro","Radio: "+radio+ "\nAltura: "+altura,String.format("%.2f",resultado)+" m3");
        o.guardar();

        return  resultado;
    }

    public static Double operacionVolumenCono(String _radio, String _altura){
        Double resultado, radio, altura;
        radio = Double.parseDouble(_radio);
        altura = Double.parseDouble(_altura);
        resultado = (0.3333333333 * 3.14159265359) * (Math.pow(radio,2) * altura);

        Operacion o = new Operacion("Volúmen del cono","Radio: "+radio+ "\nAltura: "+altura,String.format("%.2f",resultado)+" m3");
        o.guardar();

        return resultado;
    }

    public static Double operacionVolumenCubo(String _lado){
        Double resultado, lado;
        lado = Double.parseDouble(_lado);
        resultado = Math.pow(lado,lado);

        Operacion o = new Operacion("Volúmen del cubo","Lado: "+lado,String.format("%.2f",resultado)+" m3");
        o.guardar();

        return resultado;
    }
}
