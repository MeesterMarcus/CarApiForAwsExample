package com.restapi.restapiforaws.services;

import com.restapi.restapiforaws.entities.CarEntity;
import com.restapi.restapiforaws.mappers.CarMapper;
import com.restapi.restapiforaws.models.CarModel;
import com.restapi.restapiforaws.repositories.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {

    private final CarMapper carMapper;

    private final CarRepository carRepository;

    @Autowired
    public CarService(CarRepository carRepository, CarMapper carMapper) {
        this.carRepository = carRepository;
        this.carMapper = carMapper;
    }

    public List<CarModel> getAllCars() {
        List<CarEntity> entities = this.carRepository.findAll();
        return this.carMapper.entitiesToModels(entities);
    }
}
