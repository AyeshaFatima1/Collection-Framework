package com.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapCode {

	public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(1, "Ayesha");
		hm.put(5, "Vashnavia");
		hm.put(3, "Sanvi");
		hm.put(9, "Neha");
		System.out.println("Elements:"+hm);
		System.out.println("Element at index 2 is "+hm.get(2));
		System.out.println("Contain Element: "+hm.containsKey(2));
		System.out.println("Replaced Element: "+hm.replace(3, "Tirumala"));
		System.out.println("Elements: "+hm);
		System.out.println("Removed Element: "+hm.remove(4));
		System.out.println("Element: "+hm);
		System.out.println("Ifabsent Element: "+hm.putIfAbsent(3, "Saba"));
		System.out.println("Entryset Element: "+hm.entrySet());
		Set s=hm.entrySet();
		Iterator itr=s.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
