package com.example.javierdavidleonhernandez.akustilator;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {


    ImageButton Bt_Calculos;    //declaramos el boton


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Bt_Calculos = (ImageButton) findViewById(R.id.bt_calculos);   //instanciamos el boton
        Bt_Calculos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ListaCalculos.class);
                startActivity(intent);
            }
        });
    }

    // BOTON WEB
    public void bt_web (View view){
        Intent bt_webIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://kiiamasas.wixsite.com/kiiama"));
    startActivity(bt_webIntent);
    }


    }
