package com.zannier.app.exa02_pdm_zvargas.Entidad;

public class Producto {

    private int idproducto;
    private String nomProducto;
    private Double precio;
    private int stock;

    public Producto() {
    }

    public Producto(int idproducto, String nomProducto, Double precio, int stock) {
        this.idproducto = idproducto;
        this.nomProducto = nomProducto;
        this.precio = precio;
        this.stock = stock;
    }

    public int getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(int idproducto) {
        this.idproducto = idproducto;
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
}
