package com.set;

import java.util.HashSet;

public class HashSetIntersection {

	public static void main(String[] args) {
		HashSet<Integer>s=new HashSet<Integer>();
		s.add(501);
		s.add(502);
		s.add(503);
		HashSet<Integer>s1=new HashSet<Integer>();
		s1.add(401);
		s1.add(502);
		s1.add(403);
		System.out.println("Elements of s:"+s);
		System.out.println("Elements of s1:"+s1);
		s1.retainAll(s);
		System.out.println("Intersection is:"+s1);
	}

}
