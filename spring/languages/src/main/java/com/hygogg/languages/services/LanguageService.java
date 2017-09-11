package com.hygogg.languages.services;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.hygogg.languages.models.Language;
import com.hygogg.languages.repositories.LanguageRepository;

@Service
public class LanguageService {

	private LanguageRepository languageRepository;
	
	public LanguageService(LanguageRepository languageRepository){
		this.languageRepository = languageRepository;
	}
	
	public ArrayList<Language> all(){
		return (ArrayList<Language>) languageRepository.findAll();
	}
	
	public void addLanguage(Language language) {
		languageRepository.save(language);
	}
}
