package com.example.admin.e_learn;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class selectsub extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selectsub);
    }

    public void c(View view) {
        Intent intent = new Intent(this,c.class);
        startActivity(intent);
    }

    public void java(View view) {
        Intent intent = new Intent(this,java.class);
        startActivity(intent);
    }

    public void php(View view) {
        Intent intent = new Intent(this,php.class);
        startActivity(intent);
    }

    public void python(View view) {
        Intent intent = new Intent(this,python.class);
        startActivity(intent);
    }
}
