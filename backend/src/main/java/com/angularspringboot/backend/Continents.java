package com.angularspringboot.backend;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name="Continents")
@Table(name="continents")
public class Continents {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer continent_id;
	private String name;
	
	public Integer getContinent_id() {
		return continent_id;
	}
	public String getName() {
		return name;
	}
}

