package com.encapsulation;

class Demo2 {
	public void m1() {
		System.out.println("Non static block executed");
	}

	public static void m2() {
		System.out.println("Static block executed");
	}
}

public class StaticMethod {
	public static void main(String... args) {
		Demo2 d = new Demo2();
		Demo2.m2();
		d.m1();
	}
}
