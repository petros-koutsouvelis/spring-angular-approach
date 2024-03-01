package com.angularspringboot.backend;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;

@Entity(name = "country_languages")
@Table(name = "country_languages")
@IdClass(CountryLanguagesKey.class)
public class CountryLanguages {
//	
//	@Id
//	@Column(name="ROWID")
//	String rowid;


    @Id
    private Integer countryId;
	@Id
    private Integer language_id;
    
//    public String getRowid() {
//		return rowid;
//		
//	}

    public Integer getCountry_id() {
		return countryId;
	}
    
    public Integer getLanguage_id() {
		return language_id;
	}
    
}
