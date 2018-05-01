package com.zannier.app.exa02_pdm_zvargas.view;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.zannier.app.exa02_pdm_zvargas.Entidad.Producto;
import com.zannier.app.exa02_pdm_zvargas.R;
import com.zannier.app.exa02_pdm_zvargas.model.ProductAdapter;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class ProductoFragment extends Fragment {


    ArrayList<Producto> productoList;
    RecyclerView recyclerView;


    public ProductoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View view = inflater.inflate(R.layout.fragment_producto, container, false);

        productoList = new ArrayList<>();

        productoList.add(new Producto("asdas","5.20","2",R.drawable.p1));
        productoList.add(new Producto("asdasd","5.20","2",R.drawable.p2));
        productoList.add(new Producto("asdas","3.4","3",R.drawable.p3));;
        productoList.add(new Producto("asdasd","5.20","2",R.drawable.p2));
        productoList.add(new Producto("asdas","3.4","3",R.drawable.p3));;
        productoList.add(new Producto("asdasd","5.20","2",R.drawable.p2));
        productoList.add(new Producto("asdas","3.4","3",R.drawable.p3));;
        productoList.add(new Producto("asdasd","5.20","2",R.drawable.p2));
        productoList.add(new Producto("asdas","3.4","3",R.drawable.p3));;
        productoList.add(new Producto("asdasd","5.20","2",R.drawable.p2));
        productoList.add(new Producto("asdas","3.4","3",R.drawable.p3));;
        productoList.add(new Producto("asdasd","5.20","2",R.drawable.p2));
        productoList.add(new Producto("asdas","3.4","3",R.drawable.p3));;
        productoList.add(new Producto("asdasd","5.20","2",R.drawable.p2));
        productoList.add(new Producto("asdas","3.4","3",R.drawable.p3));;
        productoList.add(new Producto("asdasd","5.20","2",R.drawable.p2));
        productoList.add(new Producto("asdas","3.4","3",R.drawable.p3));;
        productoList.add(new Producto("asdasd","5.20","2",R.drawable.p2));
        productoList.add(new Producto("asdas","3.4","3",R.drawable.p3));;
        productoList.add(new Producto("asdasd","5.20","2",R.drawable.p2));
        productoList.add(new Producto("asdas","3.4","3",R.drawable.p3));;
        productoList.add(new Producto("asdasd","5.20","2",R.drawable.p2));
        productoList.add(new Producto("asdas","3.4","3",R.drawable.p3));;
        productoList.add(new Producto("asdasd","5.20","2",R.drawable.p2));
        productoList.add(new Producto("asdas","3.4","3",R.drawable.p3));


        recyclerView= (RecyclerView) view.findViewById(R.id.recyclerproduct);
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(),3));

        ProductAdapter productAdapter = new ProductAdapter(getContext(),productoList);
        recyclerView.setAdapter(productAdapter);




        return view;
    }




}
