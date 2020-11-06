package com.example.dealer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Deportivos extends AppCompatActivity {

    private ListView listview;
    Adaptador adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deportivos);
        listview = (ListView) findViewById(R.id.item);
        adapter = new Adaptador(this, GetArray());
        listview.setAdapter(adapter);
    }
    private ArrayList<Autos> GetArray(){
        ArrayList<Autos> items = new ArrayList<>();
        items.add(new Autos("Toyota Supra", "Año: 2020", "50,000 Dólares."));
        items.add(new Autos("Ford Mustang Shelbh GT350R", "Año: 2017", "59,140 Dólares."));
        items.add(new Autos("ASton Martin DB11 V8", "Año: 2019", "250,000 Dólares."));
        items.add(new Autos("Toyota Subaru BRZ", "Año: 2018", "25,795 Dólares."));
        items.add(new Autos("Lamborghini Huracan EVO ", "Año: 2020", "600,000 Dólares."));
        return items;
    }
}
