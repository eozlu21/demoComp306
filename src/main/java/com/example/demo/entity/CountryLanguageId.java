// CountryLanguageId.java for composite key
package com.example.demo.entity;

import java.io.Serializable;
import lombok.*;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor @EqualsAndHashCode
public class CountryLanguageId implements Serializable {
    private String countryCode;
    private String language;
}