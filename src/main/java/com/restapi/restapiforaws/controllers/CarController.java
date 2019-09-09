package com.restapi.restapiforaws.controllers;

import com.restapi.restapiforaws.models.CarModel;
import com.restapi.restapiforaws.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CarController {

    private final CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/getAllCars")
    public List<CarModel> getCars() {
        return this.carService.getAllCars();
    }
}
