package com.polymorphism;

class Tes2 {
	public void m1() {
		System.out.println("This is parent class with public access modifier");
	}
	private void m2() {
		System.out.println("Private");
	}
}
class Res extends Tes2{
//	private void m1() {
//		System.out.println("overrdiden method");
//	}
	 public void m1() {
		
	}
	 public void m2() {
		 System.out.println("Overridem fron private");
	 }
}

public class MethodOverridingRules {

	public static void main(String[] args) {
		Tes2 t = new Res();
		t.m1();
//		t.m2();
	}

}
