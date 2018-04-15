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
        //Cuadrado de lado 4
        Operacion expectedOp = new Operacion("Área del cuadrado", "Lado: 4","16 m2");
        assertEquals(expectedOp, Metodos.operacionAreaCuadrado("4"));
    }
}