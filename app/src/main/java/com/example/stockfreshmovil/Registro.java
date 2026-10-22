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

import org.w3c.dom.Text;

public class Registro extends AppCompatActivity implements View.OnClickListener {

    TextView VolverInicioSesion;
    Button Registro;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_registro);

        VolverInicioSesion = findViewById(R.id.tvYatengocuenta);
        VolverInicioSesion.setOnClickListener(this);

        Registro = findViewById(R.id.btnRegristrarseEnviar);
        Registro.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String accion = ((TextView)v).getText().toString();

        if (accion.equals("¿Ya tienes cuenta? Inicia sesión")){
            Intent volverInicioSesion = new Intent(this, IniciarSesion.class);
            startActivity(volverInicioSesion);
        }

        String accion2 = ((Button)v).getText().toString();
        if(accion2.equals("Registrarse")){
            Intent Home = new Intent(this, Home.class);
            startActivity(Home);
        }
    }
}