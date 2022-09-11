package com.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetCode {

	public static void main(String[] args) {
	//creating HashSet and adding elements
		Set<Integer>s=new LinkedHashSet<Integer>();
		s.add(1);
		s.add(2);
		s.add(3);
		s.add(4);
		Set<Integer>s1=new LinkedHashSet<Integer>();
		s1.add(2);
		s1.add(4);
		s1.add(5);
		s1.add(7);
		System.out.println("Elements of s:"+s);
		System.out.println("Elements of s1:"+s1);
		s.addAll(s1);
		System.out.println("Union is:"+s);
		s.retainAll(s1);
		System.out.println("Intersection is:"+s);
		s.removeAll(s1);
		System.out.println("Difference is:"+s);
				
	}

}
