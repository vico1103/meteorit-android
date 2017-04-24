package com.vico.meteorit.presenter;

import android.util.Log;

import com.vico.meteorit.model.MeteoritModel;
import com.vico.meteorit.module.retrofit.GetMeteorFromApi;
import com.vico.meteorit.view.activity.MainViewInterface;

import java.util.List;

/**
 * Created by Peter Vican on 24.4.2017.
 */

public class MainPresenter implements MainPresenterInterface {

  public static final String TAG = MainPresenter.class.getName();

  private MainViewInterface mViewInterface;
  private GetMeteorFromApi getMeteorFromApi;

  public MainPresenter(){
    getMeteorFromApi = new GetMeteorFromApi(this);
  }

  @Override
  public void loadDataFromNASA(List<MeteoritModel> meteoritModelList) {
    Log.d(TAG, "loadDataFromNASA(): ");

      if (mViewInterface != null){
        Log.d(TAG, "loadDataFromNASA(): call addListToRecycleView");
        mViewInterface.addListToRecycleView(meteoritModelList);
      }
  }


  public void loadData(String query){
    getMeteorFromApi.callGetMeteorFromDate(query);
  }

  public void attachView(MainViewInterface view) {
    mViewInterface = view;
  }

  public void detachView() {
    mViewInterface = null;
  }
}
