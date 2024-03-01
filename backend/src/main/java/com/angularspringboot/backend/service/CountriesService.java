package com.angularspringboot.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.angularspringboot.backend.Countries;
import com.angularspringboot.backend.repository.CountriesRepository;
@Service
public class CountriesService {
	@Autowired
    private CountriesRepository countriesRepository;

    public List<Countries> getAllCountries() {
        return countriesRepository.findAll();
    }
    
}
