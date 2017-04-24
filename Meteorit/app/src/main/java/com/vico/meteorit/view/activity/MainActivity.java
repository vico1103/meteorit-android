package com.vico.meteorit.view.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.vico.meteorit.R;
import com.vico.meteorit.model.MeteoritModel;
import com.vico.meteorit.presenter.MainPresenter;
import com.vico.meteorit.view.adapter.MeteorRecycleAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements MainViewInterface {

  @BindView(R.id.recycle_view)
  RecyclerView mRecycle;

  private MainPresenter mPresenter = new MainPresenter();
  private MeteorRecycleAdapter mAdapter;

  // in feature get date3 from UI for find from which year meteorit
  private String query = "year > \'2011-01-01T00:00\'";

  private List<MeteoritModel> meteorList = new ArrayList<>();

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    ButterKnife.bind(this);
    mPresenter.attachView(this);
    setRecycleView();
    mPresenter.loadData(query);
  }

  @Override
  public void addListToRecycleView(List<MeteoritModel> list) {
    meteorList.clear();
    meteorList.addAll(list);
    getAdapter().notifyDataSetChanged();
  }

  @Override
  protected void onDestroy() {
    super.onDestroy();
    mPresenter.detachView();
  }

  private void setRecycleView() {
    mAdapter = new MeteorRecycleAdapter(meteorList);
    RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
    mLayoutManager.setAutoMeasureEnabled(true);
    mRecycle.setLayoutManager(mLayoutManager);
    mRecycle.setAdapter(mAdapter);
  }

  private MeteorRecycleAdapter getAdapter(){
    return mAdapter;
  }
}
