package com.restapi.restapiforaws.repositories;

import com.restapi.restapiforaws.entities.CarEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarRepository extends JpaRepository<CarEntity, Long> {

    List<CarEntity> findByMake(String make);

    List<CarEntity> findByModel(String model);

    List<CarEntity> findByYear(int year);

}
