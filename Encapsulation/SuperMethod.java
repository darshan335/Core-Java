package com.encapsulation;

class Parent {

	public Parent() {
		System.out.println("Called Parent constructor");
	}
}

class B extends Parent {
	public B() {
		super();//if we not use super method automatically jvm will call super method by default
		System.out.println("child class constructor");
	}
}

public class SuperMethod {

	public static void main(String[] args) {
		B b1 = new B();
	}

}
//Output
//Called Parent constructor
//child class constructor
