package com.example.restfullapi.city;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(path = "/api/v1/cities")
@AllArgsConstructor
public class CityController {

    @Autowired
    private final CityService cityService;

    @GetMapping
    public @ResponseBody List<City> getCityAll(){
        return cityService.getCityAll();
    }

}
