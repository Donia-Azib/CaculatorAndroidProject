package com.example.myapplication;

import android.content.Intent;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    Button moin,plus,mul,div;
    TextInputLayout one,two;
    TextView txt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt = findViewById(R.id.rst);
        mul = findViewById(R.id.mul);
        div = findViewById(R.id.div);
        plus = findViewById(R.id.plus);
        moin = findViewById(R.id.moin);
        one = findViewById(R.id.one);
        two = findViewById(R.id.two);

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int s_one= Integer.parseInt(one.getEditText().getText().toString());
                int s_two= Integer.parseInt(two.getEditText().getText().toString());
                Toast.makeText(MainActivity.this, ""+(s_one+s_two), Toast.LENGTH_SHORT).show();
                txt.setText("result : "+(s_one+s_two));
            }
        });


        moin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int s_one= Integer.parseInt(one.getEditText().getText().toString());
                int s_two= Integer.parseInt(two.getEditText().getText().toString());
                Toast.makeText(MainActivity.this, ""+(s_one-s_two), Toast.LENGTH_SHORT).show();
                txt.setText("result : "+(s_one-s_two));
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int s_one= Integer.parseInt(one.getEditText().getText().toString());
                int s_two= Integer.parseInt(two.getEditText().getText().toString());
                Toast.makeText(MainActivity.this, ""+(s_one*s_two), Toast.LENGTH_SHORT).show();
                txt.setText("result : "+(s_one*s_two));
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double s_one= Double.parseDouble(one.getEditText().getText().toString());
                double s_two= Double.parseDouble(two.getEditText().getText().toString());
                Toast.makeText(MainActivity.this, ""+(s_one/s_two), Toast.LENGTH_SHORT).show();
                txt.setText("result : "+(s_one/s_two));
            }
        });


    }

    public void clear(View view)
    {
        txt.setText("result :");
        one.getEditText().setText("");
        two.getEditText().setText("");
        two.setFocusable(false);
    }

    public void change(View view)
    {
        Intent i = new Intent(MainActivity.this,Main2Activity.class);
        startActivity(i);
        finish();
    }
}
