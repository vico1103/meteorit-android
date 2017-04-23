package com.vico.meteorit.module.retrofit;

import android.util.Log;

import com.vico.meteorit.model.MeteoritModel;
import com.vico.meteorit.module.service.MeteorService;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Peter Vican on 23.4.2017.
 */

public class GetMeteorFromApi implements Callback<MeteoritModel> {

 public static final String TAG = GetMeteorFromApi.class.getSimpleName();

  public void callGetMeteorFromDate (String timestamp){
    RetrofitInstance retrofit = RetrofitInstance.getInstance();
    MeteorService api = retrofit.getMeteorService();
    api.getMeteorit(timestamp).enqueue(this);
  }

  @Override
  public void onResponse(Call<MeteoritModel> call, Response<MeteoritModel> response) {
    Log.i(TAG, "onResponse():");
  }

  @Override
  public void onFailure(Call<MeteoritModel> call, Throwable t) {

  }
}
