package com.corejava;

public class Car {

	String colour;
	int engineCapacity;
	String fuelType;
	boolean isAutomatic;
	static int noOfWheels = 4;
	
	public void drive()
	{
		//int x ;
		//System.out.println(x);
		System.out.println("The car of the colour "+colour +"Of the fuel type "+fuelType +"is been driven");
	}
	
	public void fillFuel()
	{
		System.out.println("The car of the colour "+colour +" has no fuel pls fill fuel "+fuelType);
	}
	
	public static void wipeGlass()
	{
		System.out.println("The car glass is wiped!!");
	}
	
}
