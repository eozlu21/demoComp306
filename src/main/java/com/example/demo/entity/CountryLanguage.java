// CountryLanguage.java
package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "countrylanguage")
@IdClass(CountryLanguageId.class) // Composite PK class we'll define below
@Getter @Setter @NoArgsConstructor
public class CountryLanguage {
    @Id
    @Column(name = "CountryCode")
    private String countryCode;

    @Id
    @Column(name = "Language")
    private String language;

    @Column(name = "IsOfficial")
    private String isOfficial; // 'T' or 'F'

    @Column(name = "Percentage")
    private Double percentage;
}

