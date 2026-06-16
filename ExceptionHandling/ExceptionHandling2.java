package com.exceptionhandling;

import java.util.Scanner;

public class ExceptionHandling2 {

	public static void main(String[] args) {
		System.out.println("Connection Established");
		
			Scanner scan = new Scanner(System.in);
			System.out.print("Enter numerator : ");
			
			int a = scan.nextInt();
			System.out.print("Enter Denominator : ");
			int b = scan.nextInt();
			try {
			int sum = a / b;
			System.out.println("Sum = " + sum);
			
		} catch (Exception e) {
			System.out.println("Please enter non zero denominator");
		}
		System.out.println("Connection Terminated");
	}

}
//Output
//Connection Established
//Enter numerator : 10
//Enter Denominator : 0
//Please enter non zero denominator
//Connection Terminated