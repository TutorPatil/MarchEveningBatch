package com.corejava.collections;

import java.util.*;

public class April20_HashMap {

	public static void main(String[] args) {
	
		
		Set<String> hs = new HashSet<String>();
		
		hs.add("selenium");
		hs.add("testing");
		hs.add("Automation");
		
		
		Iterator<String> itr = hs.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
	
	public static void hashMapEx4()
	{
		// Nitesh, 45, 999898, "QAManager",10
		// Venu , 48,454545,"DevManager", 12;
		// Geetha, 46,24242,"TechManager", 8;
		
		String[] names = {"Nitest","Venu","Geetha"};
		
		ArrayList alNitesh = new ArrayList();
		
		alNitesh.add(45);
		alNitesh.add(878787);
		alNitesh.add("Manager");
		alNitesh.add(10);;
		
		
		HashMap<String,ArrayList> hm = new HashMap<String,ArrayList>();
		
		hm.put(names[0], alNitesh);
		
		System.out.println(hm);
		
		
		
		
		
	}
	
	
	public static void hashMapEx3()	
	{
		String name = "Ramu";		
		ArrayList<String> alRamu = new ArrayList<String>();
		
		alRamu.add("Dasharath");
		alRamu.add("Ayodhya");
		alRamu.add("UP");
		
		String name1 = "Shamu";
		ArrayList<String> alShamu = new ArrayList<String>();
		
		alShamu.add("Vasudev");
		alShamu.add("Mathura");
		alShamu.add("UP");

		
		HashMap<String,ArrayList<String>> hm = new HashMap<String,ArrayList<String>>();
		
		hm.put(name,alRamu);
		hm.put(name1, alShamu);
		
		
		System.out.println(hm);
		
		
	}
	
	
	public static void hashMapEx2()
	{
		String s = "selenium";
		
		//String s1 = "classes";
		
		HashMap<Character, Integer> hm = new HashMap<Character,Integer>();
		
		for(int x=0; x<s.length();x++)
		{
			Character c = s.charAt(x);
			if(hm.containsKey(c))
			{
				Integer value = hm.get(c);
				hm.put(c,value+1);
			}
			else
			{
				hm.put(c,1);
			}
			
		}
		
		System.out.println(hm);
		
		
		
	}
	
	public static void hashMapEx1()
	{
		Map<Integer,String> hm = new HashMap<Integer,String>();
		
		hm.put(101, "Ramu");
		hm.put(102,"Shamu");
		hm.put(103, "Ravi");
		hm.put(104,"Rekha");
		hm.put(104,"Shankar");
		
		
		System.out.println(hm);		
		System.out.println(hm.get(102));		
		System.out.println(hm.keySet());		
		System.out.println(hm.values());		
		hm.remove(103);
		
		
		
		hm.replace(102, "Krishna");		
		System.out.println(hm);
		
		System.out.println(hm.containsKey(101));
		
		
		System.out.println(hm.containsValue("Ramu"));
		
		
		
	}

}
