//Using interface reference only overriden methods present in an implementing class can be accessed.Specialized method cannot be accesed
package com.interfaces;

interface Tes4 {
	void m1();
}

class High2 implements Tes4 {
	public void m1() {
		System.out.println("Hi hello");
	}

	public void m2() {
		System.out.println("specialized method");
	}
}

public class Rule7 {

	public static void main(String[] args) {
		Tes4 i = new High2();
		i.m1();
		//i.m2(); error
	}

}
