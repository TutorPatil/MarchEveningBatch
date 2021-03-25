package com.corejava.oops;

public class Student {
	
	String name;
	int std;		
	Address a;
	static String  schoolName = "govt primary school MG Road";
	
	/*
	 * The constructor is a method like entity
	 * The name of the constructor is same as the name of  the class
	 * It will not have any return type
	 * It may or may not take arguments
	 * If there is no constructor in a call , then the compiler will add the default constructor
	 * 
	 * 
	 */
	
	public Student()
	{
		System.out.println(" inside the default constructor.....");
		
	}




	public Student(String name, int std, Address a) {
		
		this.name = name;
		this.std = std;
		this.a = a;
	}




	public String getStudentDetails()
	{	
		int x = 10;
		System.out.println(a.area);
		System.out.println(a.city);
		return (name+"--"+std);		
	}
	
	public static void getSchoolName()
	{
		System.out.println("student is from "+schoolName);
	}
	

}
