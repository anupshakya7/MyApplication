package com.example.owncalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Addition extends AppCompatActivity {

    EditText et1,et2;
    Button bAdd;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addition);

        et1 =(EditText)findViewById(R.id.first);
        et2=(EditText)findViewById(R.id.second);
        bAdd=(Button)findViewById(R.id.btnAdd);
        result=(TextView)findViewById(R.id.tvResult);

        bAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int i = Integer.parseInt(et1.getText().toString());
                int j = Integer.parseInt(et2.getText().toString());
                int k = i + j;
                result.setText("Ans is : "+k);
            }
        });
    }



}
