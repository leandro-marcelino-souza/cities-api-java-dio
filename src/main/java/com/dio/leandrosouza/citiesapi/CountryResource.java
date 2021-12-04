package com.dio.leandrosouza.citiesapi;

import java.util.List;

import com.dio.leandrosouza.citiesapi.countries.Country;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryResource {


    @GetMapping("/countries")
    public List<Country> cities() {

        return repository.findAll();
    }
}