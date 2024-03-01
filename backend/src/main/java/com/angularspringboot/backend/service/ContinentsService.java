package com.angularspringboot.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.angularspringboot.backend.Continents;
import com.angularspringboot.backend.repository.ContinentsRepository;

@Service
public class ContinentsService {
	@Autowired
    private ContinentsRepository continentsRepository;

	public List<Continents> getAllContinents() {
        return continentsRepository.findAll();
    }
}
