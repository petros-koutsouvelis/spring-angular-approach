package com.angularspringboot.backend;

import java.math.BigDecimal;

public class CombinedStats {
	
	private String continentsName;
	private String regionName;
	private String countryName;
	private Integer year;
	private Integer population;
	private BigDecimal gdp;
	
	public String getContinentsName() {
		return continentsName;
	}
	public void setContinentsName(String continentsName) {
		this.continentsName = continentsName;
	}
	public String getRegionName() {
		return regionName;
	}
	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	public Integer getPopulation() {
		return population;
	}
	public void setPopulation(Integer population) {
		this.population = population;
	}
	public BigDecimal getGdp() {
		return gdp;
	}
	public void setGdp(BigDecimal gdp) {
		this.gdp = gdp;
	}
	
}
