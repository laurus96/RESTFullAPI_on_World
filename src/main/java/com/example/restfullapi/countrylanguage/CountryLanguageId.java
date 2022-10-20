package com.example.restfullapi.countrylanguage;

import com.example.restfullapi.country.Country;
import lombok.*;

import java.io.Serial;
import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class CountryLanguageId implements Serializable {

    @Serial
    private static final long serialVersionUID = -1986120480764358649L;

    private Country country;
    private String language;

}
