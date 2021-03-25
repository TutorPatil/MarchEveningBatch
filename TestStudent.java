package com.corejava.oops;

import java.util.Arrays;

public class TestStudent {

	public static void main(String[] args) {
		
		Address a = new Address(420, "Aundh","Pune");
		
		Student s = new Student("Ramu",5,a);
		System.out.println(s.getStudentDetails());
		
		
		///s.name = "Ramu";
		//s.std = 5;
		
		
		
		System.out.println("=====================");
		
		Address a1 = new Address(500, "MgRoad","Bangalore");
		
		Student s1 = new Student("Shamu", 4,a1);
		System.out.println(s1.getStudentDetails());
		
		
		//s1.name = "Shamu";
		//s1.std = 4;
		

		
		
		
		
		
	
	}
	
	public static void arraysOfStudentClass()
	{
		Student s = new Student();
		s.name = "Ramu";
		s.std = 5;
		
		Student s1 = new Student();
		s1.name = "Shamu";
		s1.std = 4;
		
		Student[] sArray = new Student[2];
		
		///int[] x = new int[2];		
		//String[] sArr = new String[3];
		
		sArray[0] = s;
		sArray[1] = s1;
		
		
		for( int x = 0 ; x<sArray.length;x++)
		{
			System.out.println(sArray[x].name);
			System.out.println(sArray[x].getStudentDetails());
		}
		
		
		for( Student m : sArray)
		{
			System.out.println(m.getStudentDetails());
		}
		Student[] s3 = {s,s1};
		
		

	}

}
