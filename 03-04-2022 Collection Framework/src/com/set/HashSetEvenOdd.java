package com.set;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSetEvenOdd {

	public static void main(String[] args) {
	//creating HashSet and adding elements
		HashSet<Integer>s=new HashSet<Integer>();
		s.add(1);
		s.add(3);
		s.add(6);
		s.add(8);
		HashSet<Integer>s1=new HashSet<Integer>();
		s1.add(2);
		s1.add(5);
		s1.add(9);
		s1.add(7);
		System.out.println("Elements of s:"+s);
		System.out.println("Elements of s1:"+s1);
		s.removeAll(s1);
		System.out.println("Odd Numbers:"+s);
		s1.removeAll(s);
		System.out.println("Even Numbers:"+s1);
		/*System.out.println(s);
		System.out.println(s1);*/
		
		/*LinkedHashSet<Integer> A=new LinkedHashSet<Integer>();
		LinkedHashSet<Integer> B=new LinkedHashSet<Integer>();
		A.add(1);
		A.add(3);
		A.add(5);
		A.add(7);
		A.add(11);
		
		B.add(2);
		B.add(4);
		B.add(6);
		B.add(8);
		B.add(10);
		
		System.out.println("Elements of A : " + A);
		System.out.println("Elements of B : " + B);
		
		A.removeAll(B);
		System.out.println("Odd numbers are : " + A);
		
		B.removeAll(A);
		System.out.println("Even numbers are : " + B);*/
	}

}
