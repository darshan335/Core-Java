package com.inheritance;
class A{
	public void m1() {
		System.out.println("Parent class");
	}
	A(){
		System.out.println("constructor");
	}
	{
		System.out.println("Non static");
	}
	static {
		System.out.println("static");
	}
}
class B extends A{
	
}
public class DemonstrationOfInheritance {

	public static void main(String[] args) {
		B b = new B();
		b.m1();
	}

}
