package com.zannier.app.exa02_pdm_zvargas.model;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.zannier.app.exa02_pdm_zvargas.Entidad.DetalleVenta;
import com.zannier.app.exa02_pdm_zvargas.Entidad.Producto;
import com.zannier.app.exa02_pdm_zvargas.Entidad.Venta;
import com.zannier.app.exa02_pdm_zvargas.R;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class VentaAdapter extends RecyclerView.Adapter<VentaAdapter.ViewHolderVenta>{

    ArrayList<Venta> ventas;

    public VentaAdapter(ArrayList<Venta> ventas) {
        this.ventas = ventas;
    }

    @NonNull
    @Override
    public ViewHolderVenta onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fragment_venta,null,false);

        return new ViewHolderVenta(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderVenta holder, int position) {
        holder.nombrePro.setText(ventas.get(position).getNombre());
        holder.cantidadPro.setText(ventas.get(position).getCantidad());
        holder.cantidadPro.setText((int) ventas.get(position).getSubtotal().doubleValue());
        holder.precioPro.setText((int) ventas.get(position).getPrecio().doubleValue());

    }

    @Override
    public int getItemCount() {
        return ventas.size();
    }


    public class ViewHolderVenta extends RecyclerView.ViewHolder {

        TextView nombrePro,cantidadPro,precioPro,subTotal;

        public ViewHolderVenta(View itemView) {
            super(itemView);

            nombrePro = (TextView)itemView.findViewById(R.id.nombrePro);
            cantidadPro = (TextView)itemView.findViewById(R.id.cantidadPro);
            precioPro = (TextView)itemView.findViewById(R.id.precioPro);
            subTotal = (TextView)itemView.findViewById(R.id.subTotal);
        }
    }
}
