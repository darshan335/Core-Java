package com.methods;

import java.util.Scanner;

class Method {
	public void add() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter 1st number : ");
		int a = scan.nextInt();
		System.out.print("Enter 2nd number : ");
		int b = scan.nextInt();
		System.out.println("Sum = " + (a + b));
	}
}

public class NoInputNoOutputMethod {

	public static void main(String[] args) {
		Method m1 = new Method();
		m1.add();
	}

}
//Output
//Enter 1st number : 2
//Enter 2nd number : 4
//Sum = 6
