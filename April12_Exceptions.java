package com.corejava.oops;

import java.io.File;
import java.io.IOException;

public class April12_Exceptions {
	
	public static void main(String[] args) throws IOException  {
		
		
		int x = 10;
		int y=0;
		int z=0;
		 // z = (x/y); Exception occures and JVM stops...
		
		
		try {
			 System.out.println("inside the try block...");
			
			 int[] m = {1,2,3,4};
			 System.out.println(m[1]);
			 
		}
		catch(ArrayIndexOutOfBoundsException aio)
		{
			System.out.println("Inside the catch block for arrayIndex......");
			aio.printStackTrace();
		}
		catch(Exception e)
		{
			System.out.println("Inside the catch block...");
			e.printStackTrace();
		}
		try {
			z = (x/y);
		}catch (Exception e) {
				e.printStackTrace();
		}
		
		
		System.out.println("Out side of try catch block.....");
		System.out.println("The value of z is "+z);
		
		
		
		
//		File f = new File("D:\\sample.txt");
//	    f.createNewFile();
//		
		
		//int[] x = {10,20,30,40};		
		//System.out.println(x[10]);
	    
//	    String s = "selenium";
//	    
//	    //s=null;
//	    
//	    System.out.println(s.length());
//	    
//	    System.out.println(s.charAt(25));
//		
//		
		
		
	}
//		System.out.println("Starting the main method...");
//		int x = 20;
//		System.out.println(x);
//		method1();
//		System.out.println("Ending the main method....");

	
	public static void method1()
	{
		System.out.println("Starting the method1...");
		int y = 20;
		System.out.println(y);		
		method2();
		System.out.println("Ending the method1...");
	}
	

	public static void method2()
	{
		System.out.println("Starting the method2...");
		int z = 20;
		System.out.println(z);	
		method1();
		System.out.println("Ending the method2...");
	}

}
