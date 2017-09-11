package com.hygogg.languages.repositories;

import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

import com.hygogg.languages.models.Language;

@Repository
public interface LanguageRepository extends CrudRepository<Language, Long> {
	Long countByNameContaining(String search);
}
