package com.dio.leandrosouza.citiesapi;

import java.util.List;

import com.dio.leandrosouza.citiesapi.countries.Country;
import com.dio.leandrosouza.citiesapi.repository.CountryRepository;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
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
    public Page<Country> countries(Pageable page) {

        return repository.findAll(page);
    }
}