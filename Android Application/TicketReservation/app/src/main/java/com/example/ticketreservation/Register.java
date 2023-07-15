package com.example.ticketreservation;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class Register extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);
        EditText e1 = findViewById(R.id.editTextTextPersonName);
        EditText e2 = findViewById(R.id.editTextTextPassword);
        EditText e3 = findViewById(R.id.editTextTextPassword2);

        Button b = findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder b1 =new AlertDialog.Builder(Register.this);
                b1.setTitle("Registration Successful");
                b1.setCancelable(false);
                b1.setPositiveButton("Proceed", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent in = new Intent(getApplicationContext(),Login.class);
                        in.putExtra("v1",e1.getText().toString());
                        in.putExtra("v2",e2.getText().toString());
                        startActivity(in);
                    }
                });
                AlertDialog a=b1.create();
                a.show();
            }
        });
    }
}
