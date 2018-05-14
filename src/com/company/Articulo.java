package com.company;

public class Articulo {
    private int clave;
    private String descripcion;
    private double price;
    private String caducidad;
    private int cantLista;

    public int getStock() {
        return stock;
    }

    private int stock;

    public Articulo() {
    }

    public Articulo(int clave, String descripcion, double price, String caducidad, int stock) {
        this.clave = clave;
        this.descripcion = descripcion;
        this.price = price;
        this.caducidad = caducidad;
        this.stock = stock;
        this.cantLista = 0;
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }


    public void setPrice(double price) {
        this.price = price;
    }


    public void setCaducidad(String caducidad) {
        this.caducidad = caducidad;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString(){
        return "|| Producto: " + getDescripcion() + "|| Precio: " + getPrice() + " ||" + " Cantidad: " + getCantLista() + " ||";
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getCantLista() {
        return cantLista;
    }

    public void setCantLista(int cantLista) {
        this.cantLista = cantLista;
    }
}
