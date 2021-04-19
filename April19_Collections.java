package com.corejava.collections;

import java.util.*;
public class April17_Collections {

	public static void main(String[] args) {
		queueEx1();
	}
	
	
	public static void queueEx1()
	{
		Queue<String> pq = new PriorityQueue<String>();
		
		pq.add("selenium");
		pq.add("java");
		pq.add("testing");
		pq.add("automation");
		
		System.out.println(pq.peek());
		
		while(pq.size()>0)
		{
			System.out.println(pq.poll());
		}
		
		
		System.out.println(pq);
	}
	
	public static void setExample2Itr()
	{
		
		Set<String> hs = new HashSet<String>();
		hs.add("selenium");
		hs.add("java");
		hs.add("testing");
		hs.add("automation");
		System.out.println(hs);
		
		Iterator<String> itr = hs.iterator();
		
		while (itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		
	}
	
	public static void setExample1()
	{
		Set<String> hs = new HashSet<String>();  // Non sorted and insertion order not preserved and only unique values
		
		//Set<String> hs1 = new TreeSet<String>();  // Sorted and insertion order not preserved and only unique values ( The oBjects should be comparable to each other )
		
		
		hs.add("selenium");
		hs.add("java");
		hs.add("testing");
		hs.add("automation");
		System.out.println(hs.add("testing"));
		
		
		System.out.println(hs);
		
		for(String m : hs)
		{
			System.out.println(m);
		}
		
		String s = "classes";		
		String result="";
		
		for( int x=0; x<s.length();x++)
		{
			char c= s.charAt(x);
			String s1 = String.valueOf(c);
			if(!result.contains(s1))
			{
				result = result+c;
			}
		}
		
		System.out.println(result);
		
		System.out.println("===================");
	
		Set<Character> cSet = new HashSet<Character>();
		
		for( int x=0; x<s.length();x++)
		{
			char c= s.charAt(x);			
			cSet.add(c);
		}
		
		System.out.println(cSet);
		
		
		
		
		
		
	}
	
	public static void listExample2()
	{
		
		List<String> aList2 = new ArrayList<String>(); // default size will be 10; Initial capacity
		List<String> aList1 = new ArrayList<String>(20); // Giving initial capacity as 20
		
		
		List<String> aList5 = new ArrayList<String>(aList1);
		
		System.out.println(aList5);
		
		List<String> aList = new ArrayList<String>(); 
		
		
		
		aList.add("selenium");
		aList.add("java");
		aList.add("automation");
		aList.add(1, "testing");
		aList.remove(1);
		System.out.println(aList.contains("xyz"));
		
		System.out.println(aList);
		
		List<String> aList3 = aList.subList(0, 2);
		System.out.println(aList3);
		
		aList.set(0, "WebDriver");
		
		for(int x=0; x<aList.size();x++)
		{
			System.out.println(aList.get(x));
		}
		
		System.out.println("===============");
		
		for(String m :aList)
		{
			System.out.println(m);
		}
		

		
		
		
	}
	
	public static void listExample1()
	{
		List<String> al2 = new ArrayList<String>();
		
		al2.add("selenium");
		al2.add("java");
		al2.add("Mava");
		
		System.out.println(al2);
		
		al2.remove("Mava");
		
		System.out.println(al2);
		
		
		List<String> al3 = new ArrayList<String>();
		
		al3.add("testing");
		al3.add("devops");
		al3.add("webServices");
		
		al2.addAll(al3);
		
		System.out.println(al2.size());
		
		
		al2.removeAll(al3);
		
		System.out.println(al2.size());
		al2.addAll(al3);
		
		al2.retainAll(al3);
		
		System.out.println(al2.size());
		
		Object[] obj = al2.toArray();
		
		for(Object m :obj)
		{
			System.out.println(m);
		}
		
		List<Object> ObjList = Arrays.asList(obj);
		
		
	
	
		
		
		
	}

}
