package com.restapi.restapiforaws.services;

import com.restapi.restapiforaws.models.CarModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {

    public List<CarModel> getCars() {
        List<CarModel> cars = new ArrayList<>();
        CarModel car = new CarModel();
        car.setMake("Lexus");;
        car.setModel("ES300");
        car.setYear(2002);
        cars.add(car);
        car = new CarModel();
        car.setMake("Toyota");
        car.setModel("Camry");
        car.setYear(2009);
        cars.add(car);
        return cars;
    }
}
