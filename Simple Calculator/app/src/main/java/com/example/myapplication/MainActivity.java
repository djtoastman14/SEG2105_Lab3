package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    boolean allowDec = true;
    String num = "";
    enum operation {none, add, sub, mul, div};
    operation op = operation.none;

    public void clickCE(View view) {
        EditText text = findViewById(R.id.resultEdit);
        text.setText("");
        allowDec = true;
        num = "";
    }

    public void clickDec(View view) {
        EditText text = findViewById(R.id.resultEdit);
        if (allowDec) {
            if (text.getText().length() == 0) {
                text.setText("0."); }
            else {
                text.setText(text.getText()+"."); }
            allowDec = false;
        }
    }

    public void click0(View view) {
        EditText text = findViewById(R.id.resultEdit);
        if (text.getText().length() != 0) {
            text.setText(text.getText()+"0"); }
    }

    public void click1(View view) {
        EditText text = findViewById(R.id.resultEdit);
        text.setText(text.getText()+"1");
    }

    public void click2(View view) {
        EditText text = findViewById(R.id.resultEdit);
        text.setText(text.getText()+"2");
    }

    public void click3(View view) {
        EditText text = findViewById(R.id.resultEdit);
        text.setText(text.getText()+"3");
    }

    public void click4(View view) {
        EditText text = findViewById(R.id.resultEdit);
        text.setText(text.getText()+"4");
    }

    public void click5(View view) {
        EditText text = findViewById(R.id.resultEdit);
        text.setText(text.getText()+"5");
    }

    public void click6(View view) {
        EditText text = findViewById(R.id.resultEdit);
        text.setText(text.getText()+"6");
    }

    public void click7(View view) {
        EditText text = findViewById(R.id.resultEdit);
        text.setText(text.getText()+"7");
    }

    public void click8(View view) {
        EditText text = findViewById(R.id.resultEdit);
        text.setText(text.getText()+"8");
    }

    public void click9(View view) {
        EditText text = findViewById(R.id.resultEdit);
        text.setText(text.getText()+"9");
    }

    public void add(View view) {
        EditText text = findViewById(R.id.resultEdit);
        if (text.getText().length() != 0) {
            num = text.getText().toString();
            text.setText("");
            allowDec = true;
            op = operation.add;
        }
    }

    public void sub(View view) {
        EditText text = findViewById(R.id.resultEdit);
        if (text.getText().length() != 0) {
            num = text.getText().toString();
            text.setText("");
            allowDec = true;
            op = operation.sub;
        }
    }

    public void mul(View view) {
        EditText text = findViewById(R.id.resultEdit);
        if (text.getText().length() != 0) {
            num = text.getText().toString();
            text.setText("");
            allowDec = true;
            op = operation.mul;
        }
    }

    public void div(View view) {
        EditText text = findViewById(R.id.resultEdit);
        if (text.getText().length() != 0) {
            num = text.getText().toString();
            text.setText("");
            allowDec = true;
            op = operation.div;
        }
    }

    public void equals(View view) {
        EditText text = findViewById(R.id.resultEdit);
        if (op == operation.none || text.getText().length() == 0) {}
        else {
            double temp1 = Double.parseDouble(num);
            double temp2 = Double.parseDouble(text.getText().toString());
            double result;
            if (op == operation.add) {
                result = temp1 + temp2; }
            else if (op == operation.sub) {
                result = temp1 - temp2; }
            else if (op == operation.mul) {
                result = temp1 * temp2; }
            else {
                result = temp1/temp2; }
            num = Double.toString(result);
            text.setText(num);
            op = operation.none;
        }
    }
}