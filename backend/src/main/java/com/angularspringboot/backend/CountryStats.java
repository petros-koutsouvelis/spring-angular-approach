package com.angularspringboot.backend;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name="Country_stats")
@Table(name="country_stats")
public class CountryStats{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer country_id;
	private Integer year;
	private Integer population;
	private BigDecimal gdp;
	
	public Integer getCountry_id() {
		return country_id;
	}
	
	public Integer getYear() {
		return year;
	}
	
	public Integer getPopulation() {
		return population;
	}
	
	public BigDecimal getGdp() {
		return gdp;
	}

}
