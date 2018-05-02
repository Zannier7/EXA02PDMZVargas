package com.zannier.app.exa02_pdm_zvargas.view;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.zannier.app.exa02_pdm_zvargas.Entidad.Venta;
import com.zannier.app.exa02_pdm_zvargas.R;
import com.zannier.app.exa02_pdm_zvargas.model.VentaAdapter;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class VentaFragment extends Fragment {

    ArrayList<Venta> listVenta2;
    RecyclerView recyclerView;

    public VentaFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View view = inflater.inflate(R.layout.fragment_venta, container, false);

        listVenta2 = new ArrayList<>();

        recyclerView = (RecyclerView) view.findViewById(R.id.listVenta);
        
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        VentaAdapter ventaAdapter = new VentaAdapter(listVenta2);
        recyclerView.setAdapter(ventaAdapter);
        
        llenarVenta();
        
        

        return view;
    }

    private void llenarVenta() {
    }

}
