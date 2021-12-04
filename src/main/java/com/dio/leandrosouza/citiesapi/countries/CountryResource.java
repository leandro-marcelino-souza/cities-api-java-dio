package com.dio.leandrosouza.citiesapi.countries;

import java.util.Optional;

import com.dio.leandrosouza.citiesapi.countries.Country;
import com.dio.leandrosouza.citiesapi.countries.repository.CountryRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
    //implementando retornos na class CountryResource

    @GetMapping("/{id}")
    public ResponseEntity<Object> getOne(@PathVariable Long id){
        Optional<Country> optional = repository.findById(id);

        //tratando exceção
        if (optional.isPresent()) {
            return ResponseEntity.ok().body(optional.get());
        } else {
            return  ResponseEntity.notFound().build();
        }
    }
}