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

        List<Country> fetchedCountry = countryRepository.findAll();
        /*

        if (!Objects.isNull(fetchedCountry)){
            log.info("Founded {} Countries", fetchedCountry.size());
        }

        */

        log.info("Founded {} Countries", fetchedCountry.size());

        return fetchedCountry;

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

    @Override
    public List<Country> getAllCountryWithIndepYearNotNull() {
        log.info("Fetching Countries in the Database with an independent year not null ...");

        List<Country> fetchedCountry = countryRepository.findByIndepYearNotNull();
        if(Objects.isNull(fetchedCountry)){
            log.error("Error in the Database ... ");
            throw new RuntimeException("Error in the Database ...");

        }

        log.info("Founded {} Countries with an independent date", fetchedCountry.size());
        return fetchedCountry;
    }

    @Override
    public List<Country> getAllCountryWithIndepYear(Short year) {
        log.info("Fetching Countries in the Database with an independent year > {}  ...", year);

        List<Country> fetchedCountry = countryRepository.findByIndepYear(year);
        if(Objects.isNull(fetchedCountry)){
            log.error("Error in the Database ... ");
            throw new RuntimeException("Error in the Database ...");
        }
        log.info("Founded {} Countries with an independent date", fetchedCountry.size());

        return fetchedCountry;
    }

    @Override
    public List<Country> getAllCountryWithIndepYearBetweenXandY(Short yearOne, Short yearTwo) {
        log.info("Fetching Countries in the Database with an independent date between {} and {} ...", yearOne, yearTwo);

        List<Country> fetchedCountry = countryRepository.findByIndepYearBetweenXandY(yearOne, yearTwo);
        if (Objects.isNull(fetchedCountry)){
            log.error("Error in the Database ... ");
            throw new RuntimeException("Error in the Database ...");
        }

        log.info("Founded {} Countries with an independent date between {} and {}",
                fetchedCountry.size(),
                yearOne,
                yearTwo);
        
        return fetchedCountry;
    }
}
