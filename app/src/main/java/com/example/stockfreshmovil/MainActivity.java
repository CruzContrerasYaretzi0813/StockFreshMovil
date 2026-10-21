package com.example.stockfreshmovil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView imagenLogo;
    Button btnregistro, btniniciasesion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        imagenLogo = findViewById(R.id.imgCenter);
        imagenLogo.setImageResource(R.drawable.logom);

        btnregistro = findViewById(R.id.btnRegistrar);
        btnregistro.setOnClickListener(this);

        btniniciasesion = findViewById(R.id.btnIniciarSesion);
        btniniciasesion.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        //accion --> Acción que realizara el botón.
        String accion = ((Button)v).getText().toString();

        if(accion.equals("Registrarse")){
            //pt --> Pantalla.
            Intent ptRegistro = new Intent(this, Registro.class);
            startActivity(ptRegistro);
        } else if (accion.equals("Inicia Sesión")){
            Intent ptIniciaSesion = new Intent(this, IniciarSesion.class);
            startActivity(ptIniciaSesion);
        }
    }
}