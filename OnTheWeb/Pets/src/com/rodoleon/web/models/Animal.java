package com.rodoleon.web.models;

public class Animal {
	protected String name;
	protected String breed;
	protected double weight;
	
	public Animal() {
		name="Fido";
		breed="Mixed";
		weight=25;		
	}
	
	public Animal(String name, String breed, double weight) {
		this.name=name;
		this.breed=breed;
		this.weight=weight;
	}
	public String getName() {
		return this.name;
	}
	public String getBreed() {
		return this.breed;
	}
	public double getWeight() {
		return this.weight;
	}
	public void setName(String name) {
		this.name=name; 
	}
	public void setBreed(String breed) {
		this.breed=breed;
	}
	public void setWeight(double weight) {
		this.weight=weight;
	}
}
