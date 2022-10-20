package com.example.restfullapi.repository;


import com.example.restfullapi.entity.CountryLanguage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryLanguageRepository extends JpaRepository<CountryLanguage, String> {
}
