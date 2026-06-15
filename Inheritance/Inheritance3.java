package com.inheritance;
class Parent2{
	public void m1() {
		System.out.println("Parent class");
	}
	public void m3() {
		System.out.println("Inherited method");
	}
}
class Child2 extends Parent2{
	public void m1() {
		System.out.println("Overriden method from parent class");
	}
	public void m2() {
		System.out.println("Specialized method");
	}
}
public class Inheritance3 {

	public static void main(String[] args) {
		Child2 ch = new Child2();
		ch.m1();
		ch.m2();
		ch.m3();
	}

}
