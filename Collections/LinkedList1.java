package com.collections;

import java.util.LinkedList;

public class LinkedList1 {

	public static void main(String[] args) {
		LinkedList l = new LinkedList<>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.addFirst("hi");
		l.addLast("Hello");
		System.out.println(l);
		System.out.println(l.peek());
		System.out.println(l);
	}

}
