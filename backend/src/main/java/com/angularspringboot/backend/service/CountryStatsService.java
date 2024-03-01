package com.angularspringboot.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.angularspringboot.backend.CountryStats;
import com.angularspringboot.backend.repository.CountryStatsRepository;

@Service
public class CountryStatsService {
	@Autowired
    private CountryStatsRepository countryStatsRepository;

    public List<CountryStats> getAllCountryStats() {
        return countryStatsRepository.findHighestGdpByCountry();
    }
}
