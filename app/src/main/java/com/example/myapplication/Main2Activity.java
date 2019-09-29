package com.example.myapplication;

import android.content.Intent;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    TextInputLayout one ;
    int len,cher;
    String ope,str;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        one = findViewById(R.id.one);
    }
    public void clear(View view)
    {
        one.getEditText().setText("");
    }
    public void nine(View view)
    {
        one.getEditText().setText(chaine(one)+"9");
    }
    public void eight(View view)
    {
        one.getEditText().setText(chaine(one)+"8");
    }
    public void seven(View view)
    {
        one.getEditText().setText(chaine(one)+"7");
    }
    public void six(View view)
    {
        one.getEditText().setText(chaine(one)+"6");
    }
    public void five(View view)
    {
        one.getEditText().setText(chaine(one)+"5");
    }
    public void four(View view)
    {
        one.getEditText().setText(chaine(one)+"4");
    }
    public void three(View view)
    {
        one.getEditText().setText(chaine(one)+"3");
    }
    public void twoo(View view)
    {
        one.getEditText().setText(chaine(one)+"2");
    }
    public void oone(View view)
    {
        one.getEditText().setText(chaine(one)+"1");
    }
    public void zero(View view)
    {
        one.getEditText().setText(chaine(one)+"0");
    }
    public void plus(View view)
    {
        one.getEditText().setText(chaine(one)+"+");
    }
    public void moin(View view)
    {
        one.getEditText().setText(chaine(one)+"-");
    }
    public void mul(View view)
    {
        one.getEditText().setText(chaine(one)+"*");
    }
    public void div(View view)
    {
        one.getEditText().setText(chaine(one)+"/");
    }

    public void egal(View view)
    {
        len = one.getEditText().getText().length();
        str = one.getEditText().getText().toString();

        one.getEditText().setText(chaine(one)+"=");
        if(str.contains("+") )
        {
            ope="+";
           cher=str.indexOf("+");
        }
        if(str.contains("*") )
        {
            ope="*";
            cher=str.indexOf("*");
        }
        if(str.contains("-") )
        {
            ope="-";
            cher=str.indexOf("-");
        }
        if(str.contains("/") )
        {
            ope="/";
            cher=str.indexOf("/");
        }

        calcul(str,ope,cher,len);
    }
    public void calcul(String str,String ope,int avant,int len)
    {
        double partOne,partTwo,rst=0;

         partOne= Double.parseDouble(str.substring(0,avant));

         partTwo= Double.parseDouble(str.substring(avant+1,len));


        switch(ope)
        {
            case "+" :
                rst = partOne+partTwo;
                break;
            case"-":
                rst = partOne-partTwo;
                break;
            case"*":
                rst = partOne*partTwo;
                break;
            case"/":
                rst = partOne/partTwo;
                break;
        }
        Toast.makeText(this, "rst : "+rst, Toast.LENGTH_SHORT).show();
        one.getEditText().setText(chaine(one)+rst);
    }

    public String chaine(TextInputLayout edit)
    {
        return edit.getEditText().getText().toString();
    }

    public void change(View view)
    {
        Intent i = new Intent(Main2Activity.this,MainActivity.class);
        startActivity(i);
        finish();
    }
}
