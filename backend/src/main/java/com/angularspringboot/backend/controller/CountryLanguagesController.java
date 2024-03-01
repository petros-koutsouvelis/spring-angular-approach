package com.angularspringboot.backend.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.angularspringboot.backend.CountryLanguages;
import com.angularspringboot.backend.Languages;
import com.angularspringboot.backend.service.CountryLanguagesService;
import com.angularspringboot.backend.service.LanguagesService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/api/countries")
public class CountryLanguagesController {
	@Autowired
    private CountryLanguagesService countryLanguagesService;
	
	@Autowired
    private LanguagesService languagesService;
	
	@GetMapping("/{countryId}/languages")
    public List<Languages> getLanguagesByCountryId(@PathVariable Long countryId) {
		List<CountryLanguages> countryLanguages = countryLanguagesService.getLanguagesByCountryId(countryId);
		List<Languages> language= new ArrayList<>();
		List<Languages> temp = null;
		for(CountryLanguages countryLanguage:countryLanguages) {
			
			temp = languagesService.getLanguageByLanguageId((Integer)(countryLanguage.getLanguage_id()));
			language.addAll(temp);		
		}
		return language;
    }
	
	
}
