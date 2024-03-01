package com.angularspringboot.backend;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name="Regions")
@Table(name="regions")
public class Regions {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer region_id;
	private Integer continent_id;
	private String name;
	
	public Integer getRegion_id() {
		return region_id;
	}
	public Integer getContinent_id() {
		return continent_id;
	}
	public String getName() {
		return name;
	}
}
