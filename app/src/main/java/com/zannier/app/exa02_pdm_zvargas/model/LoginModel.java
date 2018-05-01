package com.zannier.app.exa02_pdm_zvargas.model;

import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.zannier.app.exa02_pdm_zvargas.Entidad.Vendedor;
import com.zannier.app.exa02_pdm_zvargas.interfaces.LoginInterface;
import com.zannier.app.exa02_pdm_zvargas.view.HomeFragment;

import java.util.ArrayList;
import java.util.EventListener;
import java.util.List;

public class LoginModel implements LoginInterface.Model{

    private LoginInterface.Presentator presentator;
    private int counter=3;

    FirebaseDatabase firebaseDatabase;
    DatabaseReference databaseReference;


    private List<Vendedor> listVendedor= new ArrayList<Vendedor>();
    private ArrayAdapter<Vendedor> arrayVendedor;


    public void ListarVendedor(){
        databaseReference.child("Vendedor").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                listVendedor.clear();
                for (DataSnapshot objSnapshot:dataSnapshot.getChildren()){
                    Vendedor vendedor = objSnapshot.getValue(Vendedor.class);
                    listVendedor.add(vendedor);
                }

                /*arrayVendedor = new ArrayAdapter<Vendedor>(LoginModel.this,android.R.layout.simple_list_item_2,listVendedor);
*/
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
    }


    public LoginModel(LoginInterface.Presentator presentator){
        this.presentator = presentator;
    }

    @Override
    public void validarUsuario(String userName, String passUser) {

        databaseReference = FirebaseDatabase.getInstance().getReference();

        ValueEventListener userListener = new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                dataSnapshot.getChildren();
                Vendedor vendedor = dataSnapshot.getValue(Vendedor.class);
                vendedor.getApellido();
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                Log.d("ERROR:->", "loadPost:onCancelled", databaseError.toException());
            }
        };
        databaseReference.addValueEventListener(userListener);
    }
}
