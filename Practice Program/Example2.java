//Eg.2 Java Program to accept 2 numbers and performing all arithmetic operation
package com.gqt;

import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter 1st number : ");
		int a = scan.nextInt();
		System.out.print("Enter 2nd number : ");
		int b = scan.nextInt();
		
		//Addition
		System.out.println(a+" + "+b+" = "+ (a+b));
		
		//Subtraction
		System.out.println(a+" - "+b+" = "+ (a-b));
		
		//Multiplication
		System.out.println(a+" * "+b+" = "+ (a*b));
		
		//Division
		System.out.println(a+" / "+b+" = "+ (a/b));
		
		//Modulo Div
		System.out.println(a+" % "+b+" = "+ (a%b));
		
	}

}
// Output
//----------
// Enter 1st number : 3
// Enter 2nd number : 3
// 3 + 3 = 6
// 3 - 3 = 0
// 3 * 3 = 9
// 3 / 3 = 1
// 3 % 3 = 0
