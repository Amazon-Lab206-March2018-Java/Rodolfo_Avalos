package com.rodoleon.zookeeper;

public class Mammal {
	private int energyLevel;
	
	public Mammal() {
		energyLevel=100;
	}

	public void displayEnergyLevel() {
		System.out.println("My current energyLevel level is "+energyLevel);
	}

	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}
	public int getEnergyLevel() {
		return energyLevel;
	}
}