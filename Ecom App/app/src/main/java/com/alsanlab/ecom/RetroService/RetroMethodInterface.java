package com.alsanlab.ecom.RetroService;

import com.alsanlab.ecom.DataModel.DeviceCheckModel;
import com.alsanlab.ecom.DataModel.RegModel;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface RetroMethodInterface {

    @POST("reg")
    Call<RegModel>regDo(@Body RegModel regModel);

    @POST("devcheck")
  Call<DeviceCheckModel>  devcheck(@Body DeviceCheckModel deviceCheckModel);


}
