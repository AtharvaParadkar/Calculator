package com.example.calculator;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private final String TAG = "MainActivity";

    EditText et_first_no, et_second_no;
    Button addition, subtraction, multiplication, division, reset;
    TextView tv_result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        allClickListener();
    }

    private void allClickListener() {
        addition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int sum = addOfTwoNo();
                Log.e(TAG, "onClick: ");
//                Toast.makeText(getApplicationContext(), "Addition Click", Toast.LENGTH_SHORT).show();
                tv_result.setText(String.valueOf(sum));
            }

        });

        subtraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int sub = subOfTwoNo();
                Log.e(TAG, "onClick: ");
                //Toast.makeText(getApplicationContext(), "Subtraction Click", Toast.LENGTH_SHORT).show();
                tv_result.setText(String.valueOf(sub));
            }
        });

        multiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int mul = mulOfTwoNo();
                Log.e(TAG, "onClick: ");
                //Toast.makeText(getApplicationContext(), "Multiplication Click", Toast.LENGTH_SHORT).show();
                tv_result.setText(String.valueOf(mul));
            }
        });

        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float div = divOfTwoNo();
                Log.e(TAG, "onClick: ");
                //Toast.makeText(getApplicationContext(), "Division Click", Toast.LENGTH_SHORT).show();
                tv_result.setText(String.valueOf(div));
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resetControls();
            }
        });
        
    }

    private void resetControls() {
        et_first_no.setText("");
        et_second_no.setText("");
        et_first_no.requestFocus();
    }

    private int addOfTwoNo() {
        int sum;
        String num1 = et_first_no.getText().toString();
        String num2 = et_second_no.getText().toString();
        sum = Integer.parseInt(num1) + Integer.parseInt(num2);
        return sum;
    }

    private int subOfTwoNo() {
        int sub;
        String num1 = et_first_no.getText().toString();
        String num2 = et_second_no.getText().toString();
        sub = Integer.parseInt(num1) - Integer.parseInt(num2);
        return sub;
    }

    private int mulOfTwoNo() {
        int mul;
        String num1 = et_first_no.getText().toString();
        String num2 = et_second_no.getText().toString();
        mul = Integer.parseInt(num1) * Integer.parseInt(num2);
        return mul;
    }

    private float divOfTwoNo() {
        float div;
        String num1 = et_first_no.getText().toString();
        String num2 = et_second_no.getText().toString();
        div = Integer.parseInt(num1) / Integer.parseInt(num2);
        return div;
    }

    private void initViews() {
        et_first_no = findViewById(R.id.et_first_no);
        et_second_no = findViewById(R.id.et_second_no);
        addition = findViewById(R.id.btn_add);
        subtraction = findViewById(R.id.btn_sub);
        multiplication = findViewById(R.id.btn_mul);
        division = findViewById(R.id.btn_div);
        tv_result = findViewById(R.id.tv_result);
        reset = findViewById(R.id.btn_reset);
    }

}