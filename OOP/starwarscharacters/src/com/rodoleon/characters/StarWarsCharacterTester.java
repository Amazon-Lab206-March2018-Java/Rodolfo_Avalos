package com.rodoleon.characters;

public class StarWarsCharacterTester {

	public static void main(String[] args) {
		StarWarsCharacter Dummy = new StarWarsCharacter();
		StarWarsCharacter Yoda = new StarWarsCharacter("Yoda", 25,"Do or do not.");
		StarWarsCharacter C3P0 = new StarWarsCharacter("C3P0", 80,"Oh Dear");
		StarWarsCharacter Han = new StarWarsCharacter("Han Solo", 75,"Never tell me the odds");
		Han.greetAndMeet(C3P0);
		System.out.print(Yoda.getWords());
		C3P0.greetAndMeet(Yoda);
		Yoda.setWords("There is no try.");
		System.out.print(Yoda.getWords());
		System.out.println(Dummy.getName());
		System.out.println(Dummy.getWeight());
		System.out.println(Dummy.getWords());
		Dummy.greetAndMeet(Han);
	}
}
