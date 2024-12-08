// CityRepository.java
package com.example.demo.repository;

import com.example.demo.entity.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CityRepository extends JpaRepository<City, Integer> {
    @Query(value = "SELECT * FROM city WHERE CountryCode = :code", nativeQuery = true)
    List<City> findCitiesByCountryCode(@Param("code") String code);

    @Query(value = "SELECT * FROM city WHERE ID = :id", nativeQuery = true)
    City findCityById(@Param("id") Integer id);
}