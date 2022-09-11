package com.set;

import java.util.TreeSet;

public class TreeSetCode {

	public static void main(String[] args) {
		TreeSet<String>se=new TreeSet<String>();
		se.add("Vashnavi");
		se.add("Sanvi");
		se.add("Ayesha");
		se.add("Pavani");
		System.out.println("Elements:"+se);
		System.out.println("First Element:"+se.first());
		System.out.println("Last Element:"+se.last());
		System.out.println("Remove First Element:"+se.pollFirst());
		System.out.println("Elements:"+se);
		System.out.println("Higher Element:"+se.higher("Sanvi"));
	System.out.println("Lower Element:"+se.lower("Ayesha"));
		System.out.println("Lower Element:"+se.lower("Sanvi"));
		System.out.println("Descending Elements:"+se.descendingSet());
		System.out.println("Remove Elements:"+se.remove("Pavani"));
		System.out.println("Elements:"+se);
		System.out.println("Add Element:"+se.add("Teju"));
		System.out.println("Elements:"+se);
		
	}

}
