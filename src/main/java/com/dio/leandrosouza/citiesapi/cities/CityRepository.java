package com.dio.leandrosouza.citiesapi.cities;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<City, Long> {
}