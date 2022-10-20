package com.example.restfullapi.country;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
public interface CountryService {

    List<Country> getAllCountries();
    Country getCountryByCode(String code);
    Country getCountryByName(String name);

}
