package com.qa.execise5_garage;

public class Car extends Vehicle{
	
	
	
	
	
	public Car(String model, int wheels, int year, String colour, int speed) {
		super(model, wheels, year, colour, speed);
	}

	public void drive() {
		System.out.println("vroom");
		
	}

	@Override
	public String toString() {
		return "Car [wheels=" + wheels + ", year=" + year + ", colour=" + colour + ", speed=" + speed + ", model="
				+ model + "]";
	}
	
	
	

	
	
	
	

	
	

}
