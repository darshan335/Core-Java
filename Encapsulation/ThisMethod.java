package com.encapsulation;

class Demo {
	public Demo() {
		this(10);
		System.out.println("1st constructor");
	}

	Demo(int a) {
		this("java");
		System.out.println("2nd constructor" + a);
	}

	Demo(String b) {
		System.out.println(b);
	}
}

public class ThisMethod {

	public static void main(String[] args) {
		Demo d= new Demo();
	}

}
//Output
//java
//2nd constructor10
//1st constructor
