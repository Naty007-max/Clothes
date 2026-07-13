package com.mycompany.models;

public class PrendaDeVestir {

    private int codigo;
    private String nombre;
    private String categoria;
    private String talla;
    private String marca;
    private int cantidadDisponible;
    private double precio;

   

    public PrendaDeVestir(int codigo, String nombre, String categoria,
                          String talla, String marca,
                          int cantidadDisponible, double precio) {

        this.codigo = codigo;
        this.nombre = nombre;
        this.categoria = categoria;
        this.talla = talla;
        this.marca = marca;
        this.cantidadDisponible = cantidadDisponible;
        this.precio = precio;
    }

    // Getters y Setters
public int getCodigo(){
    return codigo;
}

public void setCodigo(int codigo){
    this.codigo = codigo;
}


public String getNombre() {
    return nombre;
}

public void setNombre(String nombre) {
    this.nombre = nombre;
}

public String getCategoria() {
    return categoria;
}

public void setCategoria(String categoria) {
    this.categoria = categoria;
}

public String getTalla() {
    return talla;
}

public void setTalla(String talla) {
    this.talla = talla;
}



public String getMarca() {
    return marca;
}

public void setMarca(String marca) {
    this.marca = marca;
}

public int getCantidadDisponible() {
    return cantidadDisponible;
}

public void setCantidadDisponible(int cantidadDisponible) {
    this.cantidadDisponible = cantidadDisponible;
}

public double getPrecio() {
    return precio;
}

public void setPrecio(double precio) {
    this.precio = precio;
}

    @Override
    public String toString() {
        return "PrendaDeVestir{" +
                "codigo=" + codigo +
                ", nombre='" + nombre + '\'' +
                ", categoria='" + categoria + '\'' +
                ", talla='" + talla + '\'' +
                ", marca='" + marca + '\'' +
                ", cantidadDisponible=" + cantidadDisponible +
                ", precio=" + precio +
                '}';
    }
}