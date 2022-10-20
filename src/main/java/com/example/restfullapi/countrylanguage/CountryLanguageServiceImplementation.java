package com.example.restfullapi.countrylanguage;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@Slf4j
public class CountryLanguageServiceImplementation implements CountryLanguageService{

    @Autowired
    private final CountryLanguageRepository countryLanguageRepository;

    @Override
    public List<CountryLanguage> getAllCountryLanguage() {
        log.info("Fetching Languages ...");
        return countryLanguageRepository.findAll();
    }
}
