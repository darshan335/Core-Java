package com.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class UsingIterator {

	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<>();
		l.add(10);
		l.add(540);
		l.add(30);
		l.add(50);
		l.add(130);
		l.add(1043);
		System.out.println(l);
		Iterator itr = l.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
