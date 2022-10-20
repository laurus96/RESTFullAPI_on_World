package com.example.restfullapi.city;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class CityServiceImplementation implements CityService{

    private final CityRepository cityRepository;
    @Autowired
    public CityServiceImplementation(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    @Override
    public List<City> getCityAll() {
        log.info("Fetching cities ...");
        return cityRepository.findAll();
    }
}
