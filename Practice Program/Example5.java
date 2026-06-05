// Example : 5 Accept any alphabet from the user. If it is uppercase, then convert it into lowercase and viceversa and attach welcome and print the character
package com.gqt;

import java.util.Scanner;

public class Example5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter any alphabet : ");
		char ch = scan.next().charAt(0);
		if (Character.isUpperCase(ch)) {
			System.out.println("Welcome " + Character.toLowerCase(ch));
		} else {
			System.out.println("Welcome " + Character.toUpperCase(ch));
		}
	}

}
// Output
//----------
// Enter any alphabet : a
// Welcome A
//-----------------
//Enter any alphabet : A
// Welcome a
