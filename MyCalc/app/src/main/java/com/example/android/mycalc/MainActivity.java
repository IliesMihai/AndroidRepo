package com.example.android.mycalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private int firstNumber = 0;
    private int secondNumber = 0;

    private Button one;
    private Button two;
    private Button three;
    private Button four;
    private Button five;
    private Button six;
    private Button seven;
    private Button eight;
    private Button nine;
    private Button zero;
    private Button plus;
    private Button minus;
    private Button equal;
    private Button clear;
    private TextView info;
    private TextView result;
    private char ACTION;
    private final char ADDITION = '+';
    private final char SUBSTRACTION = '-';
    private final char EQUAL = '=';

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        /**
         * Setting up the buttons so they are ready when the app starts
         */
        setupViews();


        /**
         * Defining the functionality of every button
         */
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText() + "0");
            }
        });

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText() + "1");
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText() + "2");
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText() + "3");
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText() + "4");
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText() + "5");
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText() + "6");
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText() + "7");
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                info.setText(info.getText() + "8");
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText() + "9");
            }
        });

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculatorEngine();
                ACTION = ADDITION;
                result.setText(String.valueOf(firstNumber) + "+");
                info.setText(null);
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculatorEngine();
                ACTION = SUBSTRACTION;
                result.setText(String.valueOf(firstNumber) + "-");
                info.setText(null);
            }
        });

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculatorEngine();
                ACTION = EQUAL;
                result.setText(String.valueOf(firstNumber));
                info.setText(null);
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(null);
                result.setText(null);
                firstNumber = 0;
                secondNumber = 0;
            }
        });
    }


    /**
     * Every button is assigned to the it's key
     */
    private void setupViews() {
        zero = (Button) findViewById(R.id.btn0);
        one = (Button) findViewById(R.id.btn1);
        two = (Button) findViewById(R.id.btn2);
        three = (Button) findViewById(R.id.btn3);
        four = (Button) findViewById(R.id.btn4);
        five = (Button) findViewById(R.id.btn5);
        six = (Button) findViewById(R.id.btn6);
        seven = (Button) findViewById(R.id.btn7);
        eight = (Button) findViewById(R.id.btn8);
        nine = (Button) findViewById(R.id.btn9);
        plus = (Button) findViewById(R.id.btnAdd);
        minus = (Button) findViewById(R.id.btnSub);
        equal = (Button) findViewById(R.id.btnEqual);
        clear = (Button) findViewById(R.id.btnClear);
        info = (TextView) findViewById(R.id.infoView);
        result = (TextView) findViewById(R.id.resultView);
    }


    /**
     * The engine of the calculator that takes care of the math
     */
    private void calculatorEngine() {
        if(!(firstNumber == 0)) {
            if (info.getText() != "") {
                secondNumber = Integer.parseInt(info.getText().toString());

                switch (ACTION) {
                    case ADDITION:
                        firstNumber = firstNumber + secondNumber;
                        break;
                    case SUBSTRACTION:
                        firstNumber = firstNumber - secondNumber;
                        break;
                    case EQUAL:
                        break;
                }
            }
        } else {
            firstNumber = Integer.parseInt(info.getText().toString());
        }
    }

}
