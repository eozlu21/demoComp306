// CityService.java
package com.example.demo.service;

import com.example.demo.entity.City;
import com.example.demo.repository.CityRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CityService {
    private final CityRepository cityRepository;

    public City getCityById(Integer id) {
        return cityRepository.findCityById(id);
    }
}