//Rule 5 : A class can partially implement interface in that case class should be declared as abstract
package com.interfaces;
interface I6{
	void m1();
	void m2();
}
abstract class Tes3 implements I6{
	public void m1() {
		System.out.println("hi");
	}
}
public class Rule5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
