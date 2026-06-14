package com.polymorphism;

class Parent4 {
	public void m1() {
		System.out.println("This is parent class");
	}

	public void m2() {
		System.out.println("NOthing");
	}
}

class Child4 extends Parent4 {
	public void m1() {
		System.out.println("This is overriden method from parent class");
	}

	public void m3() {
		System.out.println("this is special method");
	}
}

public class Polymorphism3 {

	public static void main(String[] args) {
		Parent4 p = new Child4();//Upcasting
		p.m1();
//		p.m3(); error
		((Child4)(p)).m3();//Downcasting
		Child4 c = new Child4();
		c.m1();
		c.m2();
		c.m3();
	}

}
