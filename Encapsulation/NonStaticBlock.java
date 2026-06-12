package com.encapsulation;

class Test {
	Test() {
		System.out.println("Constructor called");
	}

	{
		System.out.println("Non-static block called");
	}
}

public class NonStaticBlock {

	public static void main(String[] args) {
		Test t  = new Test();
	}

}
