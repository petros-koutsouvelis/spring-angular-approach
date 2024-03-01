package com.angularspringboot.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.angularspringboot.backend.Regions;
import com.angularspringboot.backend.repository.RegionsRepository;

@Service
public class RegionsService {
	@Autowired
    private RegionsRepository regionsRepository;

	public List<Regions> getAllRegions() {
        return regionsRepository.findAll();
    }
}
