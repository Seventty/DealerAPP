package com.example.dealer;

public class Autos {
    public String nombre;
    public String año;
    public String precio;
    public Autos (String nombre, String año, String precio){
        this.nombre = nombre;
        this.año = año;
        this.precio = precio;
    }
    public String getAuto(){
        return nombre;
    }
    public String getAño(){
        return año;
    }
    public String getPrecio(){
        return precio;
    }
}
