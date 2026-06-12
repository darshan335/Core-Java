package com.encapsulation;

class Test2 {
	Test2() {
		System.out.println("Constructor executed");
	}

	{
		System.out.println("Non static");
	}
	static {
		System.out.println("Static block");
	}
}

public class StaticBlock {

	public static void main(String[] args) {
		Test2 t = new Test2();
	}

}
//Output
//Static block
//Non static
//Constructor executed
