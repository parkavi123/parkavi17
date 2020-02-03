package org.call;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class A {
	public static void main(String[] args) {
		
		Map <Integer,String> li = new LinkedHashMap<Integer,String> ();
		
		//To add the values
		li.put(10,"Abinaya");
		li.put(20,"Pragathi");
		li.put(30,"Pragathi");
		li.put(40,"Sumathi");
		li.put(10,"Ravi");
		System.out.println(li);
		
		//To get the Particular Value
	String a =	li.get(20);
	System.out.println(a);
	
	// To check whether particular key is present or not
	boolean p = li.containsKey(10);	
	System.out.println(p);
	
	//To get Keys alone
	Set <Integer> s = li.keySet();
	System.out.println(s);
	
	//To get the Values alone
	Collection<String> C= li.values();
	System.out.println(C);
	
	//Iterations
	Set <Entry<Integer,String>> pa = li.entrySet();
	for(Entry<Integer,String>x:pa) {
		//To iterate the map
		System.out.println(x);
		//To iterate only Keys
		System.out.println(x.getKey());
		//To iterate only values
		System.out.println(x.getValue());
	}
	}
}


