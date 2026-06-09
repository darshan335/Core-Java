package com.gqt;

public class Array {

	public static void main(String[] args) {
		int[] a = { 10, 20, 30, 40, 50, 60 };
		System.out.println("Using for loop");
		System.out.println("-----------------");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println("\n--------------------");
		System.out.println("\nUsing for-each loop");
		System.out.println("-----------------");
		for (int x : a) {
			System.out.print(x+ " ");
		}
	}

}
//Output
//Using for loop
//-----------------
//10 20 30 40 50 60 
//--------------------
//
//Using for-each loop
//-----------------
//10 20 30 40 50 60 
