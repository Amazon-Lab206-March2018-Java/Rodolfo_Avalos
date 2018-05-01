package com.rodoleon.pokemon;

public class Pokedex extends AbstractPokemon{
	public String pokemonInfo(Pokemon name) {
		return ("This is the health of the pokemon: "+name.getHealth()+". This is the name of the pokemon: "+name.getName()+". This is the type of the pokemon: "+name.getType());
	}
}
