//Rule 8 : Using interface we can indirectly achieve multiple inheritance 
package com.interfaces;

interface I11 {
	void add();
}

interface I12 {
	void mul();
}

class T20 implements I11, I12 {
	public void add() {
		int a = 10;
		int b = 20;
		System.out.println("a+b= " + (a + b));
	}
	public void mul() {
		System.out.println("multip;ied");
	}
}

public class Rule8 {

	public static void main(String[] args) {
		T20 i = new T20();
		i.add();
		i.mul();
	}

}
