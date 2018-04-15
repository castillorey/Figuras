package com.kevinmcr.figuras;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {

    @Test
    public void operacionAreaCuadrado_isCorrect() throws Exception {
        //Cuadrado de lado 2.5
        Double resultadoEsperado = 6.25;
        assertEquals(resultadoEsperado, Metodos.operacionAreaCuadrado("2.5"));
    }

    @Test
    public void operacionAreaRectangulo_isCorrect() throws Exception {
        //Rectangulo de base 4 y altura 10
        Double resultadoEsperado = 40.0;
        assertEquals(resultadoEsperado, Metodos.operacionAreaRectangulo("4","10"));
    }

    @Test
    public void operacionAreaTriangulo_isCorrect() throws Exception {
        //Triangulo de base 2 y altura 5.2
        Double resultadoEsperado = 5.2;
        assertEquals(resultadoEsperado, Metodos.operacionAreaTriangulo("2","5.2"));
    }

    @Test
    public void operacionAreaCirculo_isCorrect() throws Exception {
        //Circulo de radio 7.3
        Double resultadoEsperado = 167.4154725098111;
        assertEquals(resultadoEsperado, Metodos.operacionAreaCirculo("7.3"));
    }

    @Test
    public void operacionVolumenEsfera_isCorrect() throws Exception {
        //Esfera de radio 5
        Double resultadoEsperado = 523.5987755970243;
        assertEquals(resultadoEsperado, Metodos.operacionVolumenEsfera("5"));
    }

    @Test
    public void operacionVolumenCilindro_isCorrect() throws Exception {
        //Cilindro de radio 2.2 y altura 12
        Double resultadoEsperado = 182.46370132050725;
        assertEquals(resultadoEsperado, Metodos.operacionVolumenCilindro("2.2","12"));
    }

    @Test
    public void operacionVolumenCono_isCorrect() throws Exception {
        //Cono de radio  radio 4.5 y altura 3
        Double resultadoEsperado = 63.61725122883578;
        assertEquals(resultadoEsperado, Metodos.operacionVolumenCono("4.5","3"));
    }

    @Test
    public void operacionVolumenCubo_isCorrect() throws Exception {
        //Cubo de radio  lado 20
        Double resultadoEsperado = 8000.0;
        assertEquals(resultadoEsperado, Metodos.operacionVolumenCubo("20"));
    }


}