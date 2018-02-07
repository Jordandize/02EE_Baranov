package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");
		@SuppressWarnings("unused")
		Battleground bg = (Battleground) context.getBean("battleground");
		Warrior w = (Warrior) context.getBean("braveArcher");
		w.fight();
	}
}
