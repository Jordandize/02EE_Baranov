package com.example.demo;

public class Arrow implements Weapon{

	private int power;
	
	public Arrow() {
		power = 10;
	}
	
	public void hit() {
		System.out.println("Arrow hit enemy with power " + power + ".");
	}
	
}
