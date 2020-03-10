package com.alsanlab.ecom.RetroService;

import com.alsanlab.ecom.R;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetroService {


    private static    Retrofit retrofit=null;
    private static    String baseurl="http://u2desk.com";


    public static RetroMethodInterface getRetro(){
        if (retrofit==null){
            retrofit=new Retrofit.Builder()
                    .baseUrl(baseurl)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
    }
        return retrofit.create(RetroMethodInterface.class);

    }

}
