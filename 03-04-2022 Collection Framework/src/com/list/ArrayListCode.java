package com.list;

import java.util.Iterator;
import java.util.ArrayList;

public class ArrayListCode {

	public static void main(String[] args) {
		ArrayList<String>list=new ArrayList<String>();
		list.add("Ayesha");
		list.add("Sanvi");
		list.add("Vashnavi");
		list.add("Teju");
		list.add("Pavani");
		System.out.println("access element"+list.get(2));
		System.out.println("deleted element"+list.remove(4));
		System.out.println("finding size"+list.size());
		System.out.println("finding position"+list.indexOf("Ayesha"));
		System.out.println("finding position"+list.lastIndexOf("Ayesha"));
	/*Iterator itr=list.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}*/
	}
	

}
