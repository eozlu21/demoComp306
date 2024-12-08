// CountryService.java
package com.example.demo.service;

import com.example.demo.entity.City;
import com.example.demo.entity.Country;
import com.example.demo.repository.CityRepository;
import com.example.demo.repository.CountryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CountryService {
    private final CountryRepository countryRepository;
    private final CityRepository cityRepository;

    public List<Country> getAllCountries() {
        return countryRepository.findAllCountries();
    }

    public Country getCountryByCode(String code) {
        return countryRepository.findCountryByCode(code);
    }

    public List<City> getCitiesByCountryCode(String code) {
        return cityRepository.findCitiesByCountryCode(code);
    }
}