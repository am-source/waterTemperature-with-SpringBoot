package com.amsource.waterTemperatureDemo.Service;


import com.amsource.waterTemperatureDemo.Modell.WaterSensorData;
import com.amsource.waterTemperatureDemo.Repository.WaterSensorDataRepository;
import com.amsource.waterTemperatureDemo.Service.Helper.LoraPark_API_Helper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WaterSensorDataServiceImpl implements WaterSensorDataService {

    @Autowired
    private WaterSensorDataRepository waterRepo;


    public WaterSensorDataServiceImpl(WaterSensorDataRepository waterRepo) {
        this.waterRepo = waterRepo;
    }


    @Override
    public List<WaterSensorData> getLast50Records() {
//        LoraPark_API_Helper.BASE_URI
        return null;
    }
}
