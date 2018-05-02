package com.zannier.app.exa02_pdm_zvargas.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.zannier.app.exa02_pdm_zvargas.R;

public class CustomVenta extends AppCompatActivity {

    private TextView nombrePro;
    private TextView cantidadPro;
    private TextView precioPro;
    private TextView subTotal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.custom_venta);

        nombrePro = (TextView)findViewById(R.id.nombrePro);
        cantidadPro = (TextView)findViewById(R.id.cantidadPro);
        precioPro = (TextView)findViewById(R.id.precioPro);
        subTotal = (TextView)findViewById(R.id.subTotal);
    }
}
