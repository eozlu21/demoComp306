// CountryController.java
package com.example.demo.controller;

import com.example.demo.entity.City;
import com.example.demo.entity.Country;
import com.example.demo.service.CountryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class CountryController {
    private final CountryService countryService;

    @GetMapping("/countries")
    public String listAllCountries(Model model) {
        List<Country> countries = countryService.getAllCountries();
        model.addAttribute("countries", countries);
        return "countries";
    }

    @GetMapping("/countries/{code}")
    public String countryDetails(@PathVariable String code, Model model) {
        Country country = countryService.getCountryByCode(code);
        List<City> cities = countryService.getCitiesByCountryCode(code);
        model.addAttribute("country", country);
        model.addAttribute("cities", cities);
        return "country";
    }
}