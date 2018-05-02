package com.zannier.app.exa02_pdm_zvargas.Entidad;

import android.support.v7.widget.RecyclerView;
import android.view.View;

public class Venta {
    private String nombre;
    private Double precio;
    private int cantidad;
    private Double subtotal;

    public Venta() {

    }

    public Venta(String nombre, Double precio, int cantidad, Double subtotal) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.subtotal = subtotal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Double subtotal) {
        this.subtotal = subtotal;
    }
}
