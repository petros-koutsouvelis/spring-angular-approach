package com.angularspringboot.backend;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name="Countries")
@Table(name="countries")
public class Countries{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer country_id;
	private String name;
	private BigDecimal area;
	private String country_code2;
	private String country_code3;
	private Integer region_id;
	
	public Integer getCountry_id() {
		return country_id;
	}
	
	public String getName() {
		return name;
	}
	
	public BigDecimal getArea() {
		return area;
	}
	
	public String getCountry_code2() {
		return country_code2;
	}
	
	public String getCountry_code3() {
		return country_code3;
	}

	public Integer getRegion_id() {
		return region_id;
	}
	
}
