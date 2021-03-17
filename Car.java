package com.corejava;

public class Car {

	String colour;
	int engineCapacity;
	String fuelType;
	boolean isAutomatic;
	
	public void drive()
	{
		System.out.println("The car of the colour "+colour +"Of the fuel type "+fuelType +"is been driven");
	}
	
	public void fillFuel()
	{
		System.out.println("The car of the colour "+colour +" has no fuel pls fill fuel "+fuelType);
	}
}
