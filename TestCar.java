package com.corejava;

public class TestCar {
	
	int x = 20;
	boolean isTested ;
	static int y = 20;
	
	Car c5 = new Car();
	static Car c6 = new Car();
	


	public static void main(String[] args) {
		System.out.println(c6.colour);
		c6.colour = "black";
		
		/*
		int x;		
		x = 20;
		
		Car c;
		
		c = new Car();
		
		System.out.println(c);
		
		c.colour = "white";
		c.engineCapacity = 1000;
		c.fuelType = "Petrol";
		c.isAutomatic=true;		
		c.drive();
		c.fillFuel();
		
		//System.out.println(c.noOfWheels);
		System.out.println(Car.noOfWheels);
		
		//c.noOfWheels = 5;
		
		//System.out.println(c.engineCapacity);
		
		Car.wipeGlass();
		
		System.out.println("================");
		
		Car c1;	
		
		c1 = new Car();
		
		System.out.println(c1);
		
		c1.colour = "Black";
		c1.engineCapacity=1500;
		c1.fuelType="Diesel";
		c1.isAutomatic=false;
		
		
		c1.drive();
		c1.fillFuel();
		
		System.out.println(c1.noOfWheels);
		
		Car.wipeGlass();
		
		*/
		
		Car c2 = new Car();
		
		c2.colour="black";
		c2.fuelType="petrol";
		c2.isAutomatic=true;
		
		Car c3 = new Car();
		
		c3.colour="white";
		c3.fuelType="Diesel";
		c3.isAutomatic=false;
		
		
		c2.drive();		
		c3.drive();
		
		
		c2=c3;
		
		System.out.println("================");
		
		c2.drive();		
		c3.drive();
		
		//c3=null;
		
		
		c3.drive();
		
		
		
	}

	
	
}
