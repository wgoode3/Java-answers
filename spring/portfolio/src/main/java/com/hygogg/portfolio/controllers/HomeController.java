package com.hygogg.portfolio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {
        @RequestMapping("")
        public String home() {
                return "index.html";
        }
        
        @RequestMapping("/about_me")
        public String about() {
        	return "about.html";
        }
        
        @RequestMapping("/my_projects")
        public String projects() {
        	return "projects.html";
        }
}