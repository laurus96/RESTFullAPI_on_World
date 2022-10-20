package com.example.restfullapi.city;

import com.example.restfullapi.country.Country;
import lombok.*;

import javax.persistence.*;


@Entity
@Table(name = "city")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class City {

    @Id
    @Column(name = "ID")
    private Integer id;

    @Column(name = "Name", columnDefinition = "char(35)")
    private String name;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "CountryCode", referencedColumnName = "Code")
    private Country country;

    @Column(name = "District", columnDefinition = "char(20)")
    private String district;

    @Column(name = "Population")
    private Integer population;




}
