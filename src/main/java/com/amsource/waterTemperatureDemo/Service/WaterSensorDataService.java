package com.amsource.waterTemperatureDemo.Service;


import com.amsource.waterTemperatureDemo.Modell.WaterSensorData;

import java.util.List;

public interface WaterSensorDataService {
    List<WaterSensorData> getLastNRecords(int amount);

}
