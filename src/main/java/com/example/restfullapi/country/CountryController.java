package com.example.restfullapi.country;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1")

public class CountryController {

    private final CountryService countryService;
    @Autowired
    public CountryController(CountryService countryService) {
        this.countryService = countryService;
    }

    @GetMapping(path = "/countries")
    public List<Country> getAllCountries(){
        return countryService.getAllCountries();
    }

    @GetMapping(path = "/country/code={code}")
    public ResponseEntity<Country> getCountryByCode(@PathVariable String code) {

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


}
