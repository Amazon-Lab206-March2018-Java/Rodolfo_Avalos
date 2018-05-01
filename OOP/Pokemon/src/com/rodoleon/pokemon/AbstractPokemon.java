package com.rodoleon.pokemon;

public class AbstractPokemon implements PokemonInterface {
	public Pokemon createPokemon(String name, int health, String type) {
		Pokemon newpoke = new Pokemon (name, health, type);
		return newpoke;
	}
	public void attackPokemon(Pokemon pokemon) {
		pokemon.changeHealth(pokemon.getHealth()-10);
	}

}
