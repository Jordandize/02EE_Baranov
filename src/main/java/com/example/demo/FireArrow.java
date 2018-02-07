package com.example.demo;

public class FireArrow extends Arrow{

	private int firePower;
	private int duration;
	
	public FireArrow() {
		firePower = 2;
		duration = 5;
	}
	
	public void hit() {
		super.hit();
		System.out.println("... and hits "
							+ firePower 
							+ " for " 
							+ duration 
							+ " seconds by fire.");
	}
	
}
