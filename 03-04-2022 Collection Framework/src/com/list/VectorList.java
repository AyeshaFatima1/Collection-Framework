package com.list;

import java.util.Iterator;
import java.util.Vector;

public class VectorList {

	public static void main(String[] args) {
		Vector<String> vector=new Vector<String>();
	  // Vector<Integer> vector2=new Vector<Integer>();
		vector.add("Ayesha");
		vector.add("Neha");
		vector.add("Vashnavi");
		vector.add("Sanvi");
		vector.add("Ayesha");
		vector.add("Teju");
		System.out.println("Adding Element"+vector.add("Fatima"));
		System.out.println("Adding "+vector.addAll(vector));
		System.out.println("finding size"+vector.size());
		System.out.println("finding position"+vector.indexOf("Sanvi"));
		System.out.println("finding position"+vector.lastIndexOf("Neha"));
		Iterator itr=vector.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		}

}
