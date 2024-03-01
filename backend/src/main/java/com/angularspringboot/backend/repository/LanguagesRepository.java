package com.angularspringboot.backend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.angularspringboot.backend.Languages;

public interface LanguagesRepository extends JpaRepository<Languages, Integer> {
	List<Languages> findByLanguageId(Integer languageId);
}
