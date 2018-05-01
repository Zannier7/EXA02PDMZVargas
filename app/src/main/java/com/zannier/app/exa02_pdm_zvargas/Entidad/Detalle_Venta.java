package com.zannier.app.exa02_pdm_zvargas.Entidad;

public class Detalle_Venta {

    private int iddetalle_venta;
    private int idventa;
    private int idproducto;
    private Double precio;
    private int cantidad;

    public Detalle_Venta() {
    }

    public Detalle_Venta(int iddetalle_venta, int idventa, int idproducto, Double precio, int cantidad) {
        this.iddetalle_venta = iddetalle_venta;
        this.idventa = idventa;
        this.idproducto = idproducto;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public int getIddetalle_venta() {
        return iddetalle_venta;
    }

    public void setIddetalle_venta(int iddetalle_venta) {
        this.iddetalle_venta = iddetalle_venta;
    }

    public int getIdventa() {
        return idventa;
    }

    public void setIdventa(int idventa) {
        this.idventa = idventa;
    }

    public int getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(int idproducto) {
        this.idproducto = idproducto;
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
}
