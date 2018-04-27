package com.example.naveengaur.retrofit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    protected static Thread thread;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        update();



    }

    protected void update() {
        thread = new Thread(new Runnable() {
            @Override
            public void run() {
                Retrofit retrofit = new Retrofit.Builder().baseUrl(Api.BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();
                Api api = retrofit.create(Api.class);
                Call<Example> call = api.getExamples();
                call.enqueue(new Callback<Example>() {
                    @Override
                    public void onResponse(Call<Example> call, Response<Example> response) {
                        Example example = response.body();
                        Log.d("CIK--------",example.getIdentifiers().getName().toString());
                       Ratios ratios=example.getRatios();

                              //ratios.setCashRatio(example.getRatios().getCashRatio());


                        Log.d("CIK--------",""+ratios.getLongTermDebtToEquityRatio());
                        //Log.d("sad",example.getAdditionalProperties().keySet().toString());


                    }

                    @Override
                    public void onFailure(Call<Example> call, Throwable t) {
                        Toast.makeText(getApplicationContext(), t.getMessage(), Toast.LENGTH_SHORT).show();
                        //Log.d("cik-----", t.getMessage());


                    }
                });


            }
        });
        thread.start();
    }
}

