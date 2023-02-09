package com.amsource.waterTemperatureDemo.Repository;

import com.amsource.waterTemperatureDemo.Modell.WaterSensorData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WaterSensorDataRepository extends JpaRepository<WaterSensorData, Long> {
    WaterSensorData findFirstByOrderByTimestampDesc();
}
