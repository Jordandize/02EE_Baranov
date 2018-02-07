package com.example.demo;

public class Battleground {
	
	private Battleground() {
		System.out.println("Battleground default constructor.");
	}
	
	private static class BattlegroundHolder {
		static Battleground instance = new Battleground();
	}
	
	public static Battleground getInstance() {
		return BattlegroundHolder.instance;
	}

}
