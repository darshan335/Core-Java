package com.interfaces;

interface I1 {
	void m1();
}

class New2 implements I1 {
	public void m1() {
		System.out.println("Hi welcome to interface concept");
	}
}

public class Interface1 {

	public static void main(String[] args) {
		I1 i = new New2();
		i.m1();
	}

}
