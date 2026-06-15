package com.interfaces;

//Rule 1 : Variables in interface are automatically treated as "Public static final" and we cant modify
interface Inter {
	int i = 35;

	void m1();
}

class Inter1 implements Inter {
	public void m1() {
		// i=32;cant modify
		System.out.println("hi");
	}
}

public class Rule1 {

	public static void main(String[] args) {

	}

}
