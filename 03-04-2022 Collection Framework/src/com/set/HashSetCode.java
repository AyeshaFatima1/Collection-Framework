package com.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetCode {

	public static void main(String[] args) {
		HashSet<String>set=new HashSet();
		set.add("Saba");
		set.add("Ayesha");
		set.add("Sanvi");
		set.add("Vashnavi");
		System.out.println("Object of"+set);
		System.out.println("Add element:"+set.add("Pavani"));
		System.out.println("Add elemnet:"+set.add("Sanvi"));
		System.out.println("Elements:"+set);
		Iterator<String> itr=set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
