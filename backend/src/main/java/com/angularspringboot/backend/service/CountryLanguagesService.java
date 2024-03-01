package com.angularspringboot.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.angularspringboot.backend.CountryLanguages;
import com.angularspringboot.backend.repository.CountryLanguagesRepository;

import java.util.List;

@Service
public class CountryLanguagesService {
    @Autowired
    private CountryLanguagesRepository countryLanguageRepository;

    public List<CountryLanguages> getLanguagesByCountryId(Long countryId) {
        return countryLanguageRepository.findByCountryId(countryId);
    }
}