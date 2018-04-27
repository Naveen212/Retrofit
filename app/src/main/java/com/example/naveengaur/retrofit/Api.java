package com.example.naveengaur.retrofit;

import org.json.JSONObject;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by naveengaur on 27/4/18.
 */

public interface Api {
    String BASE_URL="https://hixel-server-prototype.herokuapp.com/";
    @GET("companydata?ticker=aapl&year=2017")
    Call<Example> getExamples();

}
