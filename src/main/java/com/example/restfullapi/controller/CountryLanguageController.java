package com.example.restfullapi.controller;

import com.example.restfullapi.service.CountryLanguageService;
import com.example.restfullapi.entity.CountryLanguage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/languages")
public class CountryLanguageController {

    private final CountryLanguageService countryLanguageService;

    @Autowired
    public CountryLanguageController(CountryLanguageService countryLanguageService) {
        this.countryLanguageService = countryLanguageService;
    }

    @GetMapping
    @Transactional(readOnly = true)
    public List<CountryLanguage> getAllCountryLanguages(){
        return countryLanguageService.getAllCountryLanguage();
    }
}
