package com.alsanlab.ecom.SignUp_In;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.alsanlab.ecom.R;

public class Login extends AppCompatActivity {
    EditText email, password;
    TextView forgot, signup;
    ImageView login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getSupportActionBar().hide();

        email = findViewById(R.id.log_emailId);
        password = findViewById(R.id.log_passwordId);
        forgot = findViewById(R.id.log_forgot);
        login = findViewById(R.id.log_signbtn);
        signup = findViewById(R.id.log_signup);


    }
}
