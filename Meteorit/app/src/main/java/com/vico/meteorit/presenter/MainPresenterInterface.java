package com.vico.meteorit.presenter;

import com.vico.meteorit.model.MeteoritModel;
import com.vico.meteorit.view.activity.MainViewInterface;

import java.util.List;

/**
 * Created by Peter Vican on 24.4.2017.
 */

public interface MainPresenterInterface {

  void loadDataFromNASA(List<MeteoritModel> meteoritModelList);
}
