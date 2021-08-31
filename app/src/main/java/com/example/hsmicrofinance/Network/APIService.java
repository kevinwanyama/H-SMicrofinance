package com.example.hsmicrofinance.Network;

import com.example.hsmicrofinance.entity.InvestmentHistory;
import com.example.hsmicrofinance.entity.LatestTransaction;
import com.example.hsmicrofinance.entity.User;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface APIService {
    @GET("getAll")
    Call<List<LatestTransaction>>getLatestTransaction();
    @GET("getInvestment")
    Call<List<InvestmentHistory>>getAllInvestmentHistory();
    @GET("getUser")
    Call<List<User>>getUser();

    @FormUrlEncoded
    @POST("/register")
    Call<List<User>>setUser();
}
