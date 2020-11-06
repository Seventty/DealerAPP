package com.example.dealer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class TodoTerrenos extends AppCompatActivity {

    private ListView listview;
    Adaptador adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_todo_terrenos);
        listview = (ListView) findViewById(R.id.item);
        adapter = new Adaptador(this, GetArray());
        listview.setAdapter(adapter);
    }
    private ArrayList<Autos> GetArray(){
        ArrayList<Autos> items = new ArrayList<>();
        items.add(new Autos("Jeep Patriot", "Año: 2015", "12,893 Dólares."));
        items.add(new Autos("Jeep Grand CHerokee", "Año: 2017", "20,242 Dólares."));
        items.add(new Autos("Jeep Grand CHerokee", "Año: 2016", "21,672 Dólares."));
        items.add(new Autos("Toyota 4Runner", "Año: 2016", "38,229 Dólares."));
        items.add(new Autos("Land Rover Range", "Año: 2014", "33,636"));
        return items;
    }
}
