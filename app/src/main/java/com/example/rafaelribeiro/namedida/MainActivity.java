package com.example.rafaelribeiro.namedida;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Button consultar = (Button) findViewById(R.id.consultar);

        consultar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {


                Intent it = new Intent(MainActivity.this, ConsultarPedidos.class);
                startActivity(it);
            }

            });

        Button info = (Button) findViewById(R.id.info);

        info.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this, Info.class);
                startActivity(it);
            }

        });


        Button clientes = (Button) findViewById(R.id.clientes);

        clientes.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this, Clientes.class);
                startActivity(it);
            }

        });




    }
}
