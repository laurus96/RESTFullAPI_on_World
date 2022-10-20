package com.example.restfullapi.city;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
@Slf4j
public class CityServiceImplementation implements CityService{

    @Autowired
    private final CityRepository cityRepository;

    @Override
    public List<City> getCityAll() {
        log.info("Fetching cities ...");
        return cityRepository.findAll();
    }
}
