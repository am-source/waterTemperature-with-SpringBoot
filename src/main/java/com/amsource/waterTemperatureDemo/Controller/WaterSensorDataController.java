package com.amsource.waterTemperatureDemo.Controller;

import com.amsource.waterTemperatureDemo.Modell.WaterSensorData;
import com.amsource.waterTemperatureDemo.Service.WaterSensorDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/water_data")
public class WaterSensorDataController {

    @Autowired
    private WaterSensorDataService waterService;

    public WaterSensorDataController(WaterSensorDataService waterService){
        this.waterService = waterService;
    }


    @GetMapping("/latest/{amount}")
    public List<WaterSensorData> getLast50Records(@PathVariable int amount){
        return waterService.getLastNRecords(amount);
    }

//    @GetMapping("/latest")
//    public WaterSensorData getLatest(){
//        waterService.updatePostgresDB();
//        return waterService.getLatest();
//    }

}
