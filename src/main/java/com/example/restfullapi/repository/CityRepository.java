package com.example.restfullapi.repository;

import com.example.restfullapi.entity.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<City, Integer> {
    City findByName(String name);
}
