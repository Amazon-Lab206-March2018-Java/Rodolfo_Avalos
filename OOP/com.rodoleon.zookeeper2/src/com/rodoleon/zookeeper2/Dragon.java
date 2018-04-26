package com.rodoleon.zookeeper2;

public class Dragon extends Mammal{
	public Dragon() {
		super.setEnergyLevel(300);
	}
	public void fly() {
		System.out.println("Swoosh. With a mighty movement of his wings, the dragon takes to the sky!");
		super.setEnergyLevel(super.getEnergyLevel()-50);
	}
	public void eatHumans() {
		System.out.println("Oh no! The dragon has eaten a bystander");
		super.setEnergyLevel(super.getEnergyLevel()+25);
	}
	public void attackTown() {
		System.out.println("The town is on fire.");
		super.setEnergyLevel(super.getEnergyLevel()-100);
	}
}
