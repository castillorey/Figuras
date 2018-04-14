package com.kevinmcr.figuras;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.ArrayList;

public class OpRealizadas extends AppCompatActivity {
    private TableLayout tabla;
    private ArrayList<Operacion> operaciones;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operaciones);
        tabla = findViewById(R.id.tabla);
        operaciones = Datos.obtener();

        for (int i = 0; i < operaciones.size(); i++) {
            //Nueva fila
            TableRow fila = new TableRow(this);

            //Se crean las columanas
            TextView col1 = new TextView(this);
            TextView col2 = new TextView(this);
            TextView col3 = new TextView(this);
            TextView col4 = new TextView(this);

            //Valores de las columnas
            col1.setText("" + (i+1));
            col2.setText(operaciones.get(i).getOperacion());
            col3.setText(operaciones.get(i).getDatos());
            col4.setText(operaciones.get(i).getResultado());

            //Se agregan los valores de las columnas a la nueva fila
            fila.addView(col1);
            fila.addView(col2);
            fila.addView(col3);
            fila.addView(col4);

            //Se agrega fila a la tabla
            tabla.addView(fila);
        }
    }
}
