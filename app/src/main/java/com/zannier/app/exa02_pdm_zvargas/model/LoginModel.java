package com.zannier.app.exa02_pdm_zvargas.model;

import android.util.Log;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.zannier.app.exa02_pdm_zvargas.Entidad.Vendedor;
import com.zannier.app.exa02_pdm_zvargas.interfaces.LoginInterface;

import java.util.EventListener;

public class LoginModel implements LoginInterface.Model{

    private LoginInterface.Presentator presentator;
    private int counter=3;
    DatabaseReference databaseReference;
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
