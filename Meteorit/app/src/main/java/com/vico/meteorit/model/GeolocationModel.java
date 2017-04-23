package com.vico.meteorit.model;

import java.util.List;

/**
 * Created by Peter Vican on 23.4.2017.
 */

public class GeolocationModel {
  private String type;
  private List<Double> coordinates;

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public List<Double> getCoordinates() {
    return coordinates;
  }

  public void setCoordinates(List<Double> coordinates) {
    this.coordinates = coordinates;
  }
}
