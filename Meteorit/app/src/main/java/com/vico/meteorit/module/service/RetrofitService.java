package com.vico.meteorit.module.service;

import com.vico.meteorit.model.MeteoritModel;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;

/**
 * Created by Peter Vican on 23.4.2017.
 */

public interface RetrofitService {


  @Headers("X-App-Token: e0RcXuzbiu5HdihERyrqxJAQH")
  @GET("/resource/y77d-th95.json?$where=year  >  {yearTimestamp}")
  Call<MeteoritModel> getMeteorit(@Path("yearTimestamp") String yearTimestamp);
}
