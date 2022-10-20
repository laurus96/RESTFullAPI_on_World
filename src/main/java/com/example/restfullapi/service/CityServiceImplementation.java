package com.example.restfullapi.service;

import com.example.restfullapi.model.CountryBean;
import com.example.restfullapi.entity.City;
import com.example.restfullapi.model.CityBean;
import com.example.restfullapi.repository.CityRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
@Slf4j
@Transactional(readOnly = true)
public class CityServiceImplementation implements CityService {

    private final CityRepository cityRepository;

    @Autowired
    public CityServiceImplementation(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    @Override
    public List<CityBean> getCityAll() {
        log.info("Fetching cities ...");

        List<City> cities = cityRepository.findAll();

        if(!CollectionUtils.isEmpty(cities)){
            List<CityBean> citiesBean = new ArrayList<>();

            try {
                cities.stream().forEach(city -> {
                    CityBean c = new CityBean();
                    BeanUtils.copyProperties(city, c);
                    if (!Objects.isNull(city.getCountry())) {
                        CountryBean countryBean = new CountryBean();
                        BeanUtils.copyProperties(city.getCountry(), countryBean);
                        c.setCountry(countryBean);
                    }
                    citiesBean.add(c);
                });

                return citiesBean;

            }catch (RuntimeException e){
                log.error(e.getMessage());
            }

        }

        return null;
    }
}
