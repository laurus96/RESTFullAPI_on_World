package com.example.restfullapi.entity;

import lombok.*;
import javax.persistence.*;


@Entity
@Table(name = "city")

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class City {

    @Id
    @Column(name = "ID")
    private Integer id;

    @Column(name = "Name", columnDefinition = "char(35)")
    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CountryCode", nullable = false)
    private Country country;

    @Column(name = "CountryCode", insertable = false, updatable = false)
    private String code;

    @Column(name = "District", columnDefinition = "char(20)")
    private String district;

    @Column(name = "Population")
    private Integer population;




}
