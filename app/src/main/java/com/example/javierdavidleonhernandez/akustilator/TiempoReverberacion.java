package com.example.javierdavidleonhernandez.akustilator;

import android.icu.text.DecimalFormat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import static java.lang.Math.log;


public class TiempoReverberacion extends AppCompatActivity {

    EditText et_alto, et_ancho, et_profundo, et_techo, et_piso, et_frente, et_posterior, et_izquierda, et_derecha;
    TextView tv_res_sabine, tv_res_eyring;

    Spinner material_techo, material_piso, material_frente, material_posterior, material_izquierda, material_derecha;
    String[] coef_abs_material = {"Materiales", "Concreto", "Madera", "Ladrillo"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tiempo_reverberacion);

        material_techo = (Spinner) findViewById(R.id.material_techo);
        ArrayAdapter<String> adap_MaterialTecho = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, coef_abs_material);
        material_techo.setAdapter(adap_MaterialTecho);

        material_techo.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 1:
                        et_techo.setText(String.valueOf("0.9"));
                        break;
                    case 2:
                        et_techo.setText(String.valueOf("0.2"));
                        break;
                    case 3:
                        et_techo.setText(String.valueOf("0.5"));
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        material_piso = (Spinner) findViewById(R.id.material_piso);
        ArrayAdapter<String> adap_MaterialPiso = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, coef_abs_material);
        material_piso.setAdapter(adap_MaterialPiso);

        material_piso.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 1:
                        et_piso.setText(String.valueOf("0.9"));
                        break;
                    case 2:
                        et_piso.setText(String.valueOf("0.2"));
                        break;
                    case 3:
                        et_piso.setText(String.valueOf("0.5"));
                        break;
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        material_frente = (Spinner) findViewById(R.id.material_frente);
        ArrayAdapter<String> adap_MaterialFrente = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, coef_abs_material);
        material_frente.setAdapter(adap_MaterialFrente);

        material_frente.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 1:
                        et_frente.setText(String.valueOf("0.9"));
                        break;
                    case 2:
                        et_frente.setText(String.valueOf("0.2"));
                        break;
                    case 3:
                        et_frente.setText(String.valueOf("0.5"));
                        break;
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        material_posterior = (Spinner) findViewById(R.id.material_posterior);
        ArrayAdapter<String> adap_MaterialPosterior = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, coef_abs_material);
        material_posterior.setAdapter(adap_MaterialPosterior);

        material_posterior.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 1:
                        et_posterior.setText(String.valueOf("0.9"));
                        break;
                    case 2:
                        et_posterior.setText(String.valueOf("0.2"));
                        break;
                    case 3:
                        et_posterior.setText(String.valueOf("0.5"));
                        break;
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        material_izquierda = (Spinner) findViewById(R.id.material_izquierda);
        ArrayAdapter<String> adap_MaterialIzquierda = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, coef_abs_material);
        material_izquierda.setAdapter(adap_MaterialIzquierda);

        material_izquierda.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 1:
                        et_izquierda.setText(String.valueOf("0.9"));
                        break;
                    case 2:
                        et_izquierda.setText(String.valueOf("0.2"));
                        break;
                    case 3:
                        et_izquierda.setText(String.valueOf("0.5"));
                        break;
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        material_derecha = (Spinner) findViewById(R.id.material_derecha);
        ArrayAdapter<String> adap_MaterialDerecha = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, coef_abs_material);
        material_derecha.setAdapter(adap_MaterialDerecha);

        material_derecha.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 1:
                        et_derecha.setText(String.valueOf("0.9"));
                        break;
                    case 2:
                        et_derecha.setText(String.valueOf("0.2"));
                        break;
                    case 3:
                        et_derecha.setText(String.valueOf("0.5"));
                        break;
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        et_alto = (EditText) findViewById(R.id.et_alto);
        et_ancho = (EditText) findViewById(R.id.et_ancho);
        et_profundo = (EditText) findViewById(R.id.et_profundo);
        et_techo = (EditText) findViewById(R.id.et_techo);
        et_piso = (EditText) findViewById(R.id.et_piso);
        et_frente = (EditText) findViewById(R.id.et_frente);
        et_posterior = (EditText) findViewById(R.id.et_posterior);
        et_izquierda = (EditText) findViewById(R.id.et_izquierda);
        et_derecha = (EditText) findViewById(R.id.et_derecha);

        tv_res_sabine = (TextView) findViewById(R.id.tv_res_sabine);
        tv_res_eyring = (TextView) findViewById(R.id.tv_res_eyring);


        Button bt_calcular = (Button) findViewById(R.id.bt_calcular);

        bt_calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Entradas de dimensiones
                float alto = Float.parseFloat(et_alto.getText().toString());
                float ancho = Float.parseFloat(et_ancho.getText().toString());
                float profundo = Float.parseFloat(et_profundo.getText().toString());
                // Entradas de los coeficientes de absorcion
                float abs_techo = Float.parseFloat(et_techo.getText().toString());
                float abs_piso = Float.parseFloat(et_piso.getText().toString());
                float abs_frente = Float.parseFloat(et_frente.getText().toString());
                float abs_posterior = Float.parseFloat(et_posterior.getText().toString());
                float abs_izquierda = Float.parseFloat(et_izquierda.getText().toString());
                float abs_derecha = Float.parseFloat(et_derecha.getText().toString());
                // Calulo de las superficies
                float area_techo = ancho * profundo;
                float area_piso = ancho * profundo;
                float area_frente = alto * ancho;
                float area_posterior = alto * ancho;
                float area_izquierda = alto * profundo;
                float area_derecha = alto * profundo;
                // Calculo de superficie total y Absorcion total media
                float superfie_total = (area_derecha + area_izquierda + area_frente + area_posterior + area_piso + area_techo);
                float ABSTM = ((area_techo * abs_techo) + (area_piso * abs_piso) + (area_frente * abs_frente) + (area_posterior * abs_posterior) + (area_izquierda * abs_izquierda) + (area_derecha * abs_derecha)) / superfie_total;
                //Constante y Formula de RT60
                float constante = 0.161F;
                float res_sabine = (constante * (alto * ancho * profundo)) / (superfie_total * ABSTM);
                tv_res_sabine.setText(String.format("%.4f",(res_sabine)));
                //Formula Eyring i Norris
                double res_eyring = (constante * (alto * ancho * profundo)) / (superfie_total * (-1 * (log(1 - ABSTM))));
                tv_res_eyring.setText(String.format("%.4f",(res_eyring)));


            }
        });

    }
}