package com.zannier.app.exa02_pdm_zvargas.Entidad;

public class Vendedor {
    private String nombre;
    private String apellido;
    private String pass;
    private int idvendedor;

    public Vendedor() {
    }

    public Vendedor(String nombre, String apellido, String pass, int idvendedor) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.pass = pass;
        this.idvendedor = idvendedor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public int getIdvendedor() {
        return idvendedor;
    }

    public void setIdvendedor(int idvendedor) {
        this.idvendedor = idvendedor;
    }
}
