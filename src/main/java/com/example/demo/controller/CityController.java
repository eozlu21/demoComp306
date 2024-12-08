// CityController.java
package com.example.demo.controller;

import com.example.demo.entity.City;
import com.example.demo.service.CityService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
@RequiredArgsConstructor
public class CityController {
    private final CityService cityService;

    @GetMapping("/cities/{id}")
    public String cityDetails(@PathVariable Integer id, Model model) {
        City city = cityService.getCityById(id);
        model.addAttribute("city", city);
        return "city";
    }
}