package com.corejava;

public class TestCar {

	public static void main(String[] args) {		
		
		Car c = new Car();		
		c.colour = "white";
		c.engineCapacity = 1000;
		c.fuelType = "Petrol";
		c.isAutomatic=true;		
		c.drive();
		c.fillFuel();
		
		System.out.println("================");
		
		Car c1 = new Car();
		c1.colour = "Black";
		c1.engineCapacity=1500;
		c1.fuelType="Diesel";
		c1.isAutomatic=false;
		
		
		c1.drive();
		c1.fillFuel();
		
		
		
		
		
		
	}

}
