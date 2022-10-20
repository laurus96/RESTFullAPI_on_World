package com.example.restfullapi.service;

import com.example.restfullapi.entity.CountryLanguage;
import com.example.restfullapi.repository.CountryLanguageRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
@Slf4j
public class CountryLanguageServiceImplementation implements CountryLanguageService {

    private final CountryLanguageRepository countryLanguageRepository;

    @Autowired
    public CountryLanguageServiceImplementation(CountryLanguageRepository countryLanguageRepository) {
        this.countryLanguageRepository = countryLanguageRepository;
    }

    @Override
    public List<CountryLanguage> getAllCountryLanguage() {
        log.info("Fetching Languages ...");
        return countryLanguageRepository.findAll();
    }
}
