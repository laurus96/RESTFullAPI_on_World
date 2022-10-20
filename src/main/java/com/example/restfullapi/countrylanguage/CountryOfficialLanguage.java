package com.example.restfullapi.countrylanguage;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum CountryOfficialLanguage {
    TRUE("T"),
    FALSE("F");

    private String value;

}
