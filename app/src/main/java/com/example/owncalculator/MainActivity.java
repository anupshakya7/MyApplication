package com.example.owncalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnCreateAc;
    EditText etName,etEmail,etPassword;
    RadioGroup rg;
    RadioButton r1,r2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCreateAc=(Button)findViewById(R.id.btnCreateAccount);
        etName=(EditText)findViewById(R.id.input_name);
        etEmail=(EditText)findViewById(R.id.emailAddress);
        etPassword=(EditText)findViewById(R.id.password);

        r1=(RadioButton)findViewById(R.id.m);
        r2=(RadioButton)findViewById(R.id.f);

        rg=(RadioGroup)findViewById(R.id.radioGroup);







        btnCreateAc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String salute ="";


//                if(r1.isChecked()){
//                     salute="Mr";
//                }else{
//                    salute ="Ms";
//                }

               int i = rg.getCheckedRadioButtonId();
               RadioButton rb=(RadioButton) rg.findViewById(i);

                final String name=etName.getText().toString();
                final String email=etEmail.getText().toString();
                final String password=etPassword.getText().toString();

                Toast.makeText(MainActivity.this,"Name "+salute+"."+name+"\n Email "+email+"\nPassword "+password+"\n gender"+rb.getText().toString(),Toast.LENGTH_SHORT).show();
            }
        });
    }
}
