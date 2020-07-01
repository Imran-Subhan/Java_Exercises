package com.qa.execise5_garage;

public class Truck extends Vehicle {
	
	public Truck(String model, int wheels , int year, String colour, int speed) {
		super(model, wheels, year, colour, speed);
		
	}

	public void drive() {
		System.out.println("brrrr brrr");
	}

	@Override
	public String toString() {
		return "Truck [wheels=" + wheels + ", year=" + year + ", colour=" + colour + ", speed=" + speed + ", model="
				+ model + "]";
	}

}