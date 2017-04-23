package com.vico.meteorit.module.retrofit;

import android.util.Log;

import com.vico.meteorit.module.service.MeteorService;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Peter Vican on 23.4.2017.
 */

public class RetrofitInstance {

  private static final String TAG = RetrofitInstance.class.getSimpleName();

  public String URL = "https://data.nasa.gov/resource";
  private Retrofit instanceRetrofit;
  private MeteorService meteorService;
  private static RetrofitInstance instanceBaseRetrofit = new RetrofitInstance();

  private RetrofitInstance() {
    setInstanceRetrofit();
    initMeteorService();
  }

  public static RetrofitInstance getInstance() {
    return instanceBaseRetrofit;
  }

  // Set Retrofit builder
  private void setInstanceRetrofit() {
    Log.d(TAG, "setInstanceRetrofit(): ");
    instanceRetrofit = new Retrofit.Builder().baseUrl(URL).addConverterFactory(
      GsonConverterFactory.create()).build();
  }

  private void initMeteorService() {
    meteorService = instanceRetrofit.create(MeteorService.class);
  }


  public MeteorService getMeteorService() {
    Log.d(TAG, "getMeteorService(): ");
    return meteorService;
  }
}
