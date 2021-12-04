package com.dio.leandrosouza.citiesapi;

import java.util.List;

import com.dio.leandrosouza.citiesapi.countries.Country;
import com.dio.leandrosouza.citiesapi.repository.CountryRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/countries")
public class CountryResource {

    private CountryRepository repository;

    public CountryResource(CountryRepository repository) {
        this.repository = repository;
    }



    @GetMapping
    public List<Country> countries() {

        return repository.findAll();
    }
}