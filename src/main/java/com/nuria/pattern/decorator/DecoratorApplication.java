package com.nuria.pattern.decorator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DecoratorApplication {

	public static void main(String[] args) {

		SpringApplication.run(DecoratorApplication.class, args);

		Door oakBeveledLacqueredDoor = new LacqueredDoor(new BeveledDoor( new PlainOakDoor()));
		System.out.println("\nDoor: "+oakBeveledLacqueredDoor.getDescription());
		System.out.println("Cost: "+oakBeveledLacqueredDoor.getCost());

		System.out.println("===========================================");

		Door oakBeveledDoor = new BeveledDoor(new PlainOakDoor());
		System.out.println("\nDoor: "+oakBeveledDoor.getDescription());
		System.out.println("Cost: "+oakBeveledDoor.getCost());
	}
}
