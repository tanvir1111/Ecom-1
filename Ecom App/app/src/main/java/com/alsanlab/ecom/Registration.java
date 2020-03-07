package com.alsanlab.ecom;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class Registration extends AppCompatActivity {
    EditText name,email,password,phone;
    TextView signin;
    ImageView signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        getSupportActionBar().hide();
        name=findViewById(R.id.reg_name);
        email=findViewById(R.id.reg_emailId);
        password=findViewById(R.id.reg_passwordId);
        phone=findViewById(R.id.reg_phoneId);
        signin=findViewById(R.id.reg_signin);
        signup=findViewById(R.id.reg_signbtn);


    }
}
