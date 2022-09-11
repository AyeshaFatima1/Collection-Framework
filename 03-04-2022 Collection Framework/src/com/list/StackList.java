package com.list;

import java.util.Iterator;
import java.util.Stack;

public class StackList {

	public static void main(String[] args) {
		Stack<Integer> stack=new Stack<Integer>();
		stack.add(22);
		stack.add(24);
		stack.add(31);
		stack.add(26);
	    System.out.println("Stack Element:"+stack);
     	System.out.println("Add Element:"+stack.push(5));
		System.out.println("Stack Element:"+stack);
	    System.out.println("Peek Element:"+stack.peek());
		System.out.println("Search Element:"+stack.search(24));
	    System.out.println("Delete Element:"+stack.pop());
	    Iterator itr=stack.iterator();
	    while(itr.hasNext()) {
	    	System.out.println(itr.next());
	    }
	}

}
