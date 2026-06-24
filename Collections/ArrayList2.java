package com.collections;

import java.util.ArrayList;

public class ArrayList2 {

	public static void main(String[] args) {
		ArrayList al = new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		System.out.println(al);
		al.add(1,"pune");
		System.out.println(al);
		ArrayList a2 = new ArrayList<>();
		a2.add("Ramu");
		a2.add("Somu");
		System.out.println(a2);		
		a2.addAll(2,al);
		System.out.println(a2);
		System.out.println(a2.get(5));
	}

}
