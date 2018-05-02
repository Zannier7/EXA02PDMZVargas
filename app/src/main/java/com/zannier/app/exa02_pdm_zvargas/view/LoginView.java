package com.zannier.app.exa02_pdm_zvargas.view;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.zannier.app.exa02_pdm_zvargas.R;

public class LoginView extends AppCompatActivity {

    private EditText user;
    private EditText pass;
    private Button login;
    private TextView info;
    private ProgressDialog mProgress;

    private FirebaseAuth firebaseAuth;
    private FirebaseAuth.AuthStateListener firebaseAuthListener;

    private FirebaseAuth.AuthStateListener fireAuthStateListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_view);

        firebaseAuth = FirebaseAuth.getInstance();

        user =(EditText)findViewById(R.id.user);
        pass =(EditText)findViewById(R.id.pass);
        login =(Button)findViewById(R.id.login);
        info =(TextView)findViewById(R.id.info);
        mProgress = new ProgressDialog(this);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doLogin();
            }
        });
        firebaseAuthListener = new FirebaseAuth.AuthStateListener() {
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth mAuth) {
                FirebaseUser user = mAuth.getCurrentUser();
                if(user != null){
                    goMainScreen();
                }
            }
        };

        info.setText("Intentos restantes: 3");

    }

    private void doLogin() {
        String login_user = user.getText().toString().trim();
        String login_pass = pass.getText().toString().trim();

        if (!TextUtils.isEmpty(login_user) && !TextUtils.isEmpty(login_pass)) {
            mProgress.setMessage("Ingresando...");
            mProgress.show();
            firebaseAuth.signInWithEmailAndPassword(login_user,login_pass)
                    .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            mProgress.dismiss();
                            if (task.isSuccessful()) {
                                Toast.makeText(LoginView.this, "Login siii :)", Toast.LENGTH_SHORT).show();
                            } else
                                Toast.makeText(LoginView.this, "Usuario no registrado", Toast.LENGTH_SHORT).show();
                        }
                    });
        }
    }
    private void goMainScreen() {
        Intent intent = new Intent(this, MainActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }

    @Override
    protected void onStart(){
        super.onStart();
        firebaseAuth.addAuthStateListener(firebaseAuthListener);
    }
    @Override
    protected void onStop(){
        super.onStop();
        if (fireAuthStateListener != null){
            firebaseAuth.removeAuthStateListener(firebaseAuthListener);
        }
    }
}
