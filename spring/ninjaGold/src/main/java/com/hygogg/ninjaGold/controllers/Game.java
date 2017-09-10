package com.hygogg.ninjaGold.controllers;

import java.util.ArrayList;
import java.util.Random;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class Game {
	@RequestMapping("")
    public String index(Model model, HttpSession session) {
        if(session.getAttribute("gold") == null) {
        	session.setAttribute("gold", 0);
        	ArrayList<String> activities = new ArrayList<String>();
        	session.setAttribute("activities", activities);
        }
		return "index.jsp";
    }
	
	@RequestMapping(path = "/rpg/{place}", method = RequestMethod.POST)
	public String rpg(@PathVariable String place, Model model, HttpSession session) {
		Random rand = new Random();
		java.util.Date date = new java.util.Date();
		ArrayList<String> activities = (ArrayList) session.getAttribute("activities");
		Integer g = (Integer) session.getAttribute("gold");
		int gold = 0;
		if(place.equals("farm")) {
			gold = rand.nextInt(3) + 3;
		}else if(place.equals("cave")) {
			gold = rand.nextInt(5) + 6;
		}else if(place.equals("house")) {
			gold = rand.nextInt(10) + 11;
		}else if(place.equals("casino")) {
			if(g == 0) {
				activities.add("You tried to enter a casino with no money and were turned away. (" + date + ")");
			} else {
				gold = rand.nextInt(50) + 1;
				if(rand.nextBoolean()) {
					if(gold > g) {
						gold = g;
					}
					g-=gold;
					activities.add("You entered a casino and lost " + gold + " gold. Ouch. (" + date + ")");
				} else {
					g+=gold;
					activities.add("You entered a casino and won " + gold + " gold. (" + date + ")");
				}
			}
		}
		if(!place.equals("casino")) {
			g+=gold;
			activities.add("You entered a " + place + " and earned " + gold + " gold. (" + date + ")");
		}
		session.setAttribute("gold", g);
		session.setAttribute("activities", activities);
		return "redirect:/";
	}
	
	@RequestMapping("/reset")
	public String reset(HttpSession session) {
		session.setAttribute("gold", 0);
    	ArrayList<String> activities = new ArrayList<String>();
    	session.setAttribute("activities", activities);
    	return "redirect:/";
	}
}