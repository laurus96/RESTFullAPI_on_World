package com.example.restfullapi.model;

import com.example.restfullapi.countrylanguage.CountryOfficialLanguage;

import java.math.BigDecimal;

public class CountryLanguageBean {

    private String countryCode;

    private String language;

    private CountryOfficialLanguage isOfficial;

    private BigDecimal percentage;
}
