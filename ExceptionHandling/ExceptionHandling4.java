package com.exceptionhandling;

import java.util.Scanner;

class Excep{
	public void alpha() {
		System.out.println("Connection-2 established");
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter numerator : ");
		int a = scan.nextInt();
		System.out.print("Enter denominator : ");
		int b=scan.nextInt();
		int sum = a/b;
		System.out.println("sum = "+sum);
		System.out.println("connection-2 terminated");
	}
}
public class ExceptionHandling4 {

	public static void main(String[] args) {
		System.out.println("Connection-1 established");
		Excep e = new Excep();
		try {
		e.alpha();
		}catch(ArithmeticException e1) {
			System.out.println("Handled");
		}
		System.out.println("connection-1 terminated");
	}

}
