// CountryRepository.java
package com.example.demo.repository;

import com.example.demo.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CountryRepository extends JpaRepository<Country, String> {
    @Query(value = "SELECT * FROM country", nativeQuery = true)
    List<Country> findAllCountries();

    @Query(value = "SELECT * FROM country WHERE Code = :code", nativeQuery = true)
    Country findCountryByCode(@Param("code") String code);
}