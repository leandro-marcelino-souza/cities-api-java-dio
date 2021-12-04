package com.dio.leandrosouza.citiesapi.repository;

import com.dio.leandrosouza.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
