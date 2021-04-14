package com.corejava;

public class April14_WrapperClassesAndRecurssion {

	public static void main(String[] args) {
	
		int x = 20;
		
		Integer xObj = new Integer(x);  // Boxing or wrapping
		
		System.out.println(xObj.doubleValue());
		
		System.out.println(xObj.SIZE);
		
		System.out.println(xObj.TYPE);
		
		int y = xObj.intValue();  // Un boxing or unWrapping....
		
		System.out.println(Integer.MIN_VALUE);
		
		System.out.println(Integer.MAX_VALUE);
		
		String s = "1234";
		
		int x1 = 1234;
		
		System.out.println(String.valueOf(x1).length());
		

	}

}
