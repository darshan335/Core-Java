package com.inheritance;
class D{
	int i=100;
	public D() {
		System.out.println("HI");
	}
}
class F extends D{
	int i=10;
	F() {
		System.out.println(super.i);
		System.out.println(i);
	}
}
public class Inheritance2 {

	public static void main(String[] args) {
		F f= new F();
	}

}
