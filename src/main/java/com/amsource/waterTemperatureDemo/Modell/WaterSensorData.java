package com.amsource.waterTemperatureDemo.Modell;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

@Entity
public class WaterSensorData {

  /*
   * Data from smart city project in Ulm:
   * https://datenhub.ulm.de/ckan/dataset/lorapark_wassertemperatur
   * (publicly available dataset and api)
   * */

  @Override
  public String toString() {
    return "WaterSensorData{"
        + "_id="
        + _id
        + ", externalTemperature="
        + externalTemperature
        + ", humidity="
        + humidity
        + ", pressure="
        + pressure
        + ", temperature="
        + temperature
        + ", vdd="
        + vdd
        + ", id='"
        + id
        + '\''
        + ", timestamp="
        + timestamp
        + "}\n";
  }

  @Id
  //  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long _id;

  private Integer externalTemperature;
  private int humidity;
  private float pressure;
  private float temperature;
  private int vdd;
  private String id;
  private Timestamp timestamp;

  protected WaterSensorData() {}

  public WaterSensorData(
      int externalTemperature,
      int humidity,
      float pressure,
      float temperature,
      int vdd,
      String id,
      Timestamp timestamp) {
    this.externalTemperature = externalTemperature;
    this.humidity = humidity;
    this.pressure = pressure;
    this.temperature = temperature;
    this.vdd = vdd;
    this.id = id;
    this.timestamp = timestamp;
  }

  public Long get_id() {
    return _id;
  }

  public void set_id(Long _id) {
    this._id = _id;
  }

  public Integer getExternalTemperature() {
    return externalTemperature;
  }

  public void setExternalTemperature(Integer externalTemperature) {
    this.externalTemperature = externalTemperature;
  }

  public int getHumidity() {
    return humidity;
  }

  public void setHumidity(int humidity) {
    this.humidity = humidity;
  }

  public float getPressure() {
    return pressure;
  }

  public void setPressure(float pressure) {
    this.pressure = pressure;
  }

  public float getTemperature() {
    return temperature;
  }

  public void setTemperature(float temperature) {
    this.temperature = temperature;
  }

  public int getVdd() {
    return vdd;
  }

  public void setVdd(int vdd) {
    this.vdd = vdd;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Timestamp getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(Timestamp timestamp) {
    this.timestamp = timestamp;
  }
}
