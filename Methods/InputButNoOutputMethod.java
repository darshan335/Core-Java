package com.methods;

import java.util.Scanner;

class Method3 {
	public void add(int a, int b) {

		System.out.println("Sum = " + (a + b));
	}
}

public class InputButNoOutputMethod {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter 1st number : ");
		int a = scan.nextInt();
		System.out.print("Enter 2nd number : ");
		int b = scan.nextInt();
		Method3 m1 = new Method3();
		m1.add(a, b);
	}

}
//Output
//Enter 1st number : 2
//Enter 2nd number : 2
//Sum = 4
