package com.exceptionhandling;

import java.util.Scanner;

public class ExceptionHandling1 {

	public static void main(String[] args) {
		System.out.println("Connection Established");
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter numerator : ");
		int a = scan.nextInt();
		System.out.print("Enter Denominator : ");
		int b= scan.nextInt();
		int sum=a/b;
		System.out.println("Sum = "+sum);
		System.out.println("Connection Terminated");
	}

}
//Output
//Enter numerator : 10
//Enter Denominator : 0
//Exception in thread "main" java.lang.ArithmeticException: / by zero
//	at ObjectOrientation/com.exceptionhandling.ExceptionHandling1.main(ExceptionHandling1.java:14)

