package com.corejava;

import java.util.Arrays;

public class April8_Strings {

	public static void main(String[] args) {
		
		String s = "java";
		
		System.out.println(s.length());
		
		String s1 = s.toUpperCase();
		
		System.out.println(s);
		
		System.out.println(s1);
		
		s1 = s1.toLowerCase();
		
		System.out.println(s.charAt(1));
		
		System.out.println(s.indexOf('v'));
		
		System.out.println(s.indexOf('a'));
		
		System.out.println(s.lastIndexOf('x'));
		
		for(int x=0; x<s.length();x++)
		{
			System.out.println(s.charAt(x));
		}
		
		System.out.println("===================");
		
		String rev = ""; // java
		for( int x=s.length()-1; x>=0;x--)
		{
			rev = rev+s.charAt(x);
		}
		
		System.out.println(rev);   // avaj
		
	System.out.println("+++++++++++++++++++++++++++++++++++++++");
	
	System.out.println(s.replace('a','b'));
	
	System.out.println(s.replace("ja", "ma")); // java
	
	String str = "classes";
	
	int counter = 0;
	
	for(int x=0; x<str.length();x++)
	{
		if (str.charAt(x) == 's')
		{
			counter++;
		}
	}

	System.out.println(counter);
	
	int len = str.length();
	
	String str1 = str.replace("s", "");
	 
	int len1= str1.length();
	
	int  occ = (len - len1);
		
	System.out.println(occ);
		
	System.out.println((str.length() - str.replace("s", "").length()));
		
	char[] c = s.toCharArray();	
	
	System.out.println(Arrays.toString(c));
	
	String s6 = " selenium ";
	
	s6 = s6.trim();
	
	System.out.println(s6.length());
	
	String s7 = "India is my country";
	
	String[] s8 = s7.split(" ");
	
	for( String m : s8)
	{
		System.out.println(m);
	}
	
	String s9 = "selenium";
	
	System.out.println(s9.substring(3));
	
	System.out.println(s9.substring(3, 6));
	
	String  s10 = "java";
	
	String s11 = "Java";
	
	
	System.out.println(s11.equals(s10));
	
	System.out.println(s11.equalsIgnoreCase(s10));
	
	
	
		

	}
	
	public static void stringexImmutability()
	{
		String s;
		
		s = "java";
		
		s = "Mava";
		
		String s1 ;
		
		s1 = new String("java");		
		s1 = new String("selenium");
	}
	
	public static void stringEx2Equality()
	{
		String s = "java" ;		
		String s1 = "java";
		
		System.out.println(s == s1);
		
		System.out.println(s.equals(s1));
		
		String s2 = new String("java");
		
		String s3 = new String("java");
		
		System.out.println(s2.equals(s3));
		
		System.out.println(s2==s3);
		
	}
	
	public static void stringEx1()
	{
		String s = "java" ;		
		String s1 = "Java";
		
		int[] x = {1,2,3,4};
		
		System.out.println(x);
		
		System.out.println(x.toString());
		
		System.out.println(s);
		
		System.out.println(s.toString());
		
		System.out.println(s.hashCode());	
		
		System.out.println(s1.hashCode());
	}

}
