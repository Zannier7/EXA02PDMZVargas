package com.zannier.app.exa02_pdm_zvargas.interfaces;

public interface LoginInterface {

    interface Model{
        void validarUsuario(String userName,String passUser);
    }
    interface Presentator{
        void validarUsuario(String userName, String passUser);
    }
    interface View{
        void iniciarSesion(String userName,String passUser);
    }
}
