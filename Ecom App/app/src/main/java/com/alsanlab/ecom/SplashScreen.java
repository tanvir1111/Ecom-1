package com.alsanlab.ecom;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.provider.Settings;

import androidx.appcompat.app.AppCompatActivity;

import com.alsanlab.ecom.DataModel.DeviceCheckModel;
import com.alsanlab.ecom.RetroService.RetroMethodInterface;
import com.alsanlab.ecom.RetroService.RetroService;
import com.alsanlab.ecom.SignUp_In.Login;
import com.alsanlab.ecom.SignUp_In.Registration;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SplashScreen extends AppCompatActivity {

    Intent it;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);
        getSupportActionBar().hide();

        final String android_id = Settings.Secure.getString(this.getContentResolver(), Settings.Secure.ANDROID_ID);
        DeviceCheckModel deviceCheckModel = new DeviceCheckModel(android_id);

        RetroMethodInterface getid = RetroService.getRetro();
        getid.devcheck(deviceCheckModel).enqueue(new Callback<DeviceCheckModel>() {
            @Override
            public void onResponse(Call<DeviceCheckModel> call, Response<DeviceCheckModel> response) {

                String   ServerMs = response.body().getServerMsg();
                if (ServerMs.equals("match")) {
                    it = new Intent(SplashScreen.this, Login.class);
                } else {
                    it = new Intent(SplashScreen.this, Registration.class);
                }


                        startActivity(it);
                        finish();

          

            }

            @Override
            public void onFailure(Call<DeviceCheckModel> call, Throwable t) {

            }
        });







    }
}
