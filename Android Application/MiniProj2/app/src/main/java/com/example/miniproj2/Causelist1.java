package com.example.miniproj2;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Causelist1 extends AppCompatActivity  {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.causelist1);
        Bundle extras = getIntent().getExtras();
        String x = extras.getString("v1");
        TextView e = findViewById(R.id.textView23);
        e.setText(x);

    }
}

