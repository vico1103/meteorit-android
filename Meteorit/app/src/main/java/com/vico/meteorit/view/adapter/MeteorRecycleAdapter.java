package com.vico.meteorit.view.adapter;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.vico.meteorit.R;
import com.vico.meteorit.model.MeteoritModel;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Peter Vican on 24.4.2017.
 */

public class MeteorRecycleAdapter extends RecyclerView.Adapter<MeteorRecycleAdapter.ViewHolder> {

  private List<MeteoritModel> meteorList;

  public class ViewHolder extends RecyclerView.ViewHolder {

    @BindView(R.id.name_meteor)
    TextView mNameMeteor;

    public ViewHolder(View view) {
      super(view);
      ButterKnife.bind(this,view);
    }
  }

  public MeteorRecycleAdapter(List<MeteoritModel> meteorList) {
    this.meteorList = meteorList;
  }

  @Override
  public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
    View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_meteor, parent, false);
    return new ViewHolder(v);
  }

  @Override
  public void onBindViewHolder(ViewHolder holder, int position) {
    MeteoritModel meteor = meteorList.get(position);

    holder.mNameMeteor.setText(meteor.getName());
  }

  @Override
  public int getItemCount() {
    return meteorList.size();
  }

}





