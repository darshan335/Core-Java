package com.collections;

import java.util.ArrayDeque;

public class ArrayDequee1 {

	public static void main(String[] args) {
		ArrayDeque aq = new ArrayDeque<>();
		aq.add(10);
		aq.add(20);
		aq.add(30);
		System.out.println(aq);
		aq.addFirst(20);
		System.out.println(aq);
		aq.pop();
		System.out.println(aq);
		aq.add(45);
		System.out.println(aq);
	}

}
