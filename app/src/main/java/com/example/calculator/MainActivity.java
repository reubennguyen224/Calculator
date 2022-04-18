package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintAttribute;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.lifecycle.ViewModel;

public class MainActivity extends AppCompatActivity {

    float numA, numB, numRes;
    Button btnAdd, btnSub, btnMul, btnDiv;
    EditText txtResults, txtA, txtB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAdd = findViewById(R.id.btnAdd);
        btnSub = findViewById(R.id.btnSub);
        btnMul = findViewById(R.id.btnMul);
        btnDiv = findViewById(R.id.btnDiv);

        txtA = findViewById(R.id.txtA);
        txtB = findViewById(R.id.txtB);
        txtResults = findViewById(R.id.txtResults);
        txtResults.setText("");

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtResults.setText("");
                numA = Float.parseFloat(txtA.getText().toString()) ;
                numB = Float.parseFloat(txtB.getText().toString());
                numRes = numA + numB;
                txtResults.setText(Float.toString(numRes));
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtResults.setText("");
                numA = Float.parseFloat(txtA.getText().toString()) ;
                numB = Float.parseFloat(txtB.getText().toString());
                numRes = (float) (numA - numB);
                txtResults.setText(Float.toString(numRes));
            }
        });

        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtResults.setText("");
                double numA1 = Double.parseDouble(txtA.getText().toString()) ;
                double numB1 = Double.parseDouble(txtB.getText().toString());
                double numRes1 =(double) (numA * numB);
                txtResults.setText(Double.valueOf(numRes1).toString());
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtResults.setText("");
                numA = Float.parseFloat(txtA.getText().toString()) ;
                numB = Float.parseFloat(txtB.getText().toString());
                Double numRes1 = numA / (numB * 1.0);
                txtResults.setText(Double.toString(numRes1));
            }
        });


    }
}