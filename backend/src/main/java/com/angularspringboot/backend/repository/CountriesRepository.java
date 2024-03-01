package com.angularspringboot.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.angularspringboot.backend.Countries;

public interface CountriesRepository extends JpaRepository<Countries, Integer>{

}
