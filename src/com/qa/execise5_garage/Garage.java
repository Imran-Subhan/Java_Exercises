package com.qa.execise5_garage;

import java.util.ArrayList;
import java.util.List;

public class Garage {
	
	// We store the vehicles 
	List<Vehicle> vehicles = new ArrayList<>();
	

	// We add vehicles 
	public void addVehicle(Vehicle vh) {
		vehicles.add(vh);
	}
	// We will print vehicles 
	public void printVehicles() {
		for (Vehicle v: vehicles) {
			System.out.println(v); }
	}
		
	public void getbill() {
		for(Vehicle v: vehicles) {
			if ( v instanceof Car); {
			System.out.println("Car price (£) " + v.speed * 470);}
			if (v instanceof Motorcycle); { 
				System.out.println("Motorcycle price (£) " + (v.wheels + 30) * 800);
			}
			if (v instanceof Truck); {
				System.out.println("Truck price (£) " + (v.year - 1000)*85);
		}
		break;
	}
	}
	public void removeVehicle(Vehicle vh) {
		vehicles.remove(vh); 
	}
	
	
	
	
}

	
	

	
	
	
			



