package com.angularspringboot.backend;

import java.math.BigDecimal;

import jakarta.persistence.Id;

public class CombinedTable {
	@Id
	private Integer country_id;
	private String name;
//	private BigDecimal area;
//	private String country_code2;
	private String country_code3;
	
	private Integer year;
	private Integer population;
	private BigDecimal gdp;
	
	public Integer getCountry_id() {
		return country_id;
	}
	
	public void setCountry_id(Integer country_id) {
		this.country_id = country_id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
//	public BigDecimal getArea() {
//		return area;
//	}
//	public void setArea(BigDecimal area) {
//		this.area = area;
//	}
//	public String getCountry_code2() {
//		return country_code2;
//	}
//	public void setCountry_code2(String country_code2) {
//		this.country_code2 = country_code2;
//	}
	public String getCountry_code3() {
		return country_code3;
	}
	public void setCountry_code3(String country_code3) {
		this.country_code3 = country_code3;
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
