package com.rodoleon.ObjectMaster;

public class Wizard extends Human{
	
	public Wizard() {
	super.setIntelligence(8);
	super.setHealth(50);
	}
	
	public void healHuman(Human target) {
		target.setHealth(target.getHealth()+(this.getIntelligence()));
		System.out.println("You have healed "+target);
	}
	public void castFireball(Human target) {
		target.setHealth(target.getHealth()-(this.getIntelligence()*3));
		System.out.println("You cast a fireball against "+target);
	}
}
