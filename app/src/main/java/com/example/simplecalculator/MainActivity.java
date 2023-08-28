package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button button0, button1, button2, button3, button4,
    button5, button6, button7, button8, button9,
    buttonAdd, buttonSub, buttonDiv, buttonMul,
    buttonDot, buttonClear, buttonEqual;

    Button buttonSin, buttonCos, buttonTan, buttonInverse,
    buttonSq, buttonCube, buttonSQRT, buttonPOW;

    EditText edtIn;
    float mValueOne, mValueTwo;
    boolean Addition, Substract, Multiplication,
            Division, Pow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button0 = findViewById(R.id.btnZero);
        button1 = findViewById(R.id.btnOne);
        button2 = findViewById(R.id.btnTwo);
        button3 = findViewById(R.id.btnThree);
        button4 = findViewById(R.id.btnFour);
        button5 = findViewById(R.id.btnFive);
        button6 = findViewById(R.id.btnSix);
        button7 = findViewById(R.id.btnSeven);
        button8 = findViewById(R.id.btnEight);
        button9 = findViewById(R.id.btnNine);

        buttonDot = findViewById(R.id.btnDot);
        buttonAdd = findViewById(R.id.btnAdd);
        buttonSub = findViewById(R.id.btnSub);
        buttonMul = findViewById(R.id.btnMul);
        buttonDiv = findViewById(R.id.btnDiv);
        buttonClear = findViewById(R.id.btnClear);
        buttonEqual = findViewById(R.id.btnEqual);

        buttonSin = findViewById(R.id.btnSin);
        buttonCos = findViewById(R.id.btnCos);
        buttonTan = findViewById(R.id.btnTan);
        buttonInverse = findViewById(R.id.btnInverse);

        buttonSq = findViewById(R.id.btnSquare);
        buttonCube = findViewById(R.id.btnCube);
        buttonSQRT = findViewById(R.id.btnSqrt);
        buttonPOW = findViewById(R.id.btnPow);

        edtIn= findViewById(R.id.edt1);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtIn.setText(edtIn.getText() + "1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtIn.setText(edtIn.getText() + "2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtIn.setText(edtIn.getText() + "3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtIn.setText(edtIn.getText() + "4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtIn.setText(edtIn.getText() + "5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtIn.setText(edtIn.getText() + "6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtIn.setText(edtIn.getText() + "7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtIn.setText(edtIn.getText() + "8");
            }
        });


        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtIn.setText(edtIn.getText() + "9");
            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtIn.setText(edtIn.getText() + "0");
            }
        });

        buttonDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtIn.setText(edtIn.getText() + ".");
            }
        });

        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtIn.setText(null);
            }
        });



        // calculate
        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edtIn == null)
                {
                    edtIn.setText("");
                }
                else
                {
                    mValueOne = Float.parseFloat(edtIn.getText() + "");
                    Addition = true;
                    edtIn.setText(null);
                }

            }
        });


        // calculate
        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    mValueOne = Float.parseFloat(edtIn.getText() + "");
                    Substract = true;
                    edtIn.setText(null);

            }
        });


        // calculate
        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mValueOne = Float.parseFloat(edtIn.getText() + "");
                Multiplication = true;
                edtIn.setText(null);
            }
        });


        // calculate
        buttonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mValueOne = Float.parseFloat(edtIn.getText() + "");
                Division = true;
                edtIn.setText(null);
            }
        });

        // Sin
        buttonSin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mValueOne = Float.parseFloat(edtIn.getText() + "");
                double rad = Math.toRadians(mValueOne);
                edtIn.setText(Math.sin(rad) + "");
            }
        });

        // COS
        buttonCos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mValueOne = Float.parseFloat(edtIn.getText() + "");
                double rad = Math.toRadians(mValueOne);
                edtIn.setText(Math.cos(rad) + "");
            }
        });

        // Tan
        buttonTan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mValueOne = Float.parseFloat(edtIn.getText() + "");
                double rad = Math.toRadians(mValueOne);
                edtIn.setText(Math.tan(rad) + "");
            }
        });

        // Inverse
        buttonInverse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mValueOne = Float.parseFloat(edtIn.getText() + "");
                edtIn.setText(1.0/mValueOne + "");
            }
        });

        // Square
        buttonSq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mValueOne = Float.parseFloat(edtIn.getText() + "");

                edtIn.setText(Math.pow(mValueOne, 2) + "");
            }
        });

        // Cube
        buttonCube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mValueOne = Float.parseFloat(edtIn.getText() + "");
                edtIn.setText(Math.pow(mValueOne,3) + "");
            }
        });


        // SQRT
        buttonSQRT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mValueOne = Float.parseFloat(edtIn.getText() + "");
                edtIn.setText(Math.sqrt(mValueOne) + "");
            }
        });


        // Power
        buttonPOW.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mValueOne = Float.parseFloat(edtIn.getText() + "");
                Pow = true;
                edtIn.setText(null);

            }
        });

        //equal
        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueTwo = Float.parseFloat(edtIn.getText()+"");

                if (Addition == true)
                {
                    edtIn.setText(mValueOne + mValueTwo + "");
                    Addition = false;
                }


                if (Substract == true)
                {
                    edtIn.setText(mValueOne - mValueTwo + "");
                    Substract = false;
                }


                if (Multiplication == true)
                {
                    edtIn.setText(mValueOne * mValueTwo + "");
                    Multiplication = false;
                }


                if (Division == true)
                {
                    edtIn.setText(mValueOne / mValueTwo + "");
                    Division = false;
                }

                if (Pow == true)
                {
                    edtIn.setText(Math.pow(mValueOne, mValueTwo) + "");
                    Pow = false;
                }
            }
        });

    }
}