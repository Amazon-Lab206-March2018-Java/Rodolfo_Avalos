package com.rodoleon.ObjectMaster;

public class Samurai extends Human{
	public Samurai() {
		super.setHealth(200);
	}
	public void doDeathblow(Human target) {
		target.setHealth(0);
		this.setHealth(this.getHealth()/2);
		System.out.println("You have struck a deathblow against "+target+". Your health has decreased.");
	}
	public void meditate() {
		this.setHealth(this.getHealth()+(this.getHealth()/2));
		System.out.println("You have meditated and recovered health.");
	}
	public int howMany() {
		System.out.println("My current health is "+this.getHealth());
		return this.getHealth();
	}
}
