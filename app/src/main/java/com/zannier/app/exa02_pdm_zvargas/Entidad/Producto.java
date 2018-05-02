package com.zannier.app.exa02_pdm_zvargas.Entidad;

import android.support.v7.widget.RecyclerView;
import android.view.View;

public class Producto{


    private String nomProducto;
    private String precio;
    private String stock;
    private int Imgproduct;

    public Producto() {

    }

    public Producto(String nomProducto, String precio, String stock, int imgproduct) {
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

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    public int getImgproduct() {
        return Imgproduct;
    }

    public void setImgproduct(int imgproduct) {
        Imgproduct = imgproduct;
    }
}
