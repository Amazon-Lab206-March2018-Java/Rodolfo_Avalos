package com.rodoleon.characters;

public class StarWarsCharacter {
	private String name;
	private double weight;
	private String famous_saying;
	
	public StarWarsCharacter() {
		name = "NewCharacter";
		weight = 20;
		famous_saying = "I have a bad feeling about this.";
	}
	
	public StarWarsCharacter (String name, double weight, String saying) {
		this.name=name;
		this.weight=weight;
		this.famous_saying=saying;
	}
	
	public String getName() {
		return this.name;
	}
	
	public double getWeight() {
		return this.weight;
	}
	
	public String getWords() {
		return this.famous_saying;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public void setWeight(double weight) {
		this.weight=weight;
	}
	
	public void setWords(String words) {
		this.famous_saying=words;
	}
	
	public String greetAndMeet(StarWarsCharacter character) {
		System.out.println("Hello, "+character.getName()+", I am "+this.getName());
		return ("Hello, "+character.getName()+", I am "+this.getName()+".");
	}

}
