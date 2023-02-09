package com.amsource.waterTemperatureDemo.Service;


import com.amsource.waterTemperatureDemo.Modell.WaterSensorData;
import com.amsource.waterTemperatureDemo.Repository.WaterSensorDataRepository;
import com.amsource.waterTemperatureDemo.Service.Helper.JsonWaterSensorRecords;
import com.amsource.waterTemperatureDemo.Service.Helper.LoraPark_API_Helper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class WaterSensorDataServiceImpl implements WaterSensorDataService {

    @Autowired
    private WaterSensorDataRepository waterRepo;


    public WaterSensorDataServiceImpl(WaterSensorDataRepository waterRepo) {
        this.waterRepo = waterRepo;
    }


    @Override
    public List<WaterSensorData> getLastNRecords(int amount) {
        LoraPark_API_Helper sqlClause = new LoraPark_API_Helper();
        sqlClause.setOrderingToDESC();
        sqlClause.setLimitRecordsTo(amount);

        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(sqlClause.getURI(), String.class);
        System.out.println("STRING result:");
        System.out.println(result);
        System.out.println("RECORD result:");
        JsonWaterSensorRecords result2 = restTemplate.getForObject(sqlClause.getURI(), JsonWaterSensorRecords.class);
        System.out.println(result2.toString());
        // TODO: actually implement this
        return new ArrayList<WaterSensorData>();

    }
}
