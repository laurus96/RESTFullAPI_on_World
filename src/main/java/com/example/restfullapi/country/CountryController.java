package com.example.restfullapi.country;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@AllArgsConstructor
@Controller
@RequestMapping(path = "/api/v1/country")
public class CountryController {

    @Autowired
    private final CountryService countryService;

    @GetMapping
    @Transactional(readOnly = true)
    public @ResponseBody List<Country> getAllCountry(){
        return countryService.getAllCountry();
    }


}
