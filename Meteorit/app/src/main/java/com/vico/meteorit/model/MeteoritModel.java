package com.vico.meteorit.model;

/**
 * Created by Peter Vican on 23.4.2017.
 */

public class MeteoritModel {

  private String fall;
  private GeolocationModel geolocation;
  private String id;
  private String mass;
  private String name;
  private String nametype;
  private String recclass;
  private String reclat;
  private String reclong;
  private String year;

  public MeteoritModel() {

  }

  public String getFall() {
    return fall;
  }

  public void setFall(String fall) {
    this.fall = fall;
  }

  public GeolocationModel getGeolocation() {
    return geolocation;
  }

  public void setGeolocation(GeolocationModel geolocation) {
    this.geolocation = geolocation;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getMass() {
    return mass;
  }

  public void setMass(String mass) {
    this.mass = mass;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getNametype() {
    return nametype;
  }

  public void setNametype(String nametype) {
    this.nametype = nametype;
  }

  public String getRecclass() {
    return recclass;
  }

  public void setRecclass(String recclass) {
    this.recclass = recclass;
  }

  public String getReclat() {
    return reclat;
  }

  public void setReclat(String reclat) {
    this.reclat = reclat;
  }

  public String getReclong() {
    return reclong;
  }

  public void setReclong(String reclong) {
    this.reclong = reclong;
  }

  public String getYear() {
    return year;
  }

  public void setYear(String year) {
    this.year = year;
  }
}
