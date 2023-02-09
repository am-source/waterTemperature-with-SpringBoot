package com.amsource.waterTemperatureDemo.Service.Helper;

import com.amsource.waterTemperatureDemo.Modell.WaterSensorData;

import java.util.List;
import java.util.stream.Collectors;

public class JsonWaterSensorRecords {
  /*
   * "records" is the root element of any response, when calling the LoraPark API
   * list needs to be called records, so that it can be mapped by RestTemplate
   * */
  private List<WaterSensorData> records;

  public List<WaterSensorData> getRecords() {
    return records;
  }

  public void setRecords(List<WaterSensorData> records) {
    this.records = records;
  }

  @Override
  public String toString() {
    return "Records{\n"
        + records.stream()
            .map(waterSensorData -> waterSensorData.toString())
            .collect(Collectors.joining())
        + "\n}";
  }
}
