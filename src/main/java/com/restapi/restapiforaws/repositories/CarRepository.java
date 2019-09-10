package com.restapi.restapiforaws.repositories;

import com.restapi.restapiforaws.entities.CarEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarRepository extends JpaRepository<CarEntity, Long> {

    List<CarEntity> findByMake(String make);

    List<CarEntity> findByModel(String model);

    List<CarEntity> findByYear(int year);

    @Modifying
    @Query("DELETE FROM CarEntity c WHERE c.make=:make AND c.model=:model AND c.year=:year")
    void deleteCar(@Param("make") String make, @Param("model") String model, @Param("year") int year);

}
