package com.zannier.app.exa02_pdm_zvargas.view;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
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
    ProductAdapter productAdapter;

    public ProductoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View view = inflater.inflate(R.layout.fragment_producto, container, false);

        recyclerView= (RecyclerView) view.findViewById(R.id.recyclerproduct);
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(),3));

        productoList = new ArrayList<>();

        productAdapter = new ProductAdapter(getContext(),productoList);
        recyclerView.setAdapter(productAdapter);

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        database.getReference().child("producto").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                productoList.removeAll(productoList);
                for (DataSnapshot snapshot: dataSnapshot.getChildren()){
                    Producto producto = snapshot.getValue(Producto.class);
                    productoList.add(producto);
                }
                productAdapter.notifyDataSetChanged();
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                Log.d("ERROR", "loadPost:onCancelled", databaseError.toException());
            }
        });

        return view;
    }




}
