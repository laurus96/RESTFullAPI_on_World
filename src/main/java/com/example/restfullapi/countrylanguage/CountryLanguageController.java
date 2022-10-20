package com.example.restfullapi.countrylanguage;

import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(path = "/api/v1/languages")
public class CountryLanguageController {

    private final CountryLanguageServiceImplementation countryLanguageService;

    public CountryLanguageController(CountryLanguageServiceImplementation countryLanguageService) {
        this.countryLanguageService = countryLanguageService;
    }

    @GetMapping
    @Transactional(readOnly = true)
    public @ResponseBody List<CountryLanguage> getAllCountryLanguages(){
        return countryLanguageService.getAllCountryLanguage();
    }
}
