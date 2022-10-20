package com.example.restfullapi.entity;

import com.example.restfullapi.countrylanguage.CountryLanguageId;
import com.example.restfullapi.countrylanguage.CountryOfficialLanguage;
import com.example.restfullapi.countrylanguage.CountryOfficialLanguageConverter;
import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "countrylanguage")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@IdClass(CountryLanguageId.class)
public class CountryLanguage {

    @Id
    @Column(name = "CountryCode")
    private String countryCode;

    @Id
    @Column(name = "Language")
    private String language;

    @Column(name = "IsOfficial", columnDefinition = "enum('T', 'F')")
    @Convert(converter = CountryOfficialLanguageConverter.class)
    private CountryOfficialLanguage isOfficial;

    @Column(name = "Percentage", columnDefinition = "decimal(4,1)")
    private BigDecimal percentage;
}
