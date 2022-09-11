package com.list;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListCode2 {

	public static void main(String[] args) {
		LinkedList<String> list=new LinkedList<String>();
		list.add("Ab");
		list.add("Ac");
		list.add("Ad");
		list.add("Ae");
		list.add("af");
		list.addFirst("Fa");
		list.addLast("Su");
		list.removeFirst();
		list.removeLast();
		System.out.println("LinkedList:"+list);
		System.out.println("Access first element"+list.getFirst());
		System.out.println("Access last element"+list.getLast());
		System.out.println("Deleted element"+list.remove(4));
		System.out.println("Finding size"+list.size());
		System.out.println("Finding position"+list.indexOf("Ad"));
		System.out.println("Finding position"+list.lastIndexOf("Ae"));
		Iterator itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
