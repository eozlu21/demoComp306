// CountryLanguageRepository.java
package com.example.demo.repository;

import com.example.demo.entity.CountryLanguage;
import com.example.demo.entity.CountryLanguageId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryLanguageRepository extends JpaRepository<CountryLanguage, CountryLanguageId> {
}