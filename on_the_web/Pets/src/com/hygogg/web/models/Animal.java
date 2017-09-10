package com.hygogg.web.models;

public abstract class Animal {
	protected String name;
	protected String breed;
	protected int weight;
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBreed() {
		return this.breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public int getWeight() {
		return this.weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
}
