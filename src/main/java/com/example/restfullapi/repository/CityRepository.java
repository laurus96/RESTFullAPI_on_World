package com.example.restfullapi.repository;

import com.example.restfullapi.entity.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.lang.Nullable;

public interface CityRepository extends JpaRepository<City, Integer> {
    @Nullable
    City findByName(String name);
}
