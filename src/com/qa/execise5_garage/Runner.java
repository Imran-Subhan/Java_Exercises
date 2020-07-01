package com.qa.execise5_garage;

public class Runner  {
	
	public static void main(String[] args) {
		
		Garage garage = new Garage();
		
		garage.addVehicle(new Car("A5", 4, 2010, "Grey", 180));
		
		garage.addVehicle(new Motorcycle("Yamaha", 4, 2018, "Blue", 120)); 
		
		garage.addVehicle(new Truck("monster", 4, 2020, "Red", 40 ));{
		
		garage.printVehicles(); garage.getbill(); }
		
	

		
		
		
	}

}
