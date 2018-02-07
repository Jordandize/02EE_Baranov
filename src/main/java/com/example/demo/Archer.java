package com.example.demo;

public class Archer implements Warrior {
	
	private int times;
	
	public Archer() {
		times = 1;
	}
	
	public Archer(int times) {
		this.times = times;
	}
	
	public void fight() {
		System.out.println("Archer shooted " + times + " times.");
	}
	
	public void aim() {
		System.out.println("-- enemy on the scope --");
	}
	
}
