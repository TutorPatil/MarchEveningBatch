package com.corejava;

public class March22_CoreJavaArrays {
	
	
	public static void main(String[] args) {
	
		// Array Declaration
		int[] x;  // int x[] or int []x;
		
		// Array Construction
		x = new int[4];
		
		// Array  Initialization
		x[0] = 10;
		x[1] = 20;
		x[2] = 30;
		x[3] = 30;
		
		for( int i=0; i<x.length;i++)
		{
			System.out.println(x[i]);
		}
		
		for( int m : x)
		{
			System.out.println(m);
		}
		
		System.out.println("===================");
		
		String[] str = new String[3];
		
		str[0] = "java";
		str[1] = "bhava";
		str[2] = "mava";
		
		for(int i=0; i < str.length;i++)
		{
			System.out.println(str[i]);
		}		
		
		for(String m : str)
		{
			System.out.println(m);
		}
	
		
		/*
		System.out.println(x[0]);
	
		System.out.println(x);
		
		
		System.out.println(x.length);
		
	
		System.out.println(x[3]);
		
		char[] c2 = new char[3];
		
		c2[0] = 'a';
		c2[1] = 'b';
		c2[2] = 'c';
		
		System.out.println(c2);
		
	
		double[] d = new double[4];
		
		d[0] = 12.12;
		d[1] = 45.45;
		d[2] = 25.25;
		d[3] = 35.35;
		
	System.out.println(d.length);
	
	System.out.println(d);
		*/
		
		System.out.println("++++++++++++++++++++++++");
		
		
		int[] rollNum = {10,20,30,0};
		
		System.out.println(rollNum.length);
		
		
		String[] strArray = {"java","selenium","Automation"};
		
		System.out.println(strArray[1]);
		
		
	
	}
	
	
	

}


