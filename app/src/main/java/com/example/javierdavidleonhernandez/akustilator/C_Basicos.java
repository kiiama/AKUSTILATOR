package com.example.javierdavidleonhernandez.akustilator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class C_Basicos extends AppCompatActivity {


    EditText et_velocidad,et_frecuencia,et_longitud_λ;
    Spinner Formulas;
    String[] FormulasBasicas ={"Formulas","C=f*λ","f=C/λ","λ=C/f"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c__basicos);





        Formulas=(Spinner)findViewById(R.id.formulasbasicas);
        ArrayAdapter<String> adap_FormulasBasicas = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,FormulasBasicas);
        Formulas.setAdapter(adap_FormulasBasicas);

        Formulas.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                switch (position){
                   case 1:
                    /*    float frecuencia=Float.parseFloat(et_frecuencia.getText().toString());
                        float longitud=Float.parseFloat(et_longitud_λ.getText().toString());
                        float velocidad = Float.parseFloat(et_velocidad.getText().toString());
                        velocidad= frecuencia*longitud;
                        et_velocidad.setText(String.valueOf(velocidad));
                        break;
                    case 2:
                        frecuencia= velocidad/longitud;
                        et_frecuencia.setText(String.valueOf(frecuencia));
                        break;
                    case 3:
                        longitud= velocidad/frecuencia;
                        et_longitud_λ.setText(String.valueOf(longitud));
                        break;*/
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


    }
}
