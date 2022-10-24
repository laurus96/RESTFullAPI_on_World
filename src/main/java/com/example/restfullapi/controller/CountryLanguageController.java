package com.example.restfullapi.controller;

import com.example.restfullapi.model.CountryLanguageBean;
import com.example.restfullapi.service.CountryLanguageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
        return countryLanguageService.getAllCountryLanguage();
    }

    @GetMapping(path = "/countryName={countryName}")
    public List<CountryLanguageBean> getCountryLanguages(@PathVariable String countryName){
        return countryLanguageService.getCountryLanguagesByName(countryName);
    }

    @GetMapping(path = "/official/countryName={countryName}")
    public CountryLanguageBean getCountryOfficialLanguage(@PathVariable String countryName){
        return countryLanguageService.getCountryOfficialLanguage(countryName);
    }
    @GetMapping(path = "/nonOfficial/countryName={countryName}")
    public List<CountryLanguageBean> getCountryNonOfficialLanguage(@PathVariable String countryName){
        return countryLanguageService.getCountryNonOfficialLanguage(countryName);
    }
}
