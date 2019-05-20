package com.example.spinner_con_cristianhenao;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtViewEstado;
    Spinner spinnerDias;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtViewEstado = findViewById(R.id.txtViewEstado);
        spinnerDias = findViewById(R.id.spinnerDias);

        ArrayAdapter<CharSequence> myAdaptter = ArrayAdapter.createFromResource(this,R.array.combo_dias,android.R.layout.simple_spinner_item
        );

        spinnerDias.setAdapter(myAdaptter);

    }
}
