package com.alsanlab.ecom.RetroService;

import com.alsanlab.ecom.DataModel.RegModel;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface RetroMethodInterface {
    @POST("/ecom/reg")
    Call<RegModel> SignUser(@Body RegModel regModel);
}
