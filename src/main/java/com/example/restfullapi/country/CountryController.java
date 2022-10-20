package com.example.restfullapi.country;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1")
@Slf4j
public class CountryController {

    private final CountryService countryService;
    @Autowired
    public CountryController(CountryService countryService) {
        this.countryService = countryService;
    }

    @GetMapping(path = "/countries")
    public List<Country> getAllCountries(){
        log.info("Entering {} RestController method", "getAllCountries()");
        return countryService.getAllCountries();
    }

    @GetMapping(path = "/country/code={code}")
    public ResponseEntity<Country> getCountryByCode(@PathVariable String code) {
        log.info("Entering {} RestController method", "getCountryByCode()");

        try {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(countryService.getCountryByCode(code));

        } catch (RuntimeException e){
            return ResponseEntity
                    .status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(null);

        }
    }

    @GetMapping(path = "/country/name={name}")
    public ResponseEntity<Country> getCountryByName(@PathVariable String name){
        log.info("Entering {} RestController method", "getCountryByName()");

        try {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(countryService.getCountryByName(name));

        }catch (RuntimeException e) {
            return ResponseEntity
                    .status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(null);

        }
    }

    @GetMapping(path = "/country/independent")
    public ResponseEntity<List<Country>> getAllCountryWithIndepYear(){
        log.info("Entering {} RestController method", "getAllCountryWithIndepYear()");

        try {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(countryService.getAllCountryWithIndepYearNotNull());
        } catch (RuntimeException e){
            return ResponseEntity
                    .status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(null);
        }
    }

    @GetMapping(path = "/country/independent={year}")
    public ResponseEntity<List<Country>> getAllCountryWithIndepYear(@PathVariable String year){
        log.info("Entering {} RestController method", "getAllCountryWithIndepYear()");

        try {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(countryService.getAllCountryWithIndepYear(Short.decode(year)));
        } catch (RuntimeException e){
            return ResponseEntity
                    .status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(null);
        }
    }

    @GetMapping(path = "/country/independentBetween={yearOne}and{yearTwo}")
    public ResponseEntity<List<Country>> getAllCountryWithIndepYearBetweenXandY(
            @PathVariable(name = "yearOne") String yearOne,
            @PathVariable(name = "yearTwo") String yearTwo
    ){
        log.info("Entering {} RestController method", "getAllCountryWithIndepYearBetweenXandY()");

        try {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(countryService.getAllCountryWithIndepYearBetweenXandY(Short.decode(yearOne), Short.decode(yearTwo)));
        } catch (RuntimeException e){
            return ResponseEntity
                    .status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(null);
        }
    }


}
