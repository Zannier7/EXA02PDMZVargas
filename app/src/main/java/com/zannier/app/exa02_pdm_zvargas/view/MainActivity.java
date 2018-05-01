package com.zannier.app.exa02_pdm_zvargas.view;

import android.content.pm.ActivityInfo;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

import com.zannier.app.exa02_pdm_zvargas.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        BottomNavigationView menuView =  findViewById(R.id.menuView);
        menuView.setOnNavigationItemSelectedListener(navListener);

        getSupportFragmentManager().beginTransaction().replace(R.id.fragmento_contenedor,new HomeFragment()).commit();

    }

    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    android.support.v4.app.Fragment selectedFragment = null;
                    switch (item.getItemId()){
                        case R.id.menu_home:
                            selectedFragment  = new HomeFragment();
                            break;
                        case R.id.menu_producto:
                            selectedFragment = new ProductoFragment();
                            break;
                        case R.id.menu_venta:
                            selectedFragment = new VentaFragment();
                            break;
                    }
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragmento_contenedor,selectedFragment).commit();
                    return true;

                }
            };

}
