package com.alsanlab.ecom.SignUp_In;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.alsanlab.ecom.DataModel.LoginModel;
import com.alsanlab.ecom.MainActivity;
import com.alsanlab.ecom.R;
import com.alsanlab.ecom.RetroService.RetroMethodInterface;
import com.alsanlab.ecom.RetroService.RetroService;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

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

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(email==null|| password==null){
                    Toast.makeText(Login.this, "Fill the form", Toast.LENGTH_SHORT).show();
                }
                else{
                    LoginModel loginModel=new LoginModel(email.getText().toString(),password.getText().toString());

                    RetroMethodInterface logindatapost= RetroService.getRetro();
                    Call<LoginModel> logdopost = logindatapost.logindo(loginModel);
                    logdopost.enqueue(new Callback<LoginModel>() {
                        @Override
                        public void onResponse(Call<LoginModel> call, Response<LoginModel> response) {
                            String servermsg=response.body().getServerMsg();
                            Toast.makeText(Login.this, response.body().getServerMsg(), Toast.LENGTH_SHORT).show();

                            if(servermsg.equals("valid")){
                                Toast.makeText(Login.this, "Login Successful", Toast.LENGTH_SHORT).show();
                                Intent home= new Intent(Login.this, MainActivity.class);
                                startActivity(home);
                                finish();

                            }
                            else {
                                Toast.makeText(Login.this, "Invalid", Toast.LENGTH_SHORT).show();
                            }
                        }

                        @Override
                        public void onFailure(Call<LoginModel> call, Throwable t) {
                            Toast.makeText(Login.this, t.toString(), Toast.LENGTH_SHORT).show();

                        }
                    });

                }
            }
        });


    }
}
