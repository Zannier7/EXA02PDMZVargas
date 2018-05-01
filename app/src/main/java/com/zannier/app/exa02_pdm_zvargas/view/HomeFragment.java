package com.zannier.app.exa02_pdm_zvargas.view;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.zannier.app.exa02_pdm_zvargas.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment{


    public HomeFragment() {
        // Required empty public constructor
    }

    private TextView peneloco;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View view = inflater.inflate(R.layout.fragment_home, container, false);



        return view;


    }

}
