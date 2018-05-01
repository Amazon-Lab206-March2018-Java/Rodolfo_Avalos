package com.rodoleon.pokemon;

public interface PokemonInterface {
	
	public Pokemon createPokemon(String name, int health, String type);
	void attackPokemon(Pokemon pokemon);
	String pokemonInfo (Pokemon pokemon);
}
