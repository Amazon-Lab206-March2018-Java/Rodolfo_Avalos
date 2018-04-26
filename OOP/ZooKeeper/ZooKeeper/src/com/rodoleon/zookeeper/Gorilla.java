package com.rodoleon.zookeeper;

public class Gorilla extends Mammal{
	public Gorilla() {
		super.displayEnergyLevel();
		System.out.println("A new gorilla has arrived");
	}
	
	public void throwSomething(){
		super.setEnergyLevel(super.getEnergyLevel()-5);
		System.out.println("The gorilla has thrown a rock!");
	}
	public void eatBananas(){
		super.setEnergyLevel(super.getEnergyLevel()+10);
		System.out.println("The gorilla has eaten a delicious banana.");
	}
	public void climb(){
		super.setEnergyLevel(super.getEnergyLevel()-10);
		System.out.println("The gorilla has climbed up the tree.");
	}
}
