package com.srcarrillo.googlemaps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView titulo, latitud, longitud, apodo;
    private EditText txtLatitud, txtLongitud, txtApodo;
    private Button btnLimpiar, btnMapa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtLatitud = findViewById(R.id.txtLatitud);
        txtLongitud = findViewById(R.id.txtLongitud);
        txtApodo = findViewById(R.id.txtApodo);
        btnMapa = findViewById(R.id.btnMapa);
        btnLimpiar = findViewById(R.id.btnLimpiar);

        btnMapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float lon, lat;
                String Nombre;

                lat = Float.parseFloat(txtLatitud.getText().toString());
                lon = Float.parseFloat(txtLongitud.getText().toString());
                Nombre = txtApodo.getText().toString();

                Intent intent = new Intent(MainActivity.this, MapsActivity.class);
                intent.putExtra("Latitud",lat);
                intent.putExtra("Longitud",lon);
                intent.putExtra("Nombre",Nombre);
                startActivity(intent);

            }
        });
    }
}