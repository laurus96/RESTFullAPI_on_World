package com.example.restfullapi.country;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CountryService {

    List<Country> getAllCountry();
}
