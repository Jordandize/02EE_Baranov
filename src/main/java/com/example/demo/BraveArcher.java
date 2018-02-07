package com.example.demo;

import java.util.Collection;

public class BraveArcher extends Archer {
	
	private BattleCry battleCry;
	private String heroName;
	private Collection<Weapon> weapons;
	private Object itsNull;
	
	public BraveArcher(BattleCry battleCry) {
		this.battleCry = battleCry;
	}
	
	public BraveArcher(int times, BattleCry battleCry) {
		super(times);
		this.battleCry = battleCry;
	}

	public void fight() {
		System.out.println("I am " + heroName + "!!!");
		super.fight();
		System.out.println("While fighting..");
		battleCry.shout();
		for(Weapon weapon: weapons)
			weapon.hit();
	}

	public String getHeroName() {
		return heroName;
	}

	public void setHeroName(String heroName) {
		this.heroName = heroName;
	}

	public Collection<Weapon> getWeapons() {
		return weapons;
	}

	public void setWeapons(Collection<Weapon> weapons) {
		this.weapons = weapons;
	}

	public Object getItsNull() {
		return itsNull;
	}

	public void setItsNull(Object itsNull) {
		this.itsNull = itsNull;
	}
	
}
