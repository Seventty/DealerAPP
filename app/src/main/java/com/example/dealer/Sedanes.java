package com.example.dealer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Sedanes extends AppCompatActivity {

    private ListView listview;
    Adaptador adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sedanes);
        listview = (ListView) findViewById(R.id.item);
        adapter = new Adaptador(this, GetArray());
        listview.setAdapter(adapter);
    }
    private ArrayList<Autos> GetArray(){
        ArrayList<Autos> items = new ArrayList<>();
        items.add(new Autos("Toyota Corola", "Año: 2015", "600,00 Pesos Dominicanos"));
        items.add(new Autos("Toyota Camry", "Año: 2011", "350,00 Pesos Dominicanos"));
        items.add(new Autos("Kia K5", "Año: 2009", "200,00 Pesos Dominicanos"));
        items.add(new Autos("Honda Civic", "Año: 2018", "550,00 Pesos Dominicanos"));
        items.add(new Autos("Renault Kwid", "Año: 2015", "600,00 Pesos Dominicanos"));
        return items;
    }
}
