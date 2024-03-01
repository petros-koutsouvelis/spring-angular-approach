package com.angularspringboot.backend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.angularspringboot.backend.CountryStats;

public interface CountryStatsRepository extends JpaRepository<CountryStats, Integer>{
	@Query("SELECT e FROM Country_stats e WHERE (e.country_id, e.gdp) IN (SELECT e2.country_id, MAX(e2.gdp) FROM Country_stats e2 GROUP BY e2.country_id)")
	List<CountryStats> findHighestGdpByCountry();
}
	