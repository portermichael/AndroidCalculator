package com.example.porter.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    private TextView input;
    private TextView solution;
    private Button button0;
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;
    private Button button8;
    private Button button9;
    private Button buttonRnd;
    private Button buttonAdd;
    private Button buttonSub;
    private Button buttonMult;
    private Button buttonDiv;
    private Button buttonMod;
    private Button buttonPow;
    private Button buttonEql;
    private Button buttonClr;
    private StringBuilder stringInput = new StringBuilder();
    private StringBuilder stringSolution = new StringBuilder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        input = findViewById(R.id.textInput);
        solution = findViewById(R.id.textSolution);
        button0 = findViewById(R.id.button0);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        buttonRnd = findViewById(R.id.buttonRnd);
        buttonAdd = findViewById(R.id.buttonAdd);
        buttonSub = findViewById(R.id.buttonSub);
        buttonMult = findViewById(R.id.buttonMult);
        buttonDiv = findViewById(R.id.buttonDiv);
        buttonMod = findViewById(R.id.buttonMod);
        buttonPow = findViewById(R.id.buttonPow);
        buttonEql = findViewById(R.id.buttonEql);
        buttonClr = findViewById(R.id.buttonClr);

        View.OnClickListener myOnClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch(v.getId()) {
                    case R.id.button0:
                        stringInput.append(0);
                        input.setText(stringInput.toString());
                        break;
                    case R.id.button1:
                        stringInput.append(1);
                        input.setText(stringInput.toString());
                        break;
                    case R.id.button2:
                        stringInput.append(2);
                        input.setText(stringInput.toString());
                        break;
                    case R.id.button3:
                        stringInput.append(3);
                        input.setText(stringInput.toString());
                        break;
                    case R.id.button4:
                        stringInput.append(4);
                        input.setText(stringInput.toString());
                        break;
                    case R.id.button5:
                        stringInput.append(5);
                        input.setText(stringInput.toString());
                        break;
                    case R.id.button6:
                        stringInput.append(6);
                        input.setText(stringInput.toString());
                        break;
                    case R.id.button7:
                        stringInput.append(7);
                        input.setText(stringInput.toString());
                        break;
                    case R.id.button8:
                        stringInput.append(8);
                        input.setText(stringInput.toString());
                        break;
                    case R.id.button9:
                        stringInput.append(9);
                        input.setText(stringInput.toString());
                        break;
                    case R.id.buttonRnd:
                        int rnd = (int) (Math.random()*10);
                        stringInput.append(rnd);
                        input.setText(stringInput.toString());
                        break;
                    case R.id.buttonAdd:
                        stringInput.append("+");
                        input.setText(stringInput.toString());
                        break;
                    case R.id.buttonSub:
                        stringInput.append("-");
                        input.setText(stringInput.toString());
                        break;
                    case R.id.buttonMult:
                        stringInput.append("*");
                        input.setText(stringInput.toString());
                        break;
                    case R.id.buttonDiv:
                        stringInput.append("/");
                        input.setText(stringInput.toString());
                        break;
                    case R.id.buttonMod:
                        stringInput.append("%");
                        input.setText(stringInput.toString());
                        break;
                    case R.id.buttonPow:
                        stringInput.append("^");
                        input.setText(stringInput.toString());
                        break;
                    case R.id.buttonEql:
                        stringInput = new StringBuilder();
                        input.setText(stringInput.toString());
                        break;
                    case R.id.buttonClr:
                        stringInput = new StringBuilder();
                        input.setText(stringInput.toString());
                        break;
                }
            }
        };
        button0.setOnClickListener(myOnClickListener);
        button1.setOnClickListener(myOnClickListener);
        button2.setOnClickListener(myOnClickListener);
        button3.setOnClickListener(myOnClickListener);
        button4.setOnClickListener(myOnClickListener);
        button5.setOnClickListener(myOnClickListener);
        button6.setOnClickListener(myOnClickListener);
        button7.setOnClickListener(myOnClickListener);
        button8.setOnClickListener(myOnClickListener);
        button9.setOnClickListener(myOnClickListener);
        buttonRnd.setOnClickListener(myOnClickListener);
        buttonAdd.setOnClickListener(myOnClickListener);
        buttonSub.setOnClickListener(myOnClickListener);
        buttonMult.setOnClickListener(myOnClickListener);
        buttonDiv.setOnClickListener(myOnClickListener);
        buttonMod.setOnClickListener(myOnClickListener);
        buttonPow.setOnClickListener(myOnClickListener);
        buttonEql.setOnClickListener(myOnClickListener);
        buttonClr.setOnClickListener(myOnClickListener);
    }

//    public String multiplyOrDivide (String tempString) {
//
//    }
}
