package com.qa.execise5_garage;

public class Motorcycle extends Vehicle {
	
	public Motorcycle(String model, int wheels , int year, String colour, int speed) {
		super (model, wheels, year, colour, speed);
	
	}


	

	public void drive() {
		System.out.println("zoom");
		
	
	}

	@Override
	public String toString() {
		return "Motorcycle [wheels=" + wheels + ", year=" + year + ", colour=" + colour + ", speed=" + speed
				+ ", model=" + model + "]";
	}

}
