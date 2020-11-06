package com.example.dealer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button1, button2, button3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Actividad();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Actividad2();
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Actividad3();
            }
        });
    }

    private void Actividad() {
        Toast.makeText(this, "Autos sedanes", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, Sedanes.class);
        startActivity(intent);
    }

    private void Actividad2() {
        Toast.makeText(this, "Autos TodoTerreno", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, TodoTerrenos.class);
        startActivity(intent);
    }

    private void Actividad3() {
        Toast.makeText(this, "Autos deportivos", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, Deportivos.class);
        startActivity(intent);
    }

}
