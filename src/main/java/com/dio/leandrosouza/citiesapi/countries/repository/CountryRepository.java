package com.dio.leandrosouza.citiesapi.countries.repository;

import com.dio.leandrosouza.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
