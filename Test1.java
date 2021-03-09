package com.corejava;

public class Test1 {
	
	static int dept = 20;
	String manager = "Sreekanth";

	public static void main(String[] args) {
		
		int sal = 5000;
		System.out.println("This is another class...");
		System.out.println("Your salalry is "+sal);
		System.out.println("dept is "+dept);
		test();
	}
	
	public static void test()
	{
		
		System.out.println("Inside the test method..");
	}
	
	
	
	public void test1()
	{
		System.out.println(" inside the non static method...");
	}
}
