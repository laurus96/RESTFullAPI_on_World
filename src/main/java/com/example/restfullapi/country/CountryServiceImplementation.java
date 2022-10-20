package com.example.restfullapi.country;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j

public class CountryServiceImplementation implements CountryService{

    private final CountryRepository countryRepository;

    @Autowired
    public CountryServiceImplementation(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    @Override
    public List<Country> getAllCountry() {
        log.info("Fetching all Country in the Database...");
        return countryRepository.findAll();

    }
}
