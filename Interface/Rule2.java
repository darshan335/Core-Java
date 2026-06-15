package com.interfaces;
// Rule 2 we cannot create object of an interface
//we can create reference type
interface Testing1{
	void m1();
}
class High implements Testing1{
	public void m1() {
		System.out.println("modified");
	}
}
public class Rule2 {

	public static void main(String[] args) {
		//Testing1 t = new Testing1();error
	Testing1 i = new High();
	i.m1();
	}

}
