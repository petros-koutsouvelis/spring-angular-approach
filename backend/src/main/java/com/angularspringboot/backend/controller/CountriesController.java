package com.angularspringboot.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.angularspringboot.backend.Countries;
import com.angularspringboot.backend.service.CountriesService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/api/countries")
public class CountriesController {
	@Autowired
    private CountriesService countriesService;

	@GetMapping
    public ResponseEntity<List<Countries>> getAllCountries() {
        List<Countries> countries = countriesService.getAllCountries();
        return ResponseEntity.ok(countries);
    }
	
}
