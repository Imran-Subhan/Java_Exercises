package com.qa.execise5_garage;

public class Vehicle {
	
	/*Using Vehicle as a base class, create three derived classes 
	(car, motorcycle etc.), each derived class should have its own attributes in 
	addition to the normal Vehicle attributes.
	
	2 	Using a List implementation, store all your vehicles in a Garage class.
*/
	
	public int wheels;
	public int year;
	public String colour;
	public int speed;
	
	
	
	public Vehicle() {
		super();
	}

	public Vehicle(int wheels, int year, String colour, int speed) {
		super();
		this.wheels = wheels;
		this.year = year;
		this.colour = colour;
		this.speed = speed;
	}

	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	
	
}
