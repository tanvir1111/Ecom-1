package com.alsanlab.ecom.reg;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.alsanlab.ecom.DataModel.RegModel;
import com.alsanlab.ecom.R;
import com.alsanlab.ecom.RetroService.RetroMethodInterface;
import com.alsanlab.ecom.RetroService.RetroService;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

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



        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final RegModel regModel=new RegModel(name.getText().toString(),password.getText().toString(),email.getText().toString(),phone.getText().toString());
                final RetroMethodInterface retroService=RetroService.getRetro();

                final Call<RegModel> datatask = retroService.SignUser(regModel);



                datatask.enqueue(new Callback<RegModel>() {
                    @Override
                    public void onResponse(Call<RegModel> call, Response<RegModel> response) {




                        Toast.makeText(Registration.this,response.body().getMsg(), Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onFailure(Call<RegModel> call, Throwable t) {
                        Toast.makeText(Registration.this, t.toString(), Toast.LENGTH_SHORT).show();

                    }
                });
            }
        });


    }
}
