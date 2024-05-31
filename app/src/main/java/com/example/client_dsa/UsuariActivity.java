package com.example.client_dsa;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Toast;
import android.content.Intent;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.client_dsa.Classes.LoginComp;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class UsuariActivity extends AppCompatActivity {
    private Button enrereButton;
    String nomUsuari;
    TextView nombre;
    TextView apellido;
    TextView diners;

    //public ProgressBar progressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usuari);

        //Codi per recollir el username del login i imprimirlo
        Intent intent = getIntent();
        nomUsuari = intent.getStringExtra("username");
        //Codi per imprimir el username rebut del loginActivity
        TextView usernametxt = findViewById(R.id.nomusuari1);
        usernametxt.setText(nomUsuari);

        enrereButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(UsuariActivity.this, PrincipalActivity.class);
                startActivity(intent);
            }
        });


    }
}
