package com.zannier.app.exa02_pdm_zvargas.view;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.zannier.app.exa02_pdm_zvargas.R;

public class LoginView extends AppCompatActivity {

    private EditText user;
    private EditText pass;
    private Button login;
    private TextView info;
    private ProgressDialog mProgress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_view);

        user =(EditText)findViewById(R.id.user);
        pass =(EditText)findViewById(R.id.pass);
        login =(Button)findViewById(R.id.login);
        info =(TextView)findViewById(R.id.info);
        mProgress = new ProgressDialog(this);

        info.setText("Intentos restantes: 3");
    }
}
