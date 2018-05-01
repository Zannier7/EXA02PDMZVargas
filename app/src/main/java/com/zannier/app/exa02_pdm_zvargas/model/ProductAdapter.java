package com.zannier.app.exa02_pdm_zvargas.model;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.zannier.app.exa02_pdm_zvargas.Entidad.Producto;
import com.zannier.app.exa02_pdm_zvargas.R;

import org.w3c.dom.Text;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.MyViewHolder>{

    private Context context;
    private List<Producto> pData;

    public ProductAdapter(Context context, List<Producto> pData) {
        this.context = context;
        this.pData = pData;
    }



    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        LayoutInflater mInflater = LayoutInflater.from(context);
        view = mInflater.inflate(R.layout.productos_cardview,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.stock.setText(pData.get(position).getStock());
        holder.nomproduct.setText(pData.get(position).getNomProducto());
        holder.imageView.setImageResource(pData.get(position).getImgproduct());
        holder.precio.setText(pData.get(position).getPrecio());
    }

    @Override
    public int getItemCount() {
        return pData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        ImageView imageView;
        TextView nomproduct;
        TextView stock;
        TextView precio;

        public MyViewHolder(View itemView) {
            super(itemView);

            imageView = (ImageView) itemView.findViewById(R.id.img_product);
            nomproduct = (TextView) itemView.findViewById(R.id.nomproduct);
            stock = (TextView) itemView.findViewById(R.id.stock);
            precio = (TextView) itemView.findViewById(R.id.precio);

        }
    }
}
