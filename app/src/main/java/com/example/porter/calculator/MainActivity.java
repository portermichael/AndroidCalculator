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
    private Button buttonNeg;
    private Button buttonAdd;
    private Button buttonSub;
    private Button buttonMult;
    private Button buttonDiv;
    private Button buttonMod;
    private Button buttonPow;
    private Button buttonEql;
    private Button buttonClr;
    private ArrayList<Integer> arrayInput = new ArrayList<Integer>();
    private ArrayList<Integer> arraySolution = new ArrayList<Integer>();

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
        buttonNeg = findViewById(R.id.buttonNeg);
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
                        arrayInput.add(0);
                        break;
                    case R.id.button1:
                        arrayInput.add(1);
                        break;
                    case R.id.button2:
                        arrayInput.add(2);
                        break;
                    case R.id.button3:
                        arrayInput.add(3);
                        break;
                    case R.id.button4:
                        arrayInput.add(4);
                        break;
                    case R.id.button5:
                        arrayInput.add(5);
                        break;
                    case R.id.button6:
                        arrayInput.add(6);
                        break;
                    case R.id.button7:
                        arrayInput.add(7);
                        break;
                    case R.id.button8:
                        arrayInput.add(8);
                        break;
                    case R.id.button9:
                        arrayInput.add(9);
                        break;
                    case R.id.buttonRnd:
                        Integer rnd = (int) (Math.random()*10);
                        arrayInput.add(rnd);
                        break;
                    case R.id.buttonNeg:
                        break;
                    case R.id.buttonAdd:
                        break;
                    case R.id.buttonSub:
                        break;
                    case R.id.buttonMult:
                        break;
                    case R.id.buttonDiv:
                        break;
                    case R.id.buttonMod:
                        break;
                    case R.id.buttonPow:
                        break;
                    case R.id.buttonEql:
                        break;
                    case R.id.buttonClr:
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
        buttonNeg.setOnClickListener(myOnClickListener);
        buttonAdd.setOnClickListener(myOnClickListener);
        buttonSub.setOnClickListener(myOnClickListener);
        buttonMult.setOnClickListener(myOnClickListener);
        buttonDiv.setOnClickListener(myOnClickListener);
        buttonMod.setOnClickListener(myOnClickListener);
        buttonPow.setOnClickListener(myOnClickListener);
        buttonEql.setOnClickListener(myOnClickListener);
        buttonClr.setOnClickListener(myOnClickListener);
    }
}
