package com.example.restfullapi.city;

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

    //@ManyToOne
    //@JoinColumn(name = "countryCode", foreignKey = @ForeignKey(name = "city_ibfk_1"))
    @Column(name = "CountryCode")
    private String countryCode;

    @Column(name = "District", columnDefinition = "char(20)")
    private String district;

    @Column(name = "Population")
    private Integer population;




}
