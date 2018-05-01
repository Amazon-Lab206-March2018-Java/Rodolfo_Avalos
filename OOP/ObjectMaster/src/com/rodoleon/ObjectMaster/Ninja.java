package com.rodoleon.ObjectMaster;

public class Ninja extends Human{
	public Ninja() {
		super.setStealth(10);
	}
	public void stealHealth(Human target) {
		target.setHealth(target.getHealth()-this.getStealth());
		this.setHealth(this.getHealth()+this.getStealth());
		System.out.println("You have stolen health from "+target);
	}
	public void runAway() {
		this.setHealth(this.getHealth()-10);
	}
}
