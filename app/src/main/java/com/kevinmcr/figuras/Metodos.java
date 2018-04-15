package com.kevinmcr.figuras;

import android.graphics.Path;

/**
 * Created by Castilloreyes on 14/04/18.
 */

public class Metodos {

    public static Operacion operacionAreaCuadrado(String _lado){
        Double resultado, lado;
        lado = Double.parseDouble(_lado);
        resultado = Math.pow(lado,lado);
        Operacion o = new Operacion("Área del cuadrado","Lado: "+lado,resultado+" m2");
        return o;
    }

    public static Operacion operacionAreaRectangulo(String _base,String _altura){
        Double resultado, base, altura;
        base = Double.parseDouble(_base);
        altura = Double.parseDouble(_altura);
        resultado = base * altura;

        Operacion o = new Operacion("Área del rectangulo","Base: "+base+"\nAltura: "+altura,resultado+" m2");

        return o;
    }

    public static Operacion operacionAreaTriangulo(String _base,String _altura){
        Double resultado, base, altura;
        base = Double.parseDouble(_base);
        altura = Double.parseDouble(_altura);
        resultado = (base * altura)/2;

        Operacion o = new Operacion("Área del rectangulo","Base: "+base+"\nAltura: "+altura,resultado+" m2");

        return o;
    }

    public static Operacion operacionAreaCirculo(String _radio){
        Double resultado, radio;
        radio = Double.parseDouble(_radio);
        resultado = 3.14159265359 * Math.pow(radio,2);

        Operacion o = new Operacion("Área del circulo","Radio: "+radio,resultado+" m2");
        return o;
    }

    public static Operacion operacionVolumenEsfera(String _radio){
        Double resultado, radio;
        radio = Double.parseDouble(_radio);
        resultado = (4/3) * 3.14159265359 * Math.pow(radio,3);

        Operacion o = new Operacion("Volúmen de la esfera","Radio: "+radio,resultado+" m3");

        return o;
    }

    public static Operacion operacionVolumenCilindro(String _radio,String _altura){
        Double resultado, radio, altura;
        radio = Double.parseDouble(_radio);
        altura = Double.parseDouble(_altura);
        resultado = 3.14159265359 * Math.pow(radio,2) * altura;

        Operacion o = new Operacion("Volúmen del cilindro","Radio: "+radio+ "\nAltura: "+altura,resultado+" m3");

        return  o;
    }

    public static Operacion operacionVolumenCono(String _radio, String _altura){
        Double resultado, radio, altura;
        radio = Double.parseDouble(_radio);
        altura = Double.parseDouble(_altura);
        resultado = (1/3) * 3.14159265359 * Math.pow(radio,2) * altura;

        Operacion o = new Operacion("Volúmen del cono","Radio: "+radio+ "\nAltura: "+altura,resultado+" m3");

        return o;
    }

    public static Operacion operacionVolumenCubo(String _lado){
        Double resultado, lado;
        lado = Double.parseDouble(_lado);
        resultado = Math.pow(lado,lado);

        Operacion o = new Operacion("Volúmen del cubo","Lado: "+lado,resultado+" m3");

        return o;
    }
}
