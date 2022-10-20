package com.example.restfullapi.country;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Iterator;
import java.util.List;

@Service
public interface CountryService {

    List<Country> getAllCountry();
}
