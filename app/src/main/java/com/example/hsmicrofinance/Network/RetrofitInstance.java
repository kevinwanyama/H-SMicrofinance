package com.example.hsmicrofinance.Network;

import android.os.Debug;

import com.example.hsmicrofinance.BuildConfig;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitInstance {
    public static String BASE_URL = "https://whispering-inlet-50206.herokuapp.com/";
    public static  String Url ="https://jsonplaceholder.typicode.com/";
    private static Retrofit sRetrofit;
    public static Retrofit getRetroClient(){
        if(sRetrofit == null){
            sRetrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return sRetrofit;
    }
}
