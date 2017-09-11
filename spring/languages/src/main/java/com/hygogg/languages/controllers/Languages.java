package com.hygogg.languages.controllers;

import java.util.ArrayList;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hygogg.languages.models.Language;
import com.hygogg.languages.services.LanguageService;

@Controller
public class Languages {
	
	private LanguageService languageService;
	
	public Languages(LanguageService languageService){
		this.languageService = languageService;
	}
	
	@RequestMapping("/")
	public String index(Model model) {
		model.addAttribute("language", new Language());
		model.addAttribute("languages",languageService.all());
		return "index";
	}
	
	@PostMapping("/languages/new")
	public String newLanguage(@Valid @ModelAttribute("language") Language language, BindingResult result, Model model) {
		if (result.hasErrors()) {
			model.addAttribute("languages",languageService.all());
			return "index";
        } else {
        	languageService.addLanguage(language);
            return "redirect:/";
        }
	}
}