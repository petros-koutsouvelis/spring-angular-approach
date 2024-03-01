package com.angularspringboot.backend;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "languages")
public class Languages {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer languageId;
	
	private String language;
	
	public Integer getLanguage_id() {
		return languageId;
	}

	public String getLanguage() {
		return language;
	}
}
