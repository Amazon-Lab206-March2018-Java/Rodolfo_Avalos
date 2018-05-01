package com.rodoleon.pokemon;

public class Pokemon {
	private String name;
	private int health;
	private String type;
	public static double PokemonCreated = 0;
	
	public Pokemon (String name, int health, String type) {
		this.name = name;
		this.health = health;
		this.type = type;
		PokemonCreated ++;
	}
	
	public String getName() {
		return name;
	}
	
	public int getHealth() {
		return health;
	}
	
	public String getType() {
		return type;
	}
	
	public void changeName(String name) {
		this.name = name;
	}
	
	public void changeHealth(int amount) {
		this.health = amount;
	}
	
	public void changeType(String newtype) {
		this.type = newtype;
	}
	
}
