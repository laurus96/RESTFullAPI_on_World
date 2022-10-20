package com.example.restfullapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CityBean {

    @JsonProperty("idCity")
    private Integer id;

    private String name;

    private CountryBean country;

    private String code;

    private String district;

    private Integer population;
}
