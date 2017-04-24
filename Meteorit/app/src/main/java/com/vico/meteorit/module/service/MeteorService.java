package com.vico.meteorit.module.service;

import com.vico.meteorit.model.MeteoritModel;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by Peter Vican on 23.4.2017.
 */

public interface MeteorService {


  @Headers("X-App-Token: e0RcXuzbiu5HdihERyrqxJAQH")
  @GET("y77d-th95.json")
  Call<List<MeteoritModel>> getMeteorit(@Query("$where") String queryWithStamp);
}
