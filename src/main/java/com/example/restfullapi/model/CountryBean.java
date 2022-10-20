package com.example.restfullapi.model;

import com.example.restfullapi.country.Continent;
import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CountryBean {

    private String code;

    private String name;

    private Continent continent;

    private String region;

    private BigDecimal surfaceArea;

    private Short indepYear;

    private Integer population;

    private BigDecimal lifeExpectancy;

    private BigDecimal gnp;

    private BigDecimal gnpOld;

    private String localName;

    private String governmentForm;

    private String headOfState;

    private Integer capital;

    private String code2;

}
