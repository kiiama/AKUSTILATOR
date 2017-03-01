package com.example.javierdavidleonhernandez.akustilator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Acustica extends AppCompatActivity {


     ListView CalculosAcustica;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acustica);



        CalculosAcustica = (ListView) findViewById(R.id.calculos_Acustica);
        ArrayAdapter<CharSequence> adaptador = ArrayAdapter.createFromResource(this, R.array.CalculosAcustica, android.R.layout.simple_list_item_1);
        CalculosAcustica.setAdapter(adaptador);
        CalculosAcustica.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position==0){
                    Intent myintent1 = new Intent(view.getContext(),C_Basicos.class);
                    startActivityForResult(myintent1,0);
                }

                if (position==1){
                    Intent myintent1 = new Intent(view.getContext(),TiempoReverberacion.class);
                    startActivityForResult(myintent1,0);
                }
            }
        });






    }
}
