package com.example.mycalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    TextView result;
    int num1;
    char ch;
    int num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result = findViewById(R.id.textViewResult);
        result.setText("");
    }

    public void ButtonFunctionNumber(View view) {

        if (view instanceof Button){

            Button b = (Button) view;

            String str = b.getText().toString();

            result.append(str);

        }
    }


    public void ButtonFunOperator(View view) {
        Button b = (Button) view;
        ch = b.getText().charAt(0);
        String str = result.getText().toString();
        num1 =  Integer.parseInt(str);
        result.setText("");
    }

    public void funEqual(View view) {

        String str = result.getText().toString();
        num2 =  Integer.parseInt(str);
        double opRes = 0;

        switch (ch){
            case '+':
                opRes = num1 + num2;
                break;
            case '-':
                opRes = num1 - num2;
                break;
            case '*':
                opRes = num1 * num2;
                break;
            case '/':
                opRes = num1 / num2;
                break;
        }
        result.setText(opRes+ "");

    }

    public void clearFun(View view) {

        result.setText("");
    }
}