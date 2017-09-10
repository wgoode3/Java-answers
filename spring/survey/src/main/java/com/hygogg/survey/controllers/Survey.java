package com.hygogg.survey.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class Survey {
	@RequestMapping("")
    public String index(Model model, HttpSession session) {
            return "index.jsp";
    }
	
	@RequestMapping(path="process", method=RequestMethod.POST)
    public String process(@RequestParam(value="name") String name, 
    		@RequestParam(value="location") String location,
    		@RequestParam(value="language") String language,
    		@RequestParam(value="comment") String comment, HttpSession session){
		session.setAttribute("name", name);
		session.setAttribute("location", location);
		session.setAttribute("language", language);
		session.setAttribute("comment", comment);
		return "redirect:/result";
	}
	
	@RequestMapping("result")
	public String result(HttpSession session) {
		return session.getAttribute("language").equals("Java") ? "javaRocks.jsp" : "surveyResult.jsp";
	}
}
