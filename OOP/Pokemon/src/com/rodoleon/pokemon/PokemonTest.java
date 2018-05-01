package com.rodoleon.pokemon;

public class PokemonTest {

	public static void main(String[] args) {
		Pokedex poke = new Pokedex();
		Pokemon Charmander = poke.createPokemon("Charmander", 50, "Fire");
		Pokemon Pikachu = poke.createPokemon("Pikachu", 50, "Electric");
		Pokemon Bulbasaur = poke.createPokemon("Bulbasaur", 50, "Poison, Grass");
		System.out.println(poke.pokemonInfo(Charmander));
		System.out.println(poke.pokemonInfo(Pikachu));
		System.out.println(poke.pokemonInfo(Bulbasaur));
		poke.attackPokemon(Bulbasaur);
		System.out.println(poke.pokemonInfo(Bulbasaur));
	}

}
