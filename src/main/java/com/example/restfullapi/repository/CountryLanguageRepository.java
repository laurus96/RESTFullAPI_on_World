package com.example.restfullapi.repository;


import com.example.restfullapi.entity.CountryLanguage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.lang.Nullable;

import java.util.List;

public interface CountryLanguageRepository extends JpaRepository<CountryLanguage, String> {
    @Nullable
    List<CountryLanguage> findSpokenLanguage(String countryName); /* Named Query */
    @Nullable
    CountryLanguage findOfficialLanguage(String countryName); /* Named Query */
    @Nullable
    List<CountryLanguage> findNonOfficialLanguage(String countryName); /* Named Query */
}
