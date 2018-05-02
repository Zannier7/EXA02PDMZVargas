package com.zannier.app.exa02_pdm_zvargas.Entidad;

import android.support.v7.widget.RecyclerView;
import android.view.View;

public class Producto{


    private String nomProducto;
    private Double precio;
    private int stock;
    private int Imgproduct;

    public Producto() {
    }

    public Producto(String nomProducto, Double precio, int stock, int imgproduct) {
        this.nomProducto = nomProducto;
        this.precio = precio;
        this.stock = stock;
        Imgproduct = imgproduct;
    }

    public String getNomProducto() {
        return nomProducto;
    }

    public void setNomProducto(String nomProducto) {
        this.nomProducto = nomProducto;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getImgproduct() {
        return Imgproduct;
    }

    public void setImgproduct(int imgproduct) {
        Imgproduct = imgproduct;
    }
}
