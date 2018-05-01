package com.rodoleon.ObjectMaster;

public class Human {
	private int strength;
	private int stealth;
	private int intelligence;
	private int health;
	
	public Human() {
		strength = 3;
		stealth = 3;
		intelligence= 3;
		health = 100;
	}

	public int getStrength() {
		return strength;
	}
	
	public String showStats() {
		System.out.println("My strength is: "+this.strength+". My stealth is: "+this.stealth+". My intelligence is: "+this.intelligence+". My health is: "+this.health+".");
		return ("My strength is: "+strength+". My stealth is: "+stealth+". My intelligence is: "+intelligence+". My health is: "+health);
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public int getStealth() {
		return stealth;
	}

	public void setStealth(int stealth) {
		this.stealth = stealth;
	}

	public int getIntelligence() {
		return intelligence;
	}

	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}
	public void attackHuman(Human target) {
		target.setHealth(target.getHealth()-this.getStrength());
		System.out.println("You have attacked.");
	}
}