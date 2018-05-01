package com.rodoleon.ObjectMaster;

public class HumanTest {

	public static void main(String[] args) {
		Human Dummy1 = new Human();
		Human Dummy2 = new Human();
		Human Dummy3 = new Human();
		Dummy1.showStats();
		Dummy2.attackHuman(Dummy1);
		Dummy2.attackHuman(Dummy1);
		Dummy1.showStats();
		Ninja Ninja1 = new Ninja();
		Wizard Blackwizard = new Wizard();
		Samurai Kensei = new Samurai();
		Ninja1.runAway();
		Ninja1.runAway();
		Ninja1.runAway();
		Ninja1.stealHealth(Dummy1);
		Ninja1.attackHuman(Dummy1);
		Ninja1.showStats();
		Dummy1.showStats();
		Blackwizard.castFireball(Dummy2);
		Blackwizard.castFireball(Dummy2);
		Dummy2.showStats();
		Blackwizard.healHuman(Dummy2);
		Dummy2.showStats();
		Kensei.attackHuman(Dummy3);
		Kensei.doDeathblow(Dummy3);
		Kensei.howMany();
		Kensei.meditate();
		Kensei.howMany();
		Blackwizard.healHuman(Dummy2);
		}
}