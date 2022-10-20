package com.example.restfullapi.country;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.lang.Nullable;

public interface CountryRepository extends JpaRepository<Country, Character[]> {
    @Nullable
    Country findCountryByCode(String code);
    @Nullable
    Country findCountryByName(String name);

}
