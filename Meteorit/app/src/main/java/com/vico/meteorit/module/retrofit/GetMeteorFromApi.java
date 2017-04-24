package com.vico.meteorit.module.retrofit;

import android.util.Log;

import com.vico.meteorit.model.MeteoritModel;
import com.vico.meteorit.module.service.MeteorService;
import com.vico.meteorit.presenter.MainPresenterInterface;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Peter Vican on 23.4.2017.
 */

public class GetMeteorFromApi implements Callback<List<MeteoritModel>> {

 public static final String TAG = GetMeteorFromApi.class.getSimpleName();

   private MainPresenterInterface mPresenterInterface;

  public GetMeteorFromApi(MainPresenterInterface mainInterface){
    mPresenterInterface = mainInterface;
  }

  public void callGetMeteorFromDate (String query){
    RetrofitInstance retrofit = RetrofitInstance.getInstance();
    MeteorService api = retrofit.getMeteorService();
    Log.d(TAG, "callGetMeteorFromDate(): " + api.getMeteorit(query).request().toString());
    api.getMeteorit(query).enqueue(this);
  }

  @Override
  public void onResponse(Call<List<MeteoritModel>> call, Response<List<MeteoritModel>> response) {
     if (response.body() != null){
       for (MeteoritModel test: response.body()
       ) {
         Log.d(TAG, "onResponse(): " + test.getName());
       }
     }

      mPresenterInterface.loadDataFromNASA(response.body());
  }

  @Override
  public void onFailure(Call<List<MeteoritModel>> call, Throwable t) {

  }
}
