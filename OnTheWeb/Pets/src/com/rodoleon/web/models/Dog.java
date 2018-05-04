package com.rodoleon.web.models;

public class Dog extends Animal implements Pet{
	
	public Dog(String name, String breed, double weight) {
		super (name, breed, weight);
	}
	
	public String showAffection() {
		if (this.getWeight()<30) {
			return (this.getName()+" hopped into your lap and cuddled you");
		}else {
			return (this.getName()+" walks up to you and curls next to your feet");
		}
	}

}
