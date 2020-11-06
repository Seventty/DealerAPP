package com.example.dealer;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class Adaptador extends BaseAdapter {

    private Context context;
    private ArrayList<Autos> listItem;

    public Adaptador(Context context, ArrayList<Autos> listItem){
        this.context = context;
        this.listItem = listItem;
    }


    @Override
    public int getCount() {
        return listItem.size();
    }

    @Override
    public Object getItem(int position) {
        return listItem.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Autos item = (Autos) getItem(position);
        convertView = LayoutInflater.from(context).inflate(R.layout.item, null);
        TextView marca = convertView.findViewById(R.id.marca);
        TextView fecha = convertView.findViewById(R.id.fecha);
        TextView precio = convertView.findViewById(R.id.precio);

        marca.setText(item.getAuto());
        fecha.setText(item.getAño());
        precio.setText(item.getPrecio());
        return convertView;
    }
}
