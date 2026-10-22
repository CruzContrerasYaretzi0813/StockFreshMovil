package com.example.stockfreshmovil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class IniciarSesion extends AppCompatActivity implements View.OnClickListener {

    TextView VolverRegistro;
    Button IniciarSesion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_iniciar_sesion);

        VolverRegistro = findViewById(R.id.tvNotengoCuenta);
        VolverRegistro.setOnClickListener(this);

        IniciarSesion = findViewById(R.id.btnIniciarSesionEnviar);
        IniciarSesion.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String accion = ((TextView)v).getText().toString();

        if(accion.equals("¿No tienes cuenta? Registrate")){
            Intent volverRegistro = new Intent(this, Registro.class);
            startActivity(volverRegistro);
        }
        String accion2 = ((Button)v).getText().toString();
        if(accion2.equals("Iniciar Sesión")){
            Intent Home = new Intent(this, Home.class);
            startActivity(Home);
        }
    }
}