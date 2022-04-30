package com.example.myapplication5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText edtext;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtext=findViewById(R.id.edit);
    }

    public void calc(View view) {
        Double text= Double.parseDouble(edtext.getText().toString());
        Double res=text*(2.5/100);
        edtext.setText(res.toString());
    }
}