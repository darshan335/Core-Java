// Example:3 Accept any character from the keyboard and print it by attaching "Hello"
package com.gqt;

import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter any character : ");
		char ch = scan.next().charAt(0);
		System.out.println("Hello "+ch);
	}

}
// Output
//-----------
//Enter any character : D
//Hello D
