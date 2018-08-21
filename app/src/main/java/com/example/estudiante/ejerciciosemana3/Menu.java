package com.example.estudiante.ejerciciosemana3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Menu extends AppCompatActivity {

    @Override
    private String usuario;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        Intent intento = getIntent();
        usuario = intento.getStringExtra("usuario");
        findViewById(R.id.tv_user_name).setText(usuario);
    }
}
