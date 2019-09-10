package com.restapi.restapiforaws.mappers;

import com.restapi.restapiforaws.entities.CarEntity;
import com.restapi.restapiforaws.models.CarModel;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarMapper {

    public CarModel entityToModel(CarEntity entity) {
        CarModel car = new CarModel();
        car.setModel(entity.getModel());
        car.setMake(entity.getMake());
        car.setYear(entity.getYear());
        return car;
    }

    public List<CarModel> entitiesToModels(List<CarEntity> entities) {
        List<CarModel> carModels = new ArrayList<>();
        for (CarEntity entity : entities) {
            carModels.add(this.entityToModel(entity));
        }
        return carModels;
    }

    public CarEntity modelToEntity(CarModel carModel) {
        CarEntity car = new CarEntity();
        car.setModel(carModel.getModel());
        car.setMake(carModel.getMake());
        car.setYear(carModel.getYear());
        return car;
    }

}
