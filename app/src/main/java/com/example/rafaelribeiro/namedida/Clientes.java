package com.example.rafaelribeiro.namedida;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Clientes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consultar_clientes);


        Button novo_cliente = (Button) findViewById(R.id.novo_cliente);

        novo_cliente.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(Clientes.this, Cadastrar_clientes.class);
                startActivity(it);
            }


            });

        Button voltar = (Button) findViewById(R.id.voltar);

        voltar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(Clientes.this, MainActivity.class);
                startActivity(it);
            }


        });









        }

    }


