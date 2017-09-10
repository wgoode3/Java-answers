package com.hygogg.web.models;

public class Dog extends Animal implements Pet{
	public Dog(String name, String breed, int weight) {
		this.name = name;
		this.breed = breed;
		this.weight = weight;
	}
	
	public String showAffection() {
		if(this.weight < 30) {
			return String.format("%s hopped into your lap.", this.name);
		} else {
			return String.format("%s curled up next to you.", this.name);
		}
	}
}
