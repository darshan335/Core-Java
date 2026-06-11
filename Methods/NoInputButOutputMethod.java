package com.methods;

import java.util.Scanner;

class Method2 {
	public int add() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter 1st number : ");
		int a = scan.nextInt();
		System.out.print("Enter 2nd number : ");
		int b = scan.nextInt();
		return a + b;
	}
}

public class NoInputButOutputMethod {

	public static void main(String[] args) {
		Method2 m1 = new Method2();
		int sum = m1.add();
		System.out.println("Sum = " + sum);
	}

}
//Output
//Enter 1st number : 2
//Enter 2nd number : 2
//Sum = 4