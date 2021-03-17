package com.corejava;

public class March17_ClassesAndObjects {

	public static void main(String[] args) {
		
		//int sum = addNumbers(10, 20);
		//System.out.println(sum);
		System.out.println(joinNameAndAge("Ramu",25));
		System.out.println(joinNameAndAge(25,"Ramu"));
		
		char c = 'a';
		int m = 20;
		double d = 150.50;
		String s = "corejava";
		
		System.out.println(c);
		System.out.println(m);
		System.out.println(d);
		System.out.println(s);
		
	}
	
	public static int addNumbers(int x, int y)
	{
		int sum = ( x + y);
		return sum;
	}
	
	public static int addNumbers(int x)
	{
		int sum = ( x + 100);
		return sum;
	}
	
	public static int addNumbers()
	{
		int sum = ( 2100 + 100);
		return sum;
	}
	
	public static double addNumbers(int x, double y)
	{
		double sum = ( x + y);
		return sum;
	}
	
	public static int addNumbers(int x, int y,int z)
	{
		int sum = ( x + y + z);
		return sum;
	}
	
	
	
	public static String joinNameAndAge(String name, int age)
	{
		String s = (name + age);
		return s;
	}
	
	public static String joinNameAndAge(int age, String name)
	{
		String s = (name + age);
		return s;
	}

}
