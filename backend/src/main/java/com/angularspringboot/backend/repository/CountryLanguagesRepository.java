package com.angularspringboot.backend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.angularspringboot.backend.CountryLanguages;
import com.angularspringboot.backend.CountryLanguagesKey;

public interface CountryLanguagesRepository extends JpaRepository<CountryLanguages, CountryLanguagesKey> {
	 List<CountryLanguages> findByCountryId(Long countryId);
}