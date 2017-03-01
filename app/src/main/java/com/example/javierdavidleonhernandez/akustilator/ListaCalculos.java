package com.example.javierdavidleonhernandez.akustilator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListaCalculos extends AppCompatActivity {

    ListView Calculos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_calculos);

        Calculos = (ListView) findViewById(R.id.calculos);
        ArrayAdapter<CharSequence> adaptador = ArrayAdapter.createFromResource(this, R.array.Calculos, android.R.layout.simple_list_item_1);
        Calculos.setAdapter(adaptador);
        Calculos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position==0){
                    Intent myintent1 = new Intent(view.getContext(),Acustica.class);
                    startActivityForResult(myintent1,0);
                }

            }
        });

    }
}
