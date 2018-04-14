package com.kevinmcr.figuras;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Areas extends AppCompatActivity {
    private ListView lv;
    private String [] opc;
    private Intent in;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_areas);
        lv = findViewById(R.id.lstAreas);
        opc = getResources().getStringArray(R.array.opciones_areas);

        ArrayAdapter<String> adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,opc);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch(i){
                    case 0:
                        in = new Intent(Areas.this, RegistroCuadrado.class);
                        startActivity(in);
                    break;

                    case 1:
                        in = new Intent(Areas.this, RegistroRectangulo.class);
                        startActivity(in);
                        break;
                    case 2:
                        in = new Intent(Areas.this, RegistroTriangulo.class);
                        startActivity(in);
                        break;
                    case 3:
                        in = new Intent(Areas.this, RegistroCirculo.class);
                        startActivity(in);
                        break;
                }
            }
        });
    }
}
