package com.angularspringboot.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.angularspringboot.backend.Languages;
import com.angularspringboot.backend.repository.LanguagesRepository;

@Service
public class LanguagesService {
	@Autowired
    private LanguagesRepository languagesRepository;

    public List<Languages> getLanguageByLanguageId(Integer languageId) {
        return languagesRepository.findByLanguageId(languageId);
    }
}
