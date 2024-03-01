package com.angularspringboot.backend.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.angularspringboot.backend.CombinedStats;
import com.angularspringboot.backend.CombinedTable;
import com.angularspringboot.backend.Countries;
import com.angularspringboot.backend.CountryStats;
import com.angularspringboot.backend.Regions;
import com.angularspringboot.backend.Continents;
import com.angularspringboot.backend.service.ContinentsService;
import com.angularspringboot.backend.service.CountriesService;
import com.angularspringboot.backend.service.CountryStatsService;
import com.angularspringboot.backend.service.RegionsService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/api/stats")
public class CountryStatsController {
	@Autowired
	private CountryStatsService countryStatsService;
	@Autowired
    private CountriesService countriesService;
	@Autowired
    private RegionsService regionsService;
	@Autowired
    private ContinentsService continentsService;
	
	@GetMapping
    public ResponseEntity<List<CombinedTable>> getAllStats(){
		List<CountryStats> countryStats = countryStatsService.getAllCountryStats();
		List<Countries> countries = countriesService.getAllCountries();
	
		Map<Integer, CountryStats> countryStatsMap = countryStats.stream()
		        .collect(Collectors.toMap(CountryStats::getCountry_id, Function.identity(), (existing, replacement) -> existing));

		List<CombinedTable> combinedTableList = new ArrayList<>();
		
		for (Countries country : countries) {
			Integer country_id = country.getCountry_id();
			if (countryStatsMap.containsKey(country_id)) {
				CountryStats countryStat = countryStatsMap.get(country_id);
				
				CombinedTable combinedTable = new CombinedTable();
				combinedTable.setCountry_id(country_id);
				combinedTable.setName(country.getName());
				combinedTable.setCountry_code3(country.getCountry_code3());
				combinedTable.setYear(countryStat.getYear());
				combinedTable.setPopulation(countryStat.getPopulation());
				combinedTable.setGdp(countryStat.getGdp());
				
				combinedTableList.add(combinedTable);
			}
		}
		
		return ResponseEntity.ok(combinedTableList);
	}
	
	@GetMapping("/all")
    public ResponseEntity<List<CombinedStats>> getFullStats(){
		List<CountryStats> countryStats = countryStatsService.getAllCountryStats();
		List<Countries> countries = countriesService.getAllCountries();
		List<Regions> regions = regionsService.getAllRegions();
		List<Continents> continents = continentsService.getAllContinents();
	
		Map<Integer, CountryStats> countryStatsMap = countryStats.stream()
		        .collect(Collectors.toMap(CountryStats::getCountry_id, Function.identity(), (existing, replacement) -> existing));
		
		Map<Integer, Regions> regionsMap = regions.stream()
		        .collect(Collectors.toMap(Regions::getContinent_id, Function.identity(), (existing, replacement) -> existing));
		
		Map<Integer, Continents> continentsMap = continents.stream()
		        .collect(Collectors.toMap(Continents::getContinent_id, Function.identity(), (existing, replacement) -> existing));

		List<CombinedStats> combinedStatsList = new ArrayList<>();
		
		for (Countries country : countries) {
			Integer country_id = country.getCountry_id();
			Integer country_regions_id = country.getRegion_id();
			if (countryStatsMap.containsKey(country_id) &&
					regionsMap.containsKey(country_regions_id)) {
				CountryStats countryStat = countryStatsMap.get(country_id);
				Regions region = regionsMap.get(country_regions_id);
				if(continentsMap.containsKey(region.getContinent_id())) {
					Continents continent = continentsMap.get(region.getContinent_id());
					
					
					CombinedStats combinedStats = new CombinedStats();
					combinedStats.setContinentsName(continent.getName());
					combinedStats.setCountryName(country.getName());
					combinedStats.setRegionName(region.getName());
					combinedStats.setYear(countryStat.getYear());
					combinedStats.setPopulation(countryStat.getPopulation());
					combinedStats.setGdp(countryStat.getGdp());
					
					combinedStatsList.add(combinedStats);
				}

			}
		}
		
		return ResponseEntity.ok(combinedStatsList);
	}

}
