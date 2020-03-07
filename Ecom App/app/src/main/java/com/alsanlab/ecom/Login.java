package com.alsanlab.ecom;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class Login extends AppCompatActivity {
    EditText email,password;
    TextView forgot,signup;
    ImageView login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        email=findViewById(R.id.log_emailId);
        password=findViewById(R.id.log_passwordId);

        forgot=findViewById(R.id.log_forgot);
        login=findViewById(R.id.log_signbtn);
        signup=findViewById(R.id.log_signup);





    }
}
