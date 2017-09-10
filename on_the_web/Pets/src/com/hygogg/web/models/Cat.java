package com.hygogg.web.models;

public class Cat extends Animal implements Pet{
	public Cat(String name, String breed, int weight) {
		this.name = name;
		this.breed = breed;
		this.weight = weight;
	}
	
	public String showAffection() {
		return String.format("Your %s cat %s looked up at you with some affection, you think.", this.breed, this.name);
	}
}
