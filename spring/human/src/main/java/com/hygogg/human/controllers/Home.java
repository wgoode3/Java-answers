package com.hygogg.human.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Home {
	@RequestMapping("/")
    public String index(@RequestParam(value = "firstName", required = false, defaultValue = "human") String firstName, 
    		@RequestParam(value = "lastName", required = false, defaultValue = "") String lastName) {
		if(lastName.length() > 0) {
        	lastName = " " + lastName;
        }
		return "<h1>Hello " + firstName + lastName + "!<h1><h3>Welcome to SpringBoot!</h3>";
    }
}
