package com.map;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapCode {

	public static void main(String[] args) {
		TreeMap<Integer,String> tm=new TreeMap<Integer,String>();
		tm.put(1, "Ayesha");
		tm.put(8, "Vashnavia");
		tm.put(6, "Sanvi");
		tm.put(2, "Neha");
		tm.put(4, "Sana");
		System.out.println("Elements:"+tm);
		System.out.println("Element at index 2 is "+tm.get(2));
		System.out.println("Contain Element: "+tm.containsKey(2));
		System.out.println("Replaced Element: "+tm.replace(3, "Tirumala"));
		System.out.println("Elements: "+tm);
		System.out.println("Removed Element: "+tm.remove(4));
		System.out.println("Element: "+tm);
		System.out.println("Ifabsent Element: "+tm.putIfAbsent(2, "Saba"));
		System.out.println("Entryset Element: "+tm.entrySet());
		Set s=tm.entrySet();
		Iterator itr=s.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
