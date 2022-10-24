package com.example.restfullapi.controller;

import com.example.restfullapi.model.CountryLanguageBean;
import com.example.restfullapi.service.CountryLanguageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/languages")
@Transactional(readOnly = true)
@Slf4j
public class CountryLanguageController {

    private final CountryLanguageService countryLanguageService;

    @Autowired
    public CountryLanguageController(CountryLanguageService countryLanguageService) {
        this.countryLanguageService = countryLanguageService;
    }

    @GetMapping
    public List<CountryLanguageBean> getAllCountryLanguages(){
        log.info("Fetching all Languages in the database");
        return countryLanguageService.getAllCountryLanguage();
    }

    @GetMapping(path = "/countryName={countryName}")
    public List<CountryLanguageBean> getCountryLanguages(@PathVariable String countryName){
        log.info("Fetching all language spoken in {}", countryName);
        return countryLanguageService.getCountryLanguagesByName(countryName);
    }

    @GetMapping(path = "/official/countryName={countryName}")
    public CountryLanguageBean getCountryOfficialLanguage(@PathVariable String countryName){
        log.info("Fetching official language spoken in {}", countryName);
        return countryLanguageService.getCountryOfficialLanguage(countryName);
    }
    @GetMapping(path = "/nonOfficial/countryName={countryName}")
    public List<CountryLanguageBean> getCountryNonOfficialLanguage(@PathVariable String countryName){
        log.info("Fetching other languages spoken in {}", countryName);
        return countryLanguageService.getCountryNonOfficialLanguage(countryName);
    }

}
