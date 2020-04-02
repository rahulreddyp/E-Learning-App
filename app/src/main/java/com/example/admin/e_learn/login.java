package com.example.admin.e_learn;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class login extends AppCompatActivity {
    private FirebaseAuth mAuth;
    EditText e1,e2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        mAuth = FirebaseAuth.getInstance();
        e1=findViewById(R.id.e1);
        e2=findViewById(R.id.e2);
    }

    public void login(View v){
        Task<AuthResult> task =  mAuth.signInWithEmailAndPassword(
                e1.getText().toString(),
                e2.getText().toString() );
        task.addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isSuccessful()){
                    Toast.makeText(login.this,
                            "Authentication Success",Toast.LENGTH_LONG).show();
                    startActivity(new Intent(login.this,
                            selectsub.class));

                }else{
                    Toast.makeText(login.this,
                            "Authentication Failed",Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    public void register(View view) {
        Task<AuthResult> task =  mAuth.createUserWithEmailAndPassword(
                e1.getText().toString(),
                e2.getText().toString() );
        task.addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isSuccessful()){
                    Toast.makeText(login.this,
                            "Authentication Success",Toast.LENGTH_LONG).show();
                    startActivity(new Intent(login.this,
                            selectsub.class));
                }else{
                    Toast.makeText(login.this,
                            "Authentication Failed",Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}
