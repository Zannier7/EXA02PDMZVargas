package com.zannier.app.exa02_pdm_zvargas.Entidad;

public class Venta {
    private int idventa;
    private String fecha;
    private int idvendedor;

    public Venta() {
    }

    public Venta(int idventa, String fecha, int idvendedor) {
        this.idventa = idventa;
        this.fecha = fecha;
        this.idvendedor = idvendedor;
    }

    public int getIdventa() {
        return idventa;
    }

    public void setIdventa(int idventa) {
        this.idventa = idventa;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getIdvendedor() {
        return idvendedor;
    }

    public void setIdvendedor(int idvendedor) {
        this.idvendedor = idvendedor;
    }
}
