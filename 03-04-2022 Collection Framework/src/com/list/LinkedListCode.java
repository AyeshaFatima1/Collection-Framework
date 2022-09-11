package com.list;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListCode {

	public static void main(String[] args) {
		LinkedList<Integer> list=new LinkedList<Integer>();
		list.add(22);
		list.add(24);
		list.add(31);
		list.add(24);
		list.add(5);
		list.addFirst(1);
		list.addLast(10);
		list.removeFirst();
		list.removeLast();
		System.out.println("LinkedList:"+list);
		System.out.println("Access first element"+list.getFirst());
		System.out.println("Access last element"+list.getLast());
		System.out.println("Deleted element"+list.remove(4));
		System.out.println("Finding size"+list.size());
		System.out.println("Finding position"+list.indexOf(24));
		System.out.println("Finding position"+list.lastIndexOf(24));
		Iterator itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
