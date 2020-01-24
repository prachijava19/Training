package com.training;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Collections {
	
	
	public static void createMap()
	{
		Map<Integer,String> map = new HashMap<>();
		map.put(1, "sri");
		map.put(2, "krishna");
		map.put(3, "Govind");
		map.put(3, "murari");


		for(Map.Entry<Integer, String> ent : map.entrySet())
		{
			System.out.println(ent.getKey() + "   "+ ent.getValue());
		}
		
		for(String val : map.values())
		{
			System.out.println(val);
		}
		
		for(Integer key : map.keySet())
		{
			System.out.println(key);
		}
		
		System.out.println(map.get(2));
	}
	
	public static void createSet() {
		
		Set<String> set = new TreeSet<String>();
		set.add("hi");
		set.add("bye");
		set.add("hello");
		set.add("hello");
		for(String s : set)
		{
			System.out.println(s);
		}
		
	}
	
	public static void createList()
	{
		List<Integer> list =  new ArrayList<>();//upcasting
		list.add(11);
		list.add(22);
		list.add(33);
		list.add(44);
		list.add(155);
		
		for(Integer i: list) {
			System.out.println(i);
			list.add(167);
			
		}
		
		Iterator<Integer> it = list.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
		List<String> linkedlist =  new LinkedList<String>();//upcasting
		
		linkedlist.add("hi");
		linkedlist.add("hi");
		linkedlist.add("hi");
		
		for(String s : linkedlist)
		{
			
			
			System.out.println(s);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Collections.createList();
		//Collections.createSet();
		Collections.createMap();

	}

}
