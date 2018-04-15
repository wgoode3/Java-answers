package com.hygogg.basicspring.controllers;

import java.util.Date;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String index(Model model, HttpSession session) {
		model.addAttribute("test", "Test");
		Date d = new Date();
		model.addAttribute("date", d);
		if(session.getAttribute("count") == null) {
			session.setAttribute("count", 1);
		} else {
			Integer count = (Integer) session.getAttribute("count");
			session.setAttribute("count", count+1);
		}
		return "index";
	}
	
	@RequestMapping("/reset")
	public String reset(HttpSession session, RedirectAttributes flash) {
		flash.addFlashAttribute("msg", "You just reset!");
		session.setAttribute("count", 0);
		session.removeAttribute("name");
		return "redirect:/";
	}
	
	@RequestMapping(path="/survey", method = RequestMethod.POST)
	public String survey(@RequestParam(value="name") String name, HttpSession session) {
		System.out.println(name);
		session.setAttribute("name", name);
		return "redirect:/";
	}
	
}
