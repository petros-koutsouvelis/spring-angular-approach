package com.angularspringboot.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.angularspringboot.backend.Continents;

public interface ContinentsRepository extends JpaRepository<Continents, Integer> {
}
