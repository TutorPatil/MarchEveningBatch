package com.corejava;

public class Strings_April9 {
	
	public static void main(String[] args) {
		
		String s = "Selenium";
		String s1 = "Selenium";
		
		System.out.println(s.concat(s1));
		
		System.out.println(s.contains("ni"));
		
		System.out.println(s.startsWith("Se"));
		
		System.out.println(s.endsWith("m"));
		
		System.out.println(s.compareTo(s1)); // returns zero if string match
		
		int x = 1234;
		
		System.out.println(String.valueOf(x).length());
		
		double d = 10.25;
		
		System.out.println(String.valueOf(d).length());
		
		char[] c = {'j','a','v','a'};
		String str = new String(c);
		
		System.out.println(str);
		
		StringBuffer sb = new StringBuffer("selenium");
		
		//sb.append(" automation");
		
		sb.insert(1, 'b');
		System.out.println(sb);
		sb.insert(1, "java");
		
		
		System.out.println(sb);
		
		
		sb.setCharAt(1, 'm');
		
		
		System.out.println(sb);
		
		System.out.println(sb.reverse());
		
		String s2 = "selenium";
		
		StringBuffer sb1 = new StringBuffer(s2);
		
		sb1.reverse();
		
		
		System.out.println(sb1);
		
		sb1.delete(1, 3);
		
		System.out.println(sb1);
	}

}
