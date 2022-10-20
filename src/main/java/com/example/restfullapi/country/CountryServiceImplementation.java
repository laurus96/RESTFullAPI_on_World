package com.example.restfullapi.country;

import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;


@Service
@Slf4j

public class CountryServiceImplementation implements CountryService{

    private final CountryRepository countryRepository;

    @Autowired
    public CountryServiceImplementation(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    @Override
    public List<Country> getAllCountries() {
        log.info("Fetching all Countries in the Database...");

        return countryRepository.findAll();

    }

    @Override
    public Country getCountryByCode(String code) {
        log.info("Fetching Country in the Database with Code {} ...", code);

        Country foundCountry = countryRepository.findCountryByCode(code);
        if (Objects.isNull(foundCountry)) {
            log.error("Country {} not found in the database", code);
            throw new RuntimeException("Country not found");
        }

        return foundCountry;
    }

    @Override
    public Country getCountryByName(String name) {
        log.info("Fetching Country in the Database with Name {} ...", name);

        Country foundCountry = countryRepository.findCountryByName(name);
        if (Objects.isNull(foundCountry)){
            log.error("Country {} not found in the database", name);
            throw new RuntimeException("Country not found");

        }

        return foundCountry;

    }


}
